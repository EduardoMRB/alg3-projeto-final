package Frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DataAccess.UserRepository;
import Entity.User;

import java.awt.event.ActionListener;

public class ListUserJDialog extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JTable userTableList;
	protected UserRepository userRepo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListUserJDialog dialog = new ListUserJDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void fillTable() {
		try {
			DefaultTableModel tableModel = (DefaultTableModel) userTableList.getModel();
			
			ResultSet userRs = userRepo.findAll();
			
			while (userRs.next()) {
				Object[] line = new Object[3];
				line[0] = userRs.getInt("id");
				line[1] = userRs.getString("name");
				line[2] = userRs.getString("email");
				
				tableModel.addRow(line);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void deleteActionPerformed(java.awt.event.ActionEvent e) {
		try {
			int rowId = userTableList.getSelectedRow();
			int id = (int) userTableList.getModel().getValueAt(rowId, 0);
			
			ResultSet rs = userRepo.findById(id);
			
			while (rs.next()) {
				User user = new User();
				
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setName(rs.getString("name"));
				userRepo.delete(user);
			}
			
			JOptionPane.showMessageDialog(null, "Usuário removido com sucesso");
			dispose();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}
	
	private void cancelActionPerformed(java.awt.event.ActionEvent e) {
		dispose();
	}

	/**
	 * Create the dialog.
	 */
	public ListUserJDialog(SignUser signUser, boolean modal) {
		super(signUser, modal);
		
		userRepo = new UserRepository(Main.App.db);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		userTableList = new JTable();
		contentPanel.add(userTableList);
		userTableList.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Id", "Nome", "Email"
			}
		));
		fillTable();
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnDelete = new JButton("Deletar");
				btnDelete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						deleteActionPerformed(e);
					}
				});
				btnDelete.setActionCommand("OK");
				buttonPane.add(btnDelete);
				getRootPane().setDefaultButton(btnDelete);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancelActionPerformed(e);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}