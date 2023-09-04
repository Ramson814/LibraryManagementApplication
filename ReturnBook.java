 
package librarymanagementapplication;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
public class ReturnBook extends javax.swing.JFrame {

 
    public ReturnBook() {
        initComponents();
        connect();
        
        returnbook_load();
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
        jmembername = new javax.swing.JLabel();
        jbook = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jelapsedate = new javax.swing.JTextField();
        jfine = new javax.swing.JTextField();
        jreturndate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return  Book");

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Member ID", "Member Name", "Book", "Return Date", "Elaps days", "fine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jLabel5.setText("Return date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Member Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Days elap");

        jmembername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmembername.setForeground(new java.awt.Color(255, 255, 255));
        jmembername.setText("ds");

        jbook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbook.setForeground(new java.awt.Color(255, 255, 255));
        jbook.setText("dg");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fine");

        jelapsedate.setText(" ");
        jelapsedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jelapsedateActionPerformed(evt);
            }
        });

        jfine.setText(" ");

        jreturndate.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jadd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addComponent(jdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jmembername, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jelapsedate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jfine, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))))))
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jmemberid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jmembername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbook, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jelapsedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jfine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jadd)
                            .addComponent(jupdate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcancel)
                            .addComponent(jdelete))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
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
        String membername=jmembername.getText();
        String bookname=jbook.getText();
        String returndate=jreturndate.getText();
        String elapdays=jelapsedate.getText();
        String fine=jfine.getText();
       
        try{
            pst=con.prepareStatement("insert into lendbook (memberid,membername,bookname,returndate,elapdays,fine) values (?,?,?,?,?,?)");
            
            pst.setString(1, memberid);
            pst.setString(2, membername);
            pst.setString(3, bookname);
            pst.setString(4, returndate);
            pst.setString(5, elapdays);
            pst.setString(6, fine);
            
            int k=pst.executeUpdate();con.prepareStatement("delete from lendbook where memberid=?");
            pst.setString(1, memberid);
            pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null, "Return book successfully ");
                jmemberid.setText("");
                jmembername.setText("");
                jbook.setText("");
                jreturndate.setText("");
                jelapsedate.setText("");
                jfine.setText("");
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
                returnbook_load();
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
                returnbook_load();
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
        String id=jmemberid.getText();
        try {
            pst=con.prepareStatement("select m.name,b.name,l.returndate,DATEDIFF(now(),l.returndate as elap from lendbook l JOIN member m on l.memberid=m.id JOIN book b on l.bookid=b.id and l.memberid=?");
            pst.setString(1, id);
            rs=pst.executeQuery();
            
            if(rs.next()==false){
                JOptionPane.showMessageDialog(this, "Member ID not Found");
            }
            else{
                String mname=rs.getString("m.name");
                String bname=rs.getString("b.name");
                
                jmembername.setText(mname.trim());
                jbook.setText(bname.trim());
                
                String date=rs.getString("l.returndate");
                jreturndate.setText(date);
                
                String elap=rs.getString("elap");
                int elaped=Integer.parseInt(elap);
                
                if(elaped>0){
                    jelapsedate.setText(elap);
                    int fine=elaped *100;
                    jfine.setText(String.valueOf(fine));
                }
                else{
                    jelapsedate.setText("0");
                    jfine.setText("0");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_jmemberidKeyPressed

    private void jelapsedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jelapsedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jelapsedateActionPerformed

    
    public void returnbook_load(){
        int c;
        try{
            pst=con.prepareStatement("select * from returnbook");
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
                new ReturnBook().setVisible(true);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jadd;
    private javax.swing.JLabel jbook;
    private javax.swing.JButton jcancel;
    private javax.swing.JButton jdelete;
    private javax.swing.JTextField jelapsedate;
    private javax.swing.JTextField jfine;
    private javax.swing.JTextField jmemberid;
    private javax.swing.JLabel jmembername;
    private javax.swing.JTextField jreturndate;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}
