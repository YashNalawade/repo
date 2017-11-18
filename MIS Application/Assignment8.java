

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Assignment8 implements ActionListener{
    
    
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton bt1,bt2,bt3,bt4,bt5,bt6;
    
      Connection con;
      ResultSet res;
      Statement stmt;
      PreparedStatement pstm;
    public Assignment8() throws ClassNotFoundException, SQLException {
    
        f=new JFrame("Student-Frame");
        f.setLayout(null);
        l1=new JLabel("Name");
        l1.setBounds(60,35,100,50);
     l2=new JLabel("Roll No");
     l2.setBounds(60,80,100,50);
     l3=new JLabel("Mobile");
     l3.setBounds(60,130,100,50);
     t1=new JTextField(10);
     t1.setBounds(125,47,200,25);
     t2=new JTextField(5);
     t2.setBounds(125,97,200,25);
     t3=new JTextField(10);
     t3.setBounds(125,147,200,25);
     bt2=new JButton("First Record");
     bt2.setBounds(150,200,120,50);
     bt1=new JButton("Previous");
     bt1.setBounds(10,200,120,50);
     bt3=new JButton("Next");
     bt3.setBounds(290,200,120,50);
     bt4=new JButton("Insert");
     bt4.setBounds(10,270,120,50);
     bt5=new JButton("Update");
     bt5.setBounds(150,270,120,50);
     bt6=new JButton("Delete");
     bt6.setBounds(290,270,120,50);
     
    f.add(l1);
    f.add(t1);
    f.add(l2);
    f.add(t2);
    f.add(l3);
    f.add(t3);
    f.add(bt1);
    f.add(bt2);
    f.add(bt3);
    f.add(bt4);
    f.add(bt5);
    f.add(bt6);
    f.setVisible(true);
    f.setSize(550,500);
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    bt3.addActionListener(this);
    bt4.addActionListener(this);
    bt5.addActionListener(this);
    bt6.addActionListener(this);
    
        Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yash?autoReconnect=true&useSSL=false", "root","1234");
            stmt=con.createStatement();
            res=stmt.executeQuery("Select * from test");
            
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
    
            
            if (ae.getSource()==bt2)  //First Record
            {
                try {
                    if(res.first()){
                    t1.setText(res.getString(1)+"");
                    t2.setText(res.getInt(2)+"");
                    t3.setText(res.getInt(3)+"");
                }}
                catch (SQLException ex) {
                    Logger.getLogger(Assignment7.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(ae.getSource()==bt1)  //Previous Record
            {
                try {
                    if(res.previous())
                    {
                        t1.setText(res.getString(1)+"");
                        t2.setText(res.getInt(2)+"");
                        t3.setText(res.getInt(3)+"");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(f,"Nothing here");
                    }
                }catch (SQLException ex) {
                    Logger.getLogger(Assignment8.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(ae.getSource()==bt3)  //Next Record
            {
                try {
                    if(res.next())
                    {
                        
                        t1.setText(res.getString(1)+"");
                        t2.setText(res.getInt(2)+"");
                        t3.setText(res.getInt(3)+"");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(f,"Nothing here");
                    }
                }catch (SQLException ex) {
                    Logger.getLogger(Assignment8.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (ae.getSource()==bt4)
            {
                try {
          
                String name=t1.getText();    
                int rno=Integer.parseInt(t2.getText());
                int mob=Integer.parseInt(t3.getText());
                pstm=con.prepareStatement("insert into test values(?,?,?)");
                pstm.setString(1, name);
                pstm.setInt(2, rno);
                pstm.setInt(3, mob);
                
                int r=pstm.executeUpdate();
                if(r>0)
                {
                    JOptionPane.showMessageDialog(f, "Record Inserted Successfully");
                }
                else
                {
                    System.out.println("Error inserting records");
                }  
            } catch (SQLException ex) {
                Logger.getLogger(Assignment8.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        
        }
            if (ae.getSource()==bt5)
            {
                try {
          
                String name=t1.getText();    
                int rno=Integer.parseInt(t2.getText());
                int mob=Integer.parseInt(t3.getText());
                pstm=con.prepareStatement("update test set mobile=? where (roll=? and name=?)");
                pstm.setString(3, name);
                pstm.setInt(2, rno);
                pstm.setInt(1, mob);
                
                int r=pstm.executeUpdate();
                if(r>0)
                {
                    JOptionPane.showMessageDialog(f, "Record Updated Successfully");
                }
                else
                {
                    System.out.println("Error Updating Record");
                }  
            } catch (SQLException ex) {
                Logger.getLogger(Assignment8.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        
        }
            
            
            if (ae.getSource()==bt6)
            {
                try {
          
                String name=t1.getText();    
                int rno=Integer.parseInt(t2.getText());
                int mob=Integer.parseInt(t3.getText());
                pstm=con.prepareStatement("delete from test where(name=? and roll=? and mobile=?)");
                pstm.setString(1, name);
                pstm.setInt(2, rno);
                pstm.setInt(3, mob);
                
                int r=pstm.executeUpdate();
                if(r>0)
                {
                    JOptionPane.showMessageDialog(f, "Record Deleted Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(f, "Error Deleting Record");
                }  
            } catch (SQLException ex) {
                Logger.getLogger(Assignment8.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        
        }
            
        } 
    
       
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Assignment8 r=new Assignment8();
    }
    
}  
    
    


