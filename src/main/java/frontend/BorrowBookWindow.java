package frontend;

import java.time.ZoneId;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import library.roles.LibrarianRole;

public class BorrowBookWindow extends javax.swing.JFrame implements Navigate {

    private Navigate parent;

    LibrarianRole librarian;

    /**
     * Creates new form BorrowBookWindow
     *
     * @param librarian
     */
    public BorrowBookWindow(LibrarianRole librarian) {
        initComponents();
        this.librarian = librarian;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textFieldStudentId = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textFieldBookId = new javax.swing.JTextArea();
        borrowBUTTON = new javax.swing.JButton();
        textFieldBorrowDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Borrow Book");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Id");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Id");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Borrow Date");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);

        textFieldStudentId.setTabSize(5);
        jScrollPane1.setViewportView(textFieldStudentId);

        textFieldBookId.setTabSize(5);
        jScrollPane2.setViewportView(textFieldBookId);

        borrowBUTTON.setBackground(new java.awt.Color(0, 0, 0));
        borrowBUTTON.setForeground(new java.awt.Color(255, 255, 255));
        borrowBUTTON.setText("Borrow");
        borrowBUTTON.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrowBUTTON.setOpaque(true);
        borrowBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(borrowBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(textFieldBorrowDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(borrowBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrowBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBUTTONActionPerformed
        // TODO add your handling code here:
        String studentId = textFieldStudentId.getText();
        String bookId = textFieldBookId.getText();
        Date borrowDate = textFieldBorrowDate.getDate();
        String key = studentId + "," + bookId;

        if ("".equals(studentId) || "".equals(bookId) || borrowDate == null) {
            JOptionPane.showMessageDialog(null, "Some fields are empty!");
        } else {
            if (!librarian.isStudentBookIdAvailable(key)) {
                JOptionPane.showMessageDialog(null, "The student with id = " + studentId + " has already borrowed a copy of the book with id = " + bookId + " and hasn't returned it yet!");
            } else if (!librarian.isBookInStock(bookId)) {
                JOptionPane.showMessageDialog(null, "The book with id = " + bookId + " is not in stock! No copy is left for student with id = " + studentId);
            } else {
                librarian.borrowBook(studentId, bookId, borrowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                JOptionPane.showMessageDialog(null, "The student with id = " + studentId + " has successfully borrowed a copy of the book with id = " + bookId);
                textFieldStudentId.setText("");
                textFieldBookId.setText("");
                textFieldBorrowDate.setDate(null);
            }
        }
    }//GEN-LAST:event_borrowBUTTONActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        ((JFrame)parent).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    //    public static void main(String args[]) {
    //        /* Set the Nimbus look and feel */
    //        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //         */
    //        try {
    //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //                if ("Nimbus".equals(info.getName())) {
    //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                    break;
    //                }
    //            }
    //        } catch (ClassNotFoundException ex) {
    //            java.util.logging.Logger.getLogger(BorrowBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(BorrowBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(BorrowBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(BorrowBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
    //        //</editor-fold>
    //
    //        /* Create and display the form */
    //        java.awt.EventQueue.invokeLater(new Runnable() {
    //            public void run() {
    //                new BorrowBookWindow().setVisible(true);
    //            }
    //        });
    //    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrowBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textFieldBookId;
    private com.toedter.calendar.JDateChooser textFieldBorrowDate;
    private javax.swing.JTextArea textFieldStudentId;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParentNavigate(Navigate n) {
        this.parent = n;
    }

    @Override
    public Navigate getParentNavigate() {
        return parent;
    }
}
