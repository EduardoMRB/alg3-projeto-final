package DataAccess;

import java.sql.*;

import Entity.Section;
import Entity.EntityInterface;

public class SectionRepository implements RepositoryInterface {
	protected Connection db;
	
	public SectionRepository(Connection db) {
		this.db = db;
	}
	
	@Override
	public ResultSet findAll() throws SQLException {
		String sql = "SELECT id, category_id, newsletter_id, title, content FROM section";
		
		return this.db.createStatement().executeQuery(sql);
	}

	@Override
	public ResultSet findById(int id) throws SQLException {
		String sql = "SELECT id, category_id, newsletter_id, title, content FROM section WHERE id = ?";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, id);
		
		return stm.executeQuery();
	}

	@Override
	public void insert(EntityInterface entity) throws SQLException {
		String sql = "INSERT INTO section (category_id, newsletter_id, title, content) VALUES (?, ?, ?, ?)";
		
		Section section = (Section) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, section.getCategory().getId());
		stm.setInt(2, section.getNewsletter().getId());
		stm.setString(3, section.getTitle());
		stm.setString(4, section.getContent());
		stm.execute();
	}

	@Override
	public void delete(EntityInterface entity) throws SQLException {
		String sql = "DELETE FROM section WHERE id = ?";
		
		Section section = (Section) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, section.getId());
		stm.execute();
	}

	@Override
	public void update(EntityInterface entity) throws SQLException {
		String sql = new StringBuilder()
			.append("UPDATE section")
			.append("SET category_id = ?,")
			.append("newsletter_id = ?,")
			.append("title = ?,")
			.append("content = ?")
			.append("WHERE id = ?")
			.toString();
		
		Section section = (Section) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, section.getCategory().getId());
		stm.setInt(2, section.getNewsletter().getId());
		stm.setString(3, section.getTitle());
		stm.setString(4, section.getContent());
		stm.setInt(5, section.getId());
		stm.execute();
	}
}
