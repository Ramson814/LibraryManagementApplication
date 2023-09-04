 
package librarymanagementapplication;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
public class Book extends javax.swing.JFrame {

 
    public Book() {
        initComponents();
        connect();
        category();
        author();
        publisher();
       // book_load();
    }
    
    public class CategoryItem{
        int id;
        String name;
        public CategoryItem(int id,String name){
            this.id=id;
            this.name=name;
        }
        public String toString(){
            return name;
        }
    }
    
     public class AutherItem{
        int id;
        String name;
        public AutherItem(int id,String name){
            this.id=id;
            this.name=name;
        }
        public String toString(){
            return name;
        }
    }
     
     
     public class PublisherItem{
        int id;
        String name;
        public PublisherItem(int id,String name){
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

  public void category(){
    try{
        pst=con.prepareStatement("select * from cateory");
        rs=pst.executeQuery();
        jcategory.removeAllItems();
        
        while(rs.next()){
          jcategory.addItem(new CategoryItem(rs.getInt(1),rs.getString(2)));
        }
    }catch(Exception e){
        
    }
}
  
  public void author(){
    try{
        pst=con.prepareStatement("select * from author");
        rs=pst.executeQuery();
        jauthor.removeAllItems();
        
        while(rs.next()){
          jauthor.addItem(new AutherItem(rs.getInt(1),rs.getString(2)));
        }
    }catch(Exception e){
        
    }
}
  
  public void publisher(){
    try{
        pst=con.prepareStatement("select * from publisher");
        rs=pst.executeQuery();
        jpublisher.removeAllItems();
        
        while(rs.next()){
         jpublisher.addItem(new PublisherItem(rs.getInt(1),rs.getString(2)));
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
        jLabel3 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jcancel = new javax.swing.JButton();
        jadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jedition = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcategory = new javax.swing.JComboBox();
        jauthor = new javax.swing.JComboBox();
        jpublisher = new javax.swing.JComboBox();
        jcontents = new javax.swing.JTextField();
        jpageno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Author");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edition");

        jname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "category", "author", "publisher", "contents", "No of pages", "edition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jLabel4.setText("Book Name");

        jedition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jedition.setText(" ");
        jedition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Publisher");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No of pages");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contents");

        jcategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

        jauthor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        jauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jauthorActionPerformed(evt);
            }
        });

        jpublisher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

        jcontents.setText(" ");

        jpageno.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel1))
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jname)
                                    .addComponent(jcategory, 0, 166, Short.MAX_VALUE)
                                    .addComponent(jauthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jpublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcontents)
                                    .addComponent(jpageno)
                                    .addComponent(jedition))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jadd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jupdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jcontents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jpageno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jedition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jupdate)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jadd)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jdelete)
                            .addComponent(jcancel))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed
       String name=jname.getText();
       CategoryItem citem=(CategoryItem)jcategory.getSelectedItem();
       AutherItem aitem=(AutherItem)jauthor.getSelectedItem();
       PublisherItem pitem=(PublisherItem)jpublisher.getSelectedItem();
       
       String content =jcontents.getText();
       String pages=jpageno.getText();
       String edition=jedition.getText();
         
         
        try{
            pst=con.prepareStatement("insert into book (name,category,auther,publisher,content,pages,edition) values (?,?,?.?,?,?,?)");
            pst.setString(1, name);
            pst.setInt(2, citem.id);
            pst.setInt(3, aitem.id);
            pst.setInt(4, pitem.id);
            pst.setString(5, content);
            pst.setString(6, pages);
            pst.setString(7, edition);
            
            int k=pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null, "book Created");
                jname.setText("");
                jcategory.setSelectedItem(-1);
                jauthor.setSelectedItem(-1);
                jcategory.setSelectedItem(-1);
                jedition.setText("");
                jcontents.setText("");
                jpageno.setText("");
                jname.requestFocus();
                
                // book_load();
               // jadd.setEnabled(false);
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
     jname.setText(d1.getValueAt(selectedIndex, 1).toString());
    // jaddress.setText(d1.getValueAt(selectedIndex, 2).toString());
     jedition.setText(d1.getValueAt(selectedIndex, 3).toString());
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
     
         DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
        int selectedIndex=jTable1.getSelectedRow();
     
        int id=Integer.parseInt(d1.getValueAt(selectedIndex, 0).toString());
        
        String name=jname.getText();
       // String address=jaddress.getText();
        String phone=jedition.getText();
        
        try{
            pst=con.prepareStatement("update book set name=?,address=?,phone=? where id=?");
            pst.setString(1, name);
           // pst.setString(2, address);
            pst.setString(3, phone);
            pst.setInt(4, id);
            
            int k=pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null, "book Upadted");
                jname.setText("");
                //jaddress.setText("");
                jedition.setText("");
                jname.requestFocus();
                book_load();
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
                jname.setText("");
                //jaddress.setText("");
                jedition.setText("");
                jname.requestFocus();
                book_load();
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
        this.setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_jcancelActionPerformed

    private void jeditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeditionActionPerformed

    private void jauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jauthorActionPerformed

    
    public void book_load(){
        int c;
        try{
            pst=con.prepareStatement("select b.id,b.name,c.category,a.author,p.publisher,b.contents,b.pages,b.edition from book b JOIN category c on b.category=c.id JOIN author a on b.author=a.id JOIN publisher p on b.publisher=p.id");
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
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jadd;
    private javax.swing.JComboBox jauthor;
    private javax.swing.JButton jcancel;
    private javax.swing.JComboBox jcategory;
    private javax.swing.JTextField jcontents;
    private javax.swing.JButton jdelete;
    private javax.swing.JTextField jedition;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jpageno;
    private javax.swing.JComboBox jpublisher;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}
