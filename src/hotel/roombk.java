/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author siddhant
 */
public class roombk extends javax.swing.JFrame {
    

    /**
     * Creates new form roombk
     */
    public roombk() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        D1 = new javax.swing.JDialog();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        D3 = new javax.swing.JDialog();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dd = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        D1.setBounds(new java.awt.Rectangle(200, 200, 295, 160));
        D1.setMinimumSize(new java.awt.Dimension(289, 137));
        D1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        D1.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Room booked succesfully!");
        D1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 170, -1));
        D1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 140));

        D3.setBounds(new java.awt.Rectangle(200, 200, 295, 160));
        D3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("ok");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        D3.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ERROR!");
        D3.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));
        D3.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 140));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Check In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Check Out");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 20));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No.", "Room type", "Bed type", "Tarrif"
            }
        ));
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 406, 142));

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 69, -1));

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 69, -1));

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 70, -1));

        dd.setText("2017/07/11");
        getContentPane().add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 140, -1));

        ad.setText("2017/07/11");
        getContentPane().add(ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("YYY/MM/DD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("YYY/MM/DD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Apurv Pandey\\Documents\\NetBeansProjects\\hotel\\New folder\\Serenity (1).jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 230));

        l1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Apurv Pandey\\Documents\\NetBeansProjects\\hotel\\New folder\\blue.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 500, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     */
   
   
    //public class bookclass{
        public void  bookfun()
    {
       //DefaultTableModel model = (DefaultTableModel)table1.getModel();
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
         
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","admin");
        
            Statement stmt=conn.createStatement();
            
            int roomno = (int) table1.getValueAt(table1.getSelectedRow(), 0);
            
            String sql="insert into booked values( "+ roomno + "," + "'booked'" + ", '"+ad.getText() +"'"+", '"+dd.getText()+"' )" +";";
            
            stmt.executeUpdate(sql);
           // model.removeRow(table1.getSelectedRow());
            
         //   dispose();
           
            System.out.println("SUCCESFULL");
            
         }
         catch(Exception e)
         {
             D3.setVisible(true);
              System.out.println("ERROR roombk ka : " + e);
             
         }
        
    }
        public void bookfun2()
        {
            // DefaultTableModel model = (DefaultTableModel)table1.getModel();
             booking bok =new booking();
            
             DefaultTableModel model2 = (DefaultTableModel)bok.table2.getModel();
            try
            {
            Object[] row = new Object[4];
            row[0]= table1.getValueAt(table1.getSelectedRow(), 0);
            row[1]= table1.getValueAt(table1.getSelectedRow(), 1);
            row[2]= table1.getValueAt(table1.getSelectedRow(), 2);
            row[3] =table1.getValueAt(table1.getSelectedRow(), 3);
            
             model2.addRow(row);
            
            bok.setVisible(true);
            }
            catch(Exception e)
            {
                D3.setVisible(true);
                System.out.println("ERROR : " + e);
            }
            
        }
    
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         DefaultTableModel model = (DefaultTableModel)table1.getModel();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
         
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","admin");
        
            Statement stmt=conn.createStatement();
            
            String sql="Select room_number,room_type,bed_type,tarrif from ( select bb.room_no,b.room_no as room_number,room_type,bed_type,tarrif from book b left join booked bb on b.room_no=bb.room_no ) as t where room_no is null "+ ";";
          
            ResultSet rs =stmt.executeQuery(sql); 
            
            //if(rs.next()==false)
              //  l1.setText("All rooms are booked");
            
            int roomno,tarrif;
            String roomtype,bedtype;
            while(rs.next())
            {
             roomno=rs.getInt("room_number");
             roomtype=rs.getString("room_type");
             bedtype=rs.getString("bed_type");
             tarrif=rs.getInt("tarrif");
             
             model.addRow(new Object[] {roomno,roomtype,bedtype,tarrif});
            }
            
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("SUCCESFULL");
            
         }
         catch(Exception e)
         {
              D3.setVisible(true);
              System.out.println("ERROR : " + e);
             
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //bookclass b =new bookclass();
      dispose();
      bookfun();
      bookfun2();
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        
        dispose();
        new my().setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         D1.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        D3.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(roombk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roombk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roombk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roombk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roombk().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDialog D1;
    public javax.swing.JDialog D3;
    private javax.swing.JTextField ad;
    private javax.swing.JTextField dd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
