package com.example.yash.sqlapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.AlertDialog;
import android.database.Cursor;

public class MainActivity extends AppCompatActivity {


    DBhelper mydb;

    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    EditText et5;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb=new DBhelper(this);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        et5=(EditText)findViewById(R.id.et5);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        addData();
        showData();
        deleteRecord();
        updateRecord();
        searchRecord();

    }

    public void showMessage(String title,String message)
    {

        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setCancelable(true);
        alert.setTitle(title);
        alert.setMessage(message);
        alert.show();

    }

    public void addData()
    {
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String id=et1.getText().toString();
                String name=et2.getText().toString();
                String dept=et3.getText().toString();
                String mobile=et5.getText().toString();

                boolean ins =mydb.insertData(id,name,dept,mobile);
                if(ins==true)
                {
                    Toast.makeText(MainActivity.this,"Data of "+name+" Inserted ",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Data  Not Inserted ",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public void showData()
    {
        bt2.setOnClickListener(new View.OnClickListener() {
            //StringBuffer values;
            @Override
            public void onClick(View v) {

                Cursor cr=mydb.viewAll();
                int rs=cr.getCount();
                StringBuffer values=new StringBuffer();
                if(rs==-1)
                {
                    // show message
                    showMessage("Error "," No Records ");
                }
                else
                {

                    // show all the records
                    while(cr.moveToNext())
                    {
                        values.append("ID "+cr.getString(0) +"\n Name "+cr.getString(1)+"\n Dept "+cr.getString(2) +"\n Mobile "+cr.getString(3) +"\n\n");

                    }
                    showMessage("Data",values.toString());
                }


            }
        });
    }

    public void deleteRecord()
    {
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int deleterecord=mydb.deleteData(et4.getText().toString());
                if(deleterecord==0)
                {
                    Toast.makeText(MainActivity.this,"Not Deleted",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Deleted",Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public void updateRecord()
    {
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String id=et1.getText().toString();
                String name=et2.getText().toString();
                String dept=et3.getText().toString();
                String mobile=et5.getText().toString();

                boolean ins =mydb.updateData(id,name,dept,mobile);
                if(ins==true)
                {
                    Toast.makeText(MainActivity.this,"Data of "+name+" Updated ",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Data  Not Updated ",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public void searchRecord()
    {
        bt5.setOnClickListener(new View.OnClickListener() {
            //StringBuffer values;
            @Override
            public void onClick(View v) {

                Cursor cr=mydb.search(et4.getText().toString());
                int rs=cr.getCount();
                StringBuffer values=new StringBuffer();

                if (rs==1){
                    while (cr.moveToNext()) {
                        values.append("ID " + cr.getString(0) + "\n Name " + cr.getString(1) + "\n Marks" + cr.getString(2) +"\n Mobile"+cr.getString(3) + "\n\n");


                        showMessage("Data", values.toString());

                    }
                }

                else
                {
                    Toast.makeText(MainActivity.this,"Record not found ",Toast.LENGTH_LONG).show();
                }


            }
        });
    }

}
