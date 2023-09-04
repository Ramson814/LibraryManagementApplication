 
package librarymanagementapplication;

 
public class Main extends javax.swing.JFrame {

  
    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jauthor = new javax.swing.JButton();
        jpublisher = new javax.swing.JButton();
        jbook = new javax.swing.JButton();
        jmember = new javax.swing.JButton();
        jissuebook = new javax.swing.JButton();
        jreturnbook = new javax.swing.JButton();
        jlogout = new javax.swing.JButton();
        jcategory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library Management System");

        jauthor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jauthor.setText("Author");
        jauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jauthorActionPerformed(evt);
            }
        });

        jpublisher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jpublisher.setText("Publisher");
        jpublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpublisherActionPerformed(evt);
            }
        });

        jbook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbook.setText("Book");
        jbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbookActionPerformed(evt);
            }
        });

        jmember.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jmember.setText("Member");
        jmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmemberActionPerformed(evt);
            }
        });

        jissuebook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jissuebook.setText("Issue Book");
        jissuebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jissuebookActionPerformed(evt);
            }
        });

        jreturnbook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jreturnbook.setText("Return Book");
        jreturnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jreturnbookActionPerformed(evt);
            }
        });

        jlogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlogout.setText("Logout");
        jlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogoutActionPerformed(evt);
            }
        });

        jcategory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcategory.setText("Category");
        jcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jreturnbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jauthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jmember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jissuebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcategory)
                .addGap(18, 18, 18)
                .addComponent(jauthor)
                .addGap(18, 18, 18)
                .addComponent(jpublisher)
                .addGap(18, 18, 18)
                .addComponent(jbook)
                .addGap(26, 26, 26)
                .addComponent(jmember)
                .addGap(18, 18, 18)
                .addComponent(jissuebook)
                .addGap(18, 18, 18)
                .addComponent(jreturnbook)
                .addGap(27, 27, 27)
                .addComponent(jlogout)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jauthorActionPerformed
         Author a=new Author();
         this.hide();
         a.setVisible(true);
    }//GEN-LAST:event_jauthorActionPerformed

    private void jbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbookActionPerformed
        Book b=new Book();
        this.hide();
        b.setVisible(true);
    }//GEN-LAST:event_jbookActionPerformed

    private void jcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcategoryActionPerformed
      Category cat=new Category();
      this.hide();
      cat.setVisible(true);
    }//GEN-LAST:event_jcategoryActionPerformed

    private void jlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogoutActionPerformed
       this.setVisible(false);
       new Login().setVisible(true);
    }//GEN-LAST:event_jlogoutActionPerformed

    private void jpublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpublisherActionPerformed
        new Publisher().setVisible(true);
    }//GEN-LAST:event_jpublisherActionPerformed

    private void jissuebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jissuebookActionPerformed
          this.setVisible(false);
          new LendBook().setVisible(true);
    }//GEN-LAST:event_jissuebookActionPerformed

    private void jreturnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jreturnbookActionPerformed
        this.setVisible(false);
        new ReturnBook().setVisible(true);
    }//GEN-LAST:event_jreturnbookActionPerformed

    private void jmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmemberActionPerformed
        Member m=new Member();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_jmemberActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jauthor;
    private javax.swing.JButton jbook;
    private javax.swing.JButton jcategory;
    private javax.swing.JButton jissuebook;
    private javax.swing.JButton jlogout;
    private javax.swing.JButton jmember;
    private javax.swing.JButton jpublisher;
    private javax.swing.JButton jreturnbook;
    // End of variables declaration//GEN-END:variables
}
