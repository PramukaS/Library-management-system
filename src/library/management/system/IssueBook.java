/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author ACER
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
        showTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        isbm = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        name1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        regno1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        name2 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        regno2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        name3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        regno3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        regno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        issuedate = new org.jdesktop.swingx.JXDatePicker();
        jLabel19 = new javax.swing.JLabel();
        issueid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(80, 213, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(80, 213, 183));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(isbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 222, 31));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 222, 31));
        jPanel3.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 328, 31));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("ISBM Number");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Title");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 98, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Book ID");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 510, 190));

        jPanel4.setBackground(new java.awt.Color(80, 213, 183));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel4.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, 30));
        jPanel4.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 240, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Reg No");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Name");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Mobile No");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 98, -1));

        jPanel5.setBackground(new java.awt.Color(80, 213, 183));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        jPanel5.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, 30));
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 240, 30));
        jPanel5.add(regno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 220, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Reg No");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Name");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Mobile No");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 98, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 510, 220));

        jPanel6.setBackground(new java.awt.Color(80, 213, 183));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name2ActionPerformed(evt);
            }
        });
        jPanel6.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, 30));
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 240, 30));
        jPanel6.add(regno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 220, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Reg No");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Name");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Mobile No");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 98, -1));

        jPanel7.setBackground(new java.awt.Color(80, 213, 183));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name3ActionPerformed(evt);
            }
        });
        jPanel7.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, 30));
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 240, 30));
        jPanel7.add(regno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 220, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Reg No");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Name");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Mobile No");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 98, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 510, 220));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 510, 220));
        jPanel4.add(regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 220, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 510, 220));

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Issue Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, 30));

        jPanel8.setBackground(new java.awt.Color(80, 213, 183));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Issue Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Date of Issue");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel8.add(issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 200, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Issue ID");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel8.add(issueid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 220, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Issue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 98, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 510, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 750));

        jPanel2.setBackground(new java.awt.Color(6, 125, 104));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 730, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 770, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");

            String sql = "SELECT * FROM book WHERE id = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,(id.getText()));

            ResultSet rs = pstmt.executeQuery();

            if(rs.next())
            {
                isbm.setText(rs.getString("isbm_number"));
                title.setText(rs.getString("title"));
            }
            else{
                JOptionPane.showMessageDialog(null,"No book found");
                con.close();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");

            String sql = "SELECT * FROM students WHERE regno = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,(regno.getText()));

            ResultSet rs = pstmt.executeQuery();

            if(rs.next())
            {
                name.setText(rs.getString("name"));
                mobile.setText(rs.getString("mobile"));
            }
            else{
                JOptionPane.showMessageDialog(null,"No Student found");
                con.close();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
           
           String sql = "INSERT INTO issue (issue_id,book_id,isbm_number,title,stu_regno,stu_name,mobile_no,date_of_issue)" + "values(?,?,?,?,?,?,?,?)";
           
           PreparedStatement pstmt = con.prepareStatement(sql);
           pstmt.setString(1,null);
           pstmt.setInt(2,Integer.parseInt(id.getText()));
           pstmt.setInt(3,Integer.parseInt(isbm.getText()));
           pstmt.setString(4,title.getText());
           pstmt.setString(5,regno.getText());
           pstmt.setString(6,name.getText());
           pstmt.setInt(7,Integer.parseInt(mobile.getText()));
           pstmt.setDate(8, new java.sql.Date(issuedate.getDate().getTime()));
           
           pstmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"Successfully Issued!");
           con.close();
       
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
        showTableData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");

            String sql = "SELECT * FROM issue WHERE issue_id = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,(issueid.getText()));

            ResultSet rs = pstmt.executeQuery();

            if(rs.next())
            {
                id.setText(rs.getString("book_id"));
                isbm.setText(rs.getString("isbm_number"));
                title.setText(rs.getString("title"));
                regno.setText(rs.getString("stu_regno"));
                name.setText(rs.getString("stu_name"));
                mobile.setText(rs.getString("mobile_no"));
                issuedate.setDate(rs.getDate("date_of_issue"));

            }
            else{
                JOptionPane.showMessageDialog(null,"No Issue note found");
                con.close();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
           
           String sql = "UPDATE issue SET book_id = ? , isbm_number = ?, title = ?, stu_regno = ?, stu_name = ?, mobile_no = ?, date_of_issue = ? WHERE issue_id = ?";
           
           PreparedStatement pstmt = con.prepareStatement(sql);
           pstmt.setInt(8,Integer.parseInt(issueid.getText()));
           pstmt.setInt(1,Integer.parseInt(id.getText()));
           pstmt.setInt(2,Integer.parseInt(isbm.getText()));
           pstmt.setString(3,title.getText());
           pstmt.setString(4,regno.getText());
           pstmt.setString(5,name.getText());
           pstmt.setInt(6,Integer.parseInt(mobile.getText()));
           pstmt.setDate(7, new java.sql.Date(issuedate.getDate().getTime()));
           
           pstmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"Successfully Updated");
           con.close();
       
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
       showTableData();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        id.setText("");
        isbm.setText("");
        title.setText("");
        regno.setText("");
        name.setText("");
        mobile.setText("");
        issueid.setText("");
        issuedate.setDate(null);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
            
            String sql ="DELETE FROM issue WHERE issue_id = ?";
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,issueid.getText());
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
            con.close();
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        showTableData();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        LibrarianPanel ob = new LibrarianPanel();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed
    public void showTableData(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
            
            String sql = "SELECT * FROM issue";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JTextField isbm;
    private org.jdesktop.swingx.JXDatePicker issuedate;
    private javax.swing.JTextField issueid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField regno;
    private javax.swing.JTextField regno1;
    private javax.swing.JTextField regno2;
    private javax.swing.JTextField regno3;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
