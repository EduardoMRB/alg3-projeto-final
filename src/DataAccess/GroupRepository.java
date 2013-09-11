package DataAccess;

import Entity.EntityInterface;
import Entity.Group;
import java.sql.*;

public class GroupRepository implements RepositoryInterface {
	protected Connection db;
	
	public GroupRepository(Connection con) {
		this.db = con;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResultSet findAll() throws SQLException {
		String sql = "SELECT id, name FROM grupo";
		
		return this.db.createStatement().executeQuery(sql);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResultSet findById(int id) throws SQLException {
		String sql = "SELECT id, name FROM grupo WHERE id = ?";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, id);
		
		return stm.executeQuery();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void insert(EntityInterface entity) throws SQLException {
		String sql = "INSERT INTO grupo (name) VALUES (?)";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		Group group = (Group) entity;
		stm.setString(1, group.getName());
		stm.execute();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void delete(EntityInterface entity) throws SQLException {
		String sql = "DELETE FROM grupo WHERE id = ?";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		Group group = (Group) entity;
		stm.setInt(1, group.getId());
		stm.execute();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void update(EntityInterface entity) throws SQLException {
		String sql = "UPDATE grupo SET name = ? WHERE id = ?";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		Group group = (Group) entity;
		stm.setString(1, group.getName());
		stm.setInt(2, group.getId());
		stm.execute();
	}
}
