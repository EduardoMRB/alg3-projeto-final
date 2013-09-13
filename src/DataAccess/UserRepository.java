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
		String sql = "SELECT id, name, email FROM newsuser";
		
		return this.db.createStatement().executeQuery(sql);
	}

	@Override
	public ResultSet findById(int id) throws SQLException {
		String sql = "SELECT id, name, email FROM newsuser WHERE id = ?";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, id);
		
		return stm.executeQuery();
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
		String sql = "DELETE FROM newsuser WHERE id = ?";
		
		User user = (User) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, user.getId());
		stm.execute();
	}

	@Override
	public void update(EntityInterface entity) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
