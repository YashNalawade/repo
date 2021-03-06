import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Menu1 extends javax.swing.JFrame {
 
    Connection con;
//    Statement stmt;
    PreparedStatement pstm;
    ResultSet res;
    String defaultpath="C:\\Users\\Yash\\Documents\\NetBeansProjects\\Parking Entry System\\qrcode\\";
    public Menu1() throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yash?autoReconnect=true&useSSL=false","root","1234");
        initComponents();
        setLocationRelativeTo(null);
        
     //       stmt=con.createStatement();
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Admin");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logout.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("IN");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OUT");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );

        jPanel7.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Parking2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(0, 0, 0))
        );

        jPanel7.add(jPanel3, "card2");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Mobile No.");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(130, 350, 128, 29);

        jButton3.setBackground(new java.awt.Color(0, 51, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(290, 460, 120, 50);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField1);
        jTextField1.setBounds(290, 350, 213, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Vehicle No.");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(120, 240, 135, 29);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField2);
        jTextField2.setBounds(290, 240, 220, 30);

        jLabel4.setBackground(new java.awt.Color(204, 153, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("New Entry");
        jLabel4.setToolTipText("");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(260, 50, 157, 44);

        jPanel8.setBackground(new java.awt.Color(0, 51, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(37, 37));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("X");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8);
        jPanel8.setBounds(710, 0, 40, 40);

        jPanel7.add(jPanel4, "card2");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Vehicle Exit");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(290, 70, 140, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Vehicle No");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(50, 190, 140, 20);

        jTextField3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel5.add(jTextField3);
        jTextField3.setBounds(230, 190, 200, 30);

        jButton5.setBackground(new java.awt.Color(0, 51, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("PAY");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(640, 190, 80, 40);

        jButton6.setBackground(new java.awt.Color(0, 51, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("UPLOAD");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(500, 190, 110, 40);

        jPanel6.setBackground(new java.awt.Color(0, 51, 204));
        jPanel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(710, 0, 40, 40);

        jPanel7.add(jPanel5, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try {
           res.close();
           pstm.close();
           con.close();
       }
        catch(Exception e){}
        this.setVisible(false);
        dispose();
        new Login().setVisible(true);
    //    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel4);
        jPanel7.repaint();
        jPanel7.revalidate();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        jTextField3.setText(""); 
        jPanel7.removeAll();
        jPanel7.repaint();
        jPanel7.revalidate();
        jPanel7.add(jPanel5);
        jPanel7.repaint();
        jPanel7.revalidate();  
       
       
    }//GEN-LAST:event_jButton2ActionPerformed
public static void createQRCode(String qrCodeData, String filePath,
			String charset, Map hintMap, int qrCodeheight, int qrCodewidth)
			throws WriterException, IOException {
		BitMatrix matrix = new MultiFormatWriter().encode(
				new String(qrCodeData.getBytes(charset), charset),
				BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hintMap);
		MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
				.lastIndexOf('.') + 1), new File(filePath));
	}


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().length()!=10){
           JOptionPane.showMessageDialog(rootPane,"Enter 10 Digit valid Mobile Number");
    
        }
        else if(jTextField2.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane,"Enter Vehicle Number ");
        }
        else{
        try {
            pstm=con.prepareStatement("insert ignore into entry values(?,?,?)");
            Calendar cal = Calendar.getInstance(); 
           java.sql.Timestamp timestamp = new java.sql.Timestamp(cal.getTimeInMillis());
//int r= pstm.executeUpdate();
            pstm.setString(1, jTextField2.getText());
            pstm.setString(2, jTextField1.getText());
            pstm.setTimestamp(3, timestamp);
            
            int r= pstm.executeUpdate();
           if(r>0)
           {
               JOptionPane.showMessageDialog(this, "Record Inserted Successfully");
                String qrCodeData = "Vehicle No : "+jTextField2.getText();
		String filePath = defaultpath+jTextField2.getText()+".jpg";
		String charset = "UTF-8"; // or "ISO-8859-1"
		Map hintMap = new HashMap();
		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

		createQRCode(qrCodeData, filePath, charset, hintMap, 300, 300);
		System.out.println("QR Code created : "+jTextField2.getText()+".jpg");
                JFrame frame = new JFrame();
                                frame.setSize(450,450);
                               frame.setLocationRelativeTo(null);
                ImageIcon icon = new ImageIcon(filePath);
                JLabel label = new JLabel(icon);
                frame.add(label);
               
                frame.pack();
                frame.setVisible(true);
               jTextField1.setText("");
               jTextField2.setText("");
               frame.setResizable(false);
           
          }
           else
           {
               JOptionPane.showMessageDialog(this, "Vehicle already parked with the same Number ");
           }
        } catch (SQLException | WriterException | IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        } }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
           
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
       if(Character.isLowerCase(c)){
           evt.setKeyChar(Character.toUpperCase(c));
       }
        
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        

        try {
            
            pstm=con.prepareStatement("Select * from entry where Vehicle_No=?");
              pstm.setString(1, jTextField3.getText());
             res=pstm.executeQuery();
            if(res.next()){
      
                String Vehicle=(res.getString(1));
          
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Timestamp date=res.getTimestamp(3);
              
                 Calendar cal = Calendar.getInstance();
                java.sql.Timestamp timestamp = new java.sql.Timestamp(cal.getTimeInMillis());
                Timestamp d1 = timestamp;
                Timestamp d2 = date;
                long diffMs = d1.getTime() - d2.getTime();
                long diffSec = diffMs / 1000;
                long hour=diffSec/3600;
                    String hr=String.valueOf(hour);
                       String amt=String.valueOf(2*hour);
   
                       int confirm=JOptionPane.showConfirmDialog(null, "Fees Paid Successfully !! Thank You !", "Success", JOptionPane.OK_CANCEL_OPTION);
                        if(confirm==JOptionPane.OK_OPTION){
                            pstm=con.prepareStatement("delete from entry where Vehicle_No=?");
                            pstm.setString(1, jTextField3.getText());
                            File file = new File(defaultpath+jTextField3.getText()+".jpg");
                            boolean b = file.delete();
                            if(b==true)
                                System.out.println("Deleted : "+jTextField3.getText()+".jpg");
                            
                            
             
            int r=pstm.executeUpdate();
            if(r>0){
                
                            if(hour>0){
                   new Receipt(Vehicle,sdf.format(date),sdf.format(timestamp),hr," Rs "+amt).setVisible(true);
               }else{
                   new Receipt(Vehicle,sdf.format(date),sdf.format(timestamp),hr," Rs. 2").setVisible(true);
               }
     
            }   else{
                JOptionPane.showMessageDialog(this, "ERROR");
            }          
           
                        }
  
            }else{
                                JOptionPane.showMessageDialog(this, "This Vehicle wasn't Registered at Entry Gate");
                                jTextField3.setText("");

            }
            // jTextField3.gettext();
        } catch (SQLException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
       if(Character.isLowerCase(c)){
           evt.setKeyChar(Character.toUpperCase(c));
          
       }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
  public static String readQRCode(String filePath, String charset, Map hintMap) throws FileNotFoundException, IOException, NotFoundException {
      Result qrCodeResult;
        try (FileInputStream fin = new FileInputStream (filePath)) {
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
                    new BufferedImageLuminanceSource(
                            ImageIO.read(fin))));
            qrCodeResult = new MultiFormatReader().decode(binaryBitmap,
                    hintMap);
                fin.close();
        }
                return qrCodeResult.getText();
	
  }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        
        
    JFileChooser fileopen = new JFileChooser(defaultpath);

    fileopen.setPreferredSize(new Dimension(600,400));
    FileFilter filter = new FileNameExtensionFilter("jpg files", "jpg");
    fileopen.addChoosableFileFilter(filter);

    int ret = fileopen.showDialog(null, "Open file");
    
    String filePath=defaultpath+fileopen.getSelectedFile().getName();
    String charset = "UTF-8";
    Map hintMap = new HashMap();
    
    switch (ret) {
    case JFileChooser.APPROVE_OPTION:
    
      System.out.println("Reading : "+ fileopen.getSelectedFile().getName());
      
            try {
                
                jTextField3.setText((readQRCode(filePath, charset, hintMap)).substring(13));
            } catch (IOException | NotFoundException ex) {
                Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            
    
    }
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        try
        {
            res.close();
            pstm.close();
            con.close();
        }
        catch(Exception e){}
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        try
        {
            res.close();
            pstm.close();
            con.close();
        }
        catch(Exception e){}
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu1().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
