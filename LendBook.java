 
package librarymanagementapplication;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
public class LendBook extends javax.swing.JFrame {

 
    public LendBook() {
        initComponents();
        connect();
        book();
        issuebook_load();
    }
  
    
     public class BookItem{
        int id;
        String name;
        public BookItem(int id,String name){
            this.id=id;
            this.name=name;
        }
        public String toString(){
            return name;
        }
    }
   
 
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","");
        } catch (Exception ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
}

  public void book(){
    try{
        pst=con.prepareStatement("select * from book");
        rs=pst.executeQuery();
        jbook.removeAllItems();
        
        while(rs.next()){
          jbook.addItem(new BookItem(rs.getInt(1),rs.getString(2)));
        }
    }catch(Exception e){
        
    }
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jmemberid = new javax.swing.JTextField();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jcancel = new javax.swing.JButton();
        jadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jmembername = new javax.swing.JTextField();
        jissuedate = new com.toedter.calendar.JDateChooser();
        jreturndate = new com.toedter.calendar.JDateChooser();
        jbook = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Issue Book");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book");

        jmemberid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmemberid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmemberidKeyPressed(evt);
            }
        });

        jupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jdelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jdelete.setText("Delete");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jcancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcancel.setText("Cancel");
        jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelActionPerformed(evt);
            }
        });

        jadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jadd.setText("Add");
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Member ID", "Member Name", "Book", "Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Member ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Member Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Return date");

        jmembername.setText(" ");

        jbook.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jadd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8))
                                    .addComponent(jdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jmemberid, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jmembername)
                                            .addComponent(jissuedate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jreturndate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbook, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jmembername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jissuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jadd)
                            .addComponent(jupdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcancel)
                            .addComponent(jdelete))))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed
       String memberid=jmemberid.getText();
       BookItem bitem=(BookItem)jbook.getSelectedItem();
       
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
       String issuedate=sdf.format(jissuedate.getDate()); 
       
       SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/mm/dd");
       String returndatee=sdf1.format(jreturndate.getDate());  
       
        try{
            pst=con.prepareStatement("insert into lendbook (memberid,bookid,issuedate,returndate) values (?,?,?,?)");
            pst.setString(1, memberid);
            pst.setInt(2, bitem.id);
            pst.setString(3, issuedate);
            pst.setString(4, returndatee);
            
            int k=pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null, "book Issued");
                jmemberid.setText("");
                jbook.setSelectedItem(-1);
                jmembername.setText("");
                jmemberid.requestFocus();
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error in insertion of data");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jaddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
     
     int id=Integer.parseInt(d1.getValueAt(selectedIndex, 0).toString());
     jmemberid.setText(d1.getValueAt(selectedIndex, 1).toString());
    // jaddress.setText(d1.getValueAt(selectedIndex, 2).toString());
     //jedition.setText(d1.getValueAt(selectedIndex, 3).toString());
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
     
        DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
        int selectedIndex=jTable1.getSelectedRow();
     
        int id=Integer.parseInt(d1.getValueAt(selectedIndex, 0).toString());
        
        String name=jmemberid.getText();
       // String address=jaddress.getText();
       // String phone=jedition.getText();
        
        try{
            pst=con.prepareStatement("update book set name=?,address=?,phone=? where id=?");
            pst.setString(1, name);
           // pst.setString(2, address);
           // pst.setString(3, phone);
            pst.setInt(4, id);
            
            int k=pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null, "book Upadted");
                jmemberid.setText("");
                //jaddress.setText("");
               // jedition.setText("");
                jmemberid.requestFocus();
                issuebook_load();
                jupdate.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error in insertion of data");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
       DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
        int selectedIndex=jTable1.getSelectedRow();
     
        int id=Integer.parseInt(d1.getValueAt(selectedIndex, 0).toString());
        
       
        
        try{
            pst=con.prepareStatement("delete from book  where id=?");
            
            pst.setInt(1, id);
            
            int k=pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null, "book deleted");
                jmemberid.setText("");
                //jaddress.setText("");
                //jedition.setText("");
                jmemberid.requestFocus();
                issuebook_load();
                jdelete.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error in insertion of data");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelActionPerformed
   
    }//GEN-LAST:event_jcancelActionPerformed

    private void jmemberidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmemberidKeyPressed
             
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String mid=jmemberid.getText();
            try{
                pst=con.prepareStatement("select * from member where id=?");
                pst.setString(1, mid);
                rs=pst.executeQuery();
                
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(this, "Member not Found");
                }
                else{
                    String membername=rs.getString("name");
                    jmembername.setText(membername.trim());
                }
            }catch(Exception e){
                
            }
            
        }
    }//GEN-LAST:event_jmemberidKeyPressed

    
    public void issuebook_load(){
        int c;
        try{
            pst=con.prepareStatement("select l.id,m.name,l.issuedate,l.returndate from lendbook l JOIN member m on l.memberid=m.id JOIN book b on l.bbokid=b.id ");
            rs=pst.executeQuery();
            
            ResultSetMetaData rsd=rs.getMetaData();
            c=rsd.getColumnCount();
            
            DefaultTableModel d=(DefaultTableModel)jTable1.getModel();
            d.setNumRows(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                for(int i=1;i<=c;i++){
                    v2.add(rs.getString("b.id"));
                    v2.add(rs.getString("b.name"));
                    v2.add(rs.getString("c.category"));
                    v2.add(rs.getString("a.author"));
                     v2.add(rs.getString("p.publisher"));
                    v2.add(rs.getString("b.contents"));
                    v2.add(rs.getString("b.pages"));
                    v2.add(rs.getString("b.edition"));
                }
                d.addRow(v2);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LendBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jadd;
    private javax.swing.JComboBox jbook;
    private javax.swing.JButton jcancel;
    private javax.swing.JButton jdelete;
    private com.toedter.calendar.JDateChooser jissuedate;
    private javax.swing.JTextField jmemberid;
    private javax.swing.JTextField jmembername;
    private com.toedter.calendar.JDateChooser jreturndate;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}
