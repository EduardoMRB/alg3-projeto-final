package Frame;

import java.awt.event.ActionEvent;

public class RegistrationJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CadastrosJFrame
     */
    public RegistrationJFrame() {
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

        cadastrarNewsletterjButton = new javax.swing.JButton();
        cadastrarSecoesjButton = new javax.swing.JButton();
        cadastrarCategoriasjButton = new javax.swing.JButton();
        cadastrarUsuariosjButton = new javax.swing.JButton();
        cadastrarAssinantesjButton = new javax.swing.JButton();
        cadastrarGruposjButton = new javax.swing.JButton();
        sairjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarNewsletterjButton.setText("Newsletter");
        cadastrarNewsletterjButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNewsletterjButtonActionPerformed(evt);
            }
        });

        cadastrarSecoesjButton.setText("Seções");

        cadastrarCategoriasjButton.setText("Categorias");
        cadastrarCategoriasjButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
        	public void actionPerformed(java.awt.event.ActionEvent e) {
        		cadastrarCategoriasjButtonActionPerformed(e);
        	}
        });

        cadastrarUsuariosjButton.setText("Usuários");

        cadastrarAssinantesjButton.setText(" Assinantes");
        cadastrarAssinantesjButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAssinantesjButtonActionPerformed(evt);
            }
        });

        cadastrarGruposjButton.setText("Grupos");
        cadastrarGruposjButton.addActionListener(new java.awt.event.ActionListener() {
        	@Override
        	public void actionPerformed(java.awt.event.ActionEvent e) {
        		cadastrarGrupojButtonActionPerformed(e);
        	}
        });

        sairjButton.setText("SAIR");
        sairjButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sairjButtonActionPerformed(e);
			}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastrarAssinantesjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarCategoriasjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cadastrarNewsletterjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastrarSecoesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarUsuariosjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(cadastrarGruposjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(sairjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastrarSecoesjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarNewsletterjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastrarCategoriasjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(cadastrarUsuariosjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastrarAssinantesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(cadastrarGruposjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(sairjButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarNewsletterjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNewsletterjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarNewsletterjButtonActionPerformed

    private void cadastrarAssinantesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAssinantesjButtonActionPerformed
        SignSubscriberJDialog subsFrame = new SignSubscriberJDialog(this, true);
        subsFrame.setVisible(true);
    }//GEN-LAST:event_cadastrarAssinantesjButtonActionPerformed

    private void cadastrarCategoriasjButtonActionPerformed(java.awt.event.ActionEvent e) {
    	CreateCategoriasJDialog catFrame = new CreateCategoriasJDialog(this, true);
    	catFrame.setVisible(true);
    }
    
    private void sairjButtonActionPerformed(java.awt.event.ActionEvent e) {
    	this.dispose();
    }
    
    private void cadastrarGrupojButtonActionPerformed(java.awt.event.ActionEvent e) {
    	CreateGroupJDialog groupFrame = new CreateGroupJDialog(this, true);
    	groupFrame.setVisible(true);
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
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                new RegistrationJFrame().setVisible(true);
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
