/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package student_management_system;

import javax.swing.JFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kashan
 */
public class addStudent extends javax.swing.JPanel {
JFrame J;
ConnectDB db = new ConnectDB();

    /**
     * Creates new form addStudent
     */
    public addStudent(JFrame t) {
        initComponents();
         setSize(673,679);
        setLocation(400,100);
        J=t;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        sclass = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dob = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        phone1 = new javax.swing.JTextField();

        setLayout(null);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));
        jPanel3.setForeground(new java.awt.Color(102, 255, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("                            Student Registration ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        add(jPanel3);
        jPanel3.setBounds(20, 10, 640, 65);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Gender");
        add(jLabel10);
        jLabel10.setBounds(90, 360, 62, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Date of Birth");
        add(jLabel11);
        jLabel11.setBounds(80, 410, 120, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Address");
        add(jLabel8);
        jLabel8.setBounds(90, 260, 68, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Phone");
        add(jLabel7);
        jLabel7.setBounds(110, 470, 54, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("class");
        add(jLabel6);
        jLabel6.setBounds(100, 310, 100, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("first_name");
        add(jLabel5);
        jLabel5.setBounds(100, 150, 88, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("sid");
        add(jLabel4);
        jLabel4.setBounds(100, 110, 24, 25);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        add(id);
        id.setBounds(220, 100, 280, 40);
        add(name1);
        name1.setBounds(220, 150, 280, 40);
        add(sclass);
        sclass.setBounds(220, 300, 280, 40);
        add(pid);
        pid.setBounds(220, 500, 280, 40);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        add(address);
        address.setBounds(220, 250, 280, 40);

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        add(gender);
        gender.setBounds(220, 350, 280, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(510, 620, 100, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(380, 620, 100, 40);

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        add(dob);
        dob.setBounds(220, 400, 280, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(510, 620, 100, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("last_name");
        add(jLabel9);
        jLabel9.setBounds(90, 200, 100, 25);
        add(name2);
        name2.setBounds(220, 200, 280, 40);
        add(phone1);
        phone1.setBounds(220, 450, 280, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String title="Back";
        
        if(title.equals("Back")){
            J.dispose();
            JFrame frame = new JFrame();
            frame.setSize(941,558);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            HomeScreen s = new HomeScreen(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);      
    }                             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
       
        int sid = Integer.parseInt(id.getText());
        String sname1 = name1.getText();
        String sname2 = name2.getText();
        String saddress = address.getText();
         String ssclass = sclass.getText();
          String sgender = gender.getText();
          int sdob = Integer.parseInt(dob.getText());
           String sphone = pid.getText();
            int spid = Integer.parseInt(pid.getText());
            
      
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con = DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/student_management_system","root","root");  
       Statement stmt = con.createStatement();
       String query = "insert into student values ('"+sid+"', '"+sname1+"', '"+sname2+"', '"+saddress+"',"
               + " '"+ssclass+"', '"+sgender+"', '"+sdob+"', '"+sphone+"', '"+spid+"')";
       int b = stmt.executeUpdate(query);
        
             /*String sql = new StringBuilder().
                    append("INSERT INTO student(student_id, first_name, last_name, address, class, gender, Date_of_birth, phone_no) VALUES (").
                    append(sid).
                    append(", \'").append(sname1).append("\', \'").append(sname2).
                    append("\', \'").append(saddress).append("\', \'class0\', \'male\', ").
                    append(sdob).
                    append(", \'").append(sphone).toString();*/
            
//            String sql = "INSERT into student (student_id, first_name) VALUES (3, \'asfand\')";

       
    } catch (Exception ex) {
        Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField sclass;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
