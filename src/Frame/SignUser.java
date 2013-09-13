package Frame;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Entity.User;
import DataAccess.UserRepository;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class SignUser extends javax.swing.JDialog {
	protected UserRepository userRepo;
    /**
     * Creates new form CadastraUsuarioJDialog
     */
    public SignUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        userRepo = new UserRepository(Main.App.db);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namejLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JFormattedTextField();
        passwdjLabel = new javax.swing.JLabel();
        passwdjTextField = new javax.swing.JTextField();
        savejButton = new javax.swing.JButton();
        sairjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        namejLabel.setText("Nome:");

        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });

        emailjLabel.setText("Email:");
        
        passwdjLabel.setText("Senha:");

        savejButton.setText("Salvar");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				salvarjButtonActionPerformed(e);
			}
        });

        sairjButton.setText("Sair");
        sairjButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairjButtonActionPerformed(evt);
            }
        });
        
        btnList = new JButton("Listar");
        btnList.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		listActionPerformed(e);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(namejLabel)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(namejTextField, 263, 263, 263))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(emailjLabel)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(btnList)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(savejButton)
        			.addGap(18)
        			.addComponent(sairjButton)
        			.addGap(51))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(namejLabel)
        				.addComponent(namejTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(emailjLabel)
        				.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnList)
        				.addComponent(savejButton)
        				.addComponent(sairjButton))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextFieldActionPerformed

    private void cpfjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfjFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfjFormattedTextFieldActionPerformed

    private void sairjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairjButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sairjButtonActionPerformed
    
    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent e) {
    	try {
    		User user = new User();
        	user.setName(namejTextField.getText());
        	user.setEmail(emailTextField.getText());
        	
        	userRepo.insert(user);
        	this.dispose();
        	JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso");
    	} catch (SQLException ex) {
    		System.out.println("Não foi possível cadastrar usuário");
    		ex.printStackTrace();
    	}
    }
    
    private void listActionPerformed(java.awt.event.ActionEvent e) {
    	ListUserJDialog listUser = new ListUserJDialog(this, true);
    	listUser.setVisible(true);
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
            java.util.logging.Logger.getLogger(SignUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                SignUser dialog = new SignUser(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField passwdjTextField;
    private javax.swing.JLabel passwdjLabel;
    private javax.swing.JButton sairjButton;
    private javax.swing.JButton savejButton;
    private JButton btnList;
    // End of variables declaration//GEN-END:variables
}
