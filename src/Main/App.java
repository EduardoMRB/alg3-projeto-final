package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;

import Frame.*;

public class App {
	public static Connection db;

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			db = DriverManager.getConnection("jdbc:postgresql://localhost:5432/newsletter", "postgres", "123");
			JFrame registrationFrame = new RegistrationJFrame();
			registrationFrame.setVisible(true);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}