package Tests;

import java.sql.*;

import DataAccess.GroupRepository;
import Entity.Group;
import junit.framework.TestCase;

public class GroupRepositoryTest extends TestCase {
	protected Group group;
	
	protected Connection db;
	
	protected GroupRepository groupManager;
	
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
	
	public void tearDown() throws SQLException {
		this.db.createStatement().execute("DROP TABLE grupo");
		this.db.close();
		this.groupManager = null;
		this.group = null;
	}
	
	public void testGroupIsInserted() {
		this.group.setName("Alunos");
		try {
			this.groupManager.insert(this.group);
			ResultSet rs = this.groupManager.findById(1);
			GroupRepositoryTest.assertFalse(rs.next());
			GroupRepositoryTest.assertEquals("Alunos", rs.getString("name"));
			GroupRepositoryTest.assertEquals(1, rs.getString("id"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
