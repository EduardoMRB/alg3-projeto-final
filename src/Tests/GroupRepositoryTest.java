package Tests;

import java.sql.*;

import org.junit.Test;

import junit.framework.TestCase;
import DataAccess.GroupRepository;
import Entity.Group;

public class GroupRepositoryTest extends TestCase {
	protected Group group;
	
	protected Connection db;
	
	protected GroupRepository groupManager;
	
	@Override
	public void setUp() {
		this.group = new Group();
		try {
			Class.forName("org.postgresql.Driver");
			this.db = DriverManager.getConnection("jdbc:postgresql://localhost:5432/newsletter", "postgres", "123");
			this.db.createStatement().execute("CREATE TABLE grupo (id SERIAL PRIMARY KEY, name VARCHAR(100))");
			this.groupManager = new GroupRepository(this.db);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void tearDown() throws SQLException {
		this.db.createStatement().execute("DROP TABLE grupo");
		this.db.close();
		this.groupManager = null;
		this.group = null;
	}
	
	@Test
	public void groupIsInsertedAndRetrievedCorrectly() {
		this.group.setName("Alunos");
		try {
			this.groupManager.insert(this.group);
			ResultSet rs = this.groupManager.findById(1);
			TestCase.assertFalse(rs.next());
			TestCase.assertEquals("Alunos", rs.getString("name"));
			TestCase.assertEquals(1, rs.getString("id"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
