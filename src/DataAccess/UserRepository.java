package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.EntityInterface;
import Entity.User;

public class UserRepository implements RepositoryInterface {
	protected Connection db;
	
	public UserRepository(Connection db) {
		this.db = db;
	}
	
	@Override
	public ResultSet findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(EntityInterface entity) throws SQLException {
		String sql = "INSERT INTO newsuser (name, email) VALUES (?, ?)";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		User user = (User) entity;
		stm.setString(1, user.getName());
		stm.setString(2, user.getEmail());
		stm.execute();
	}

	@Override
	public void delete(EntityInterface entity) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(EntityInterface entity) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
