package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.EntityInterface;

public class NewsletterRepository implements RepositoryInterface {
	protected Connection db;
	
	public NewsletterRepository(Connection db) {
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
		// TODO Auto-generated method stub
		
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
