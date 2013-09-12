package DataAccess;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.EntityInterface;
import Entity.Newsletter;

public class NewsletterRepository implements RepositoryInterface {
	protected Connection db;
	
	public NewsletterRepository(Connection db) {
		this.db = db;
	}

	@Override
	public ResultSet findAll() throws SQLException {
		String sql = "SELECT id, date, enabled FROM newsletter";
		
		return this.db.createStatement().executeQuery(sql);
	}

	@Override
	public ResultSet findById(int id) throws SQLException {
		String sql = "SELECT id, date, enabled FROM newsletter WHERE id = ?";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, id);
		
		return stm.executeQuery();
	}

	@Override
	public void insert(EntityInterface entity) throws SQLException {
		String sql = "INSERT INTO newsletter (date, enabled) VALUES (?, ?)";
		
		Newsletter newsletter = (Newsletter) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setDate(1, new java.sql.Date(newsletter.getDate().getTime()));
		stm.setBoolean(2, newsletter.isEnabled());
		stm.execute();
	}

	@Override
	public void delete(EntityInterface entity) throws SQLException {
		String sql = "DELETE FROM newsletter WHERE id = ?";
		
		Newsletter newsletter = (Newsletter) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, newsletter.getId());
		stm.execute();
	}

	@Override
	public void update(EntityInterface entity) throws SQLException {
		String sql = new StringBuilder()
			.append("UPDATE newsletter")
			.append("SET date = ?,")
			.append("enabled = ?")
			.append("WHERE id = ?")
			.toString();
		
		Newsletter newsletter = (Newsletter) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setDate(1, (Date) newsletter.getDate());
		stm.setBoolean(2, newsletter.isEnabled());
		stm.setInt(3, newsletter.getId());
		stm.execute();
	}
}
