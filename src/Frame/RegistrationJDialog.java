package Frame;

public class RegistrationJDialog extends javax.swing.JDialog {

    /**
     * Creates new form CadastrosJDialog
     */
    public RegistrationJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        cadastrarAssinantesjButton = new javax.swing.JButton();
        cadastrarGruposjButton = new javax.swing.JButton();
        sairjButton = new javax.swing.JButton();
        cadastrarUsuariosjButton = new javax.swing.JButton();
        cadastrarNewsletterjButton = new javax.swing.JButton();
        cadastrarCategoriasjButton = new javax.swing.JButton();
        cadastrarSecoesjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cadastrarAssinantesjButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        cadastrarAssinantesjButton.setText(" Assinantes");
        cadastrarAssinantesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAssinantesjButtonActionPerformed(evt);
            }
        });

        cadastrarGruposjButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        cadastrarGruposjButton.setText("Grupos");
        cadastrarGruposjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarGruposjButtonActionPerformed(evt);
            }
        });

        sairjButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        sairjButton.setText("SAIR");
        sairjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairjButtonActionPerformed(evt);
            }
        });

        cadastrarUsuariosjButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        cadastrarUsuariosjButton.setText("Usuários");
        cadastrarUsuariosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuariosjButtonActionPerformed(evt);
            }
        });

        cadastrarNewsletterjButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        cadastrarNewsletterjButton.setText("Newsletter");
        cadastrarNewsletterjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNewsletterjButtonActionPerformed(evt);
            }
        });

        cadastrarCategoriasjButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        cadastrarCategoriasjButton.setText("Categorias");
        cadastrarCategoriasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCategoriasjButtonActionPerformed(evt);
            }
        });

        cadastrarSecoesjButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        cadastrarSecoesjButton.setText("Seções");
        cadastrarSecoesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarSecoesjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cadastrarCategoriasjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarNewsletterjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(cadastrarAssinantesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastrarSecoesjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrarUsuariosjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrarGruposjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(sairjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastrarNewsletterjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(cadastrarSecoesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarCategoriasjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarUsuariosjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarAssinantesjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarGruposjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(sairjButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarAssinantesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAssinantesjButtonActionPerformed
        // TODO add your handling code here:
        SignSubscriberJDialog tela = new SignSubscriberJDialog(null, rootPaneCheckingEnabled);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarAssinantesjButtonActionPerformed

    private void sairjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairjButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sairjButtonActionPerformed

    private void cadastrarNewsletterjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNewsletterjButtonActionPerformed
        // TODO add your handling code here:
        CreateNewsletterJDialog tela = new CreateNewsletterJDialog(null, rootPaneCheckingEnabled);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarNewsletterjButtonActionPerformed

    private void cadastrarSecoesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarSecoesjButtonActionPerformed
        // TODO add your handling code here:
        CreateSectionJDialog tela = new CreateSectionJDialog(null, rootPaneCheckingEnabled);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarSecoesjButtonActionPerformed

    private void cadastrarCategoriasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCategoriasjButtonActionPerformed
        // TODO add your handling code here:
        CreateCategoriasJDialog tela = new CreateCategoriasJDialog(null, rootPaneCheckingEnabled);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarCategoriasjButtonActionPerformed

    private void cadastrarUsuariosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuariosjButtonActionPerformed
        // TODO add your handling code here:
        SignUser tela = new SignUser(null, rootPaneCheckingEnabled);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarUsuariosjButtonActionPerformed

    private void cadastrarGruposjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarGruposjButtonActionPerformed
        // TODO add your handling code here:
        CreateGroupJDialog tela = new CreateGroupJDialog(null, rootPaneCheckingEnabled);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarGruposjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrationJDialog dialog = new RegistrationJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarAssinantesjButton;
    private javax.swing.JButton cadastrarCategoriasjButton;
    private javax.swing.JButton cadastrarGruposjButton;
    private javax.swing.JButton cadastrarNewsletterjButton;
    private javax.swing.JButton cadastrarSecoesjButton;
    private javax.swing.JButton cadastrarUsuariosjButton;
    private javax.swing.JButton sairjButton;
    // End of variables declaration//GEN-END:variables
}