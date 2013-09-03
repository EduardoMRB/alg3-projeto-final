package DataAccess;

import java.sql.*;

import Entity.EntityInterface;
import Entity.Category;


public class CategoryRepository implements RepositoryInterface {
	protected Connection db;
	
	public CategoryRepository(Connection db) {
		this.db = db;
	}

	@Override
	public ResultSet findAll() throws SQLException {
		String sql = "SELECT id, title, description FROM category";
		
		return this.db.createStatement().executeQuery(sql);
	}

	@Override
	public ResultSet findById(int id) throws SQLException {
		String sql = "SELECT id, title, description FROM category WHERE id = ?";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, id);
		
		return stm.executeQuery();
	}

	@Override
	public void insert(EntityInterface entity) throws SQLException {
		String sql = "INSERT INTO category (title, description) VALUES (?, ?)";
		
		Category category = (Category) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setString(1, category.getTitle());
		stm.setString(2, category.getDescription());
		stm.execute();
	}

	@Override
	public void delete(EntityInterface entity) throws SQLException {
		String sql = "DELETE FROM category WHERE id = ?";
		
		Category category = (Category) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, category.getId());
		stm.execute();
	}

	@Override
	public void update(EntityInterface entity) throws SQLException {
		String sql = new StringBuilder()
			.append("UPDATE category")
			.append("SET title = ?,")
			.append("description = ?")
			.append("WHERE id = ?")
			.toString();
		
		Category category = (Category) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setString(1, category.getTitle());
		stm.setString(2, category.getDescription());
		stm.setInt(3, category.getId());
		stm.execute();
	}
}
