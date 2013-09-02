package DataAccess;

import Entity.EntityInterface;
import Entity.Subscriber;

import java.sql.*;

public class SubscriberRepository implements RepositoryInterface {
	protected Connection db;
	
	public SubscriberRepository(Connection db) {
		this.db = db;
	}

	@Override
	public ResultSet findAll() throws SQLException {
		String sql = "SELECT subscriber.id, subscriber.email, subscriber.group_id FROM subscriber";
		
		return this.db.createStatement().executeQuery(sql);
	}

	@Override
	public ResultSet findById(int id) throws SQLException {
		String sql = new StringBuilder()
			.append("SELECT subscriber.id, subscriber.email, subscriber.group_id")
			.append("FROM subscriber")
			.append("WHERE subscriber.id = ?")
			.toString();
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setInt(1, id);
		
		return stm.executeQuery();
	}

	@Override
	public void insert(EntityInterface entity) throws SQLException {
		String sql = new StringBuilder()
			.append("INSERT INTO subscriber (email, cpf, group_id)")
			.append("VALUES (?, ?, ?)")
			.toString();
	
		PreparedStatement stm = this.db.prepareStatement(sql);
		Subscriber subscriber = (Subscriber) entity;
		stm.setString(1, subscriber.getEmail());
		stm.setString(2, subscriber.getCpf());
		stm.setInt(3, subscriber.getGroup().getId());
		stm.execute();
	}

	@Override
	public void delete(EntityInterface entity) throws SQLException {
		String sql = "DELETE FROM subscriber WHERE subscriber.id = ?";
		
		PreparedStatement stm = this.db.prepareStatement(sql);
		Subscriber subscriber = (Subscriber) entity;
		stm.setInt(1, subscriber.getId());
		stm.execute();
	}

	@Override
	public void update(EntityInterface entity) throws SQLException {
		String sql = new StringBuilder()
			.append("UPDATE subscriber")
			.append("SET subscriber.email = ?,")
			.append("subscriber.cpf = ?,")
			.append("subscriber.group_id = ?")
			.append("subscriber.id = ?")
			.toString();
		
		Subscriber subscriber = (Subscriber) entity;
		PreparedStatement stm = this.db.prepareStatement(sql);
		stm.setString(1, subscriber.getEmail());
		stm.setString(2, subscriber.getCpf());
		stm.setInt(3, subscriber.getGroup().getId());
		stm.setInt(4, subscriber.getId());
		stm.execute();
	}
	
}
