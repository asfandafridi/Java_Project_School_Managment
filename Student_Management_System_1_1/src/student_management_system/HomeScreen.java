/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package student_management_system;

import javax.swing.JFrame;

/**
 *
 * @author kashan
 */
public class HomeScreen extends javax.swing.JPanel {
JFrame temp;
    /**
     * Creates new form HomeScreen
     */
    public HomeScreen(JFrame t) {
        initComponents();
        setSize(564,392);
        setLocation(400,100);
        
        temp=t;
    }

    HomeScreen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  //  HomeScreen(JFrame J) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("School Managemnet System");
        add(jLabel2);
        jLabel2.setBounds(0, 10, 490, 60);

        jButton9.setBackground(new java.awt.Color(255, 102, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setText("Room_Info");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9);
        jButton9.setBounds(10, 100, 210, 40);

        jButton8.setBackground(new java.awt.Color(255, 102, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setText("Class_Info");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8);
        jButton8.setBounds(10, 150, 210, 40);

        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("Employee_Info");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7);
        jButton7.setBounds(10, 200, 210, 40);

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Parents_Info");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(10, 250, 210, 40);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Student_Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(10, 300, 210, 40);

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Teacher_Info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(10, 350, 210, 40);

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Subject_Registration");
        jButton4.setMaximumSize(new java.awt.Dimension(73, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(10, 400, 210, 40);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 500, 210, 40);

        jButton12.setBackground(new java.awt.Color(255, 102, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setText("Fee");
        jButton12.setMaximumSize(new java.awt.Dimension(73, 25));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12);
        jButton12.setBounds(10, 450, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_management_system/depositphotos_231741522-stock-photo-group-high-school-students-wearing (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 620);

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton15.setText("Submit");
        add(jButton15);
        jButton15.setBounds(510, 620, 100, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        String title="Class";
        
        if(title.equals("Class")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(874,691);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            ClassForm s = new ClassForm(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);      
    }                                
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String title="addStudent";
        
        if(title.equals("addStudent")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(673,679);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            addStudent s = new addStudent(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);      
    }                                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
        String title="Logout";
        
        if(title.equals("Logout")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(564,352);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            LoginScreen s = new LoginScreen(frame);
            frame.add(s);
        //    this.setVisible(false);
                    
            frame.setVisible(true);      
    }                               
            
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
             String title="subject_registration";
        
        if(title.equals("subject_registration")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(748,449);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            subject_registration s = new subject_registration(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);      
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String title="Teachers";
        
        if(title.equals("Teachers")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(975,539);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            Teachers s = new Teachers(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
         String title="Parents";
        
        if(title.equals("Parents")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(941,551);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            Parents s = new Parents(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);      
    }                                
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
          String title="Rooms";
        
        if(title.equals("Rooms")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(826,468);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            Rooms s = new Rooms(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);      
    }                                
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         String title="employee_Info";
        
        if(title.equals("employee_Info")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(635,670);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            employee_Info s = new employee_Info(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);      
    }                              
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
      String title="Fee";
        
        if(title.equals("Fee")){
            temp.dispose();
            JFrame frame = new JFrame();
            frame.setSize(599,584);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            Fee s = new Fee(frame);
            frame.add(s);
            this.setVisible(false);
                    
            frame.setVisible(true);      
    }                                      
    }//GEN-LAST:event_jButton12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}