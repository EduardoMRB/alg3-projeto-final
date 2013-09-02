package DataAccess;

import Entity.EntityInterface;
import java.sql.*;

public interface RepositoryInterface {
	/**
	 * Retorna todos os registros cadastrados no BD
	 * 
	 * @return ResultSet
	 * @throws SQLException
	 */
	public ResultSet findAll() throws SQLException;
	
	/**
	 * Retorna registro pelo id passado por parametro
	 * 
	 * @param int id
	 * @return ResultSet
	 * @throws SQLException
	 */
	public ResultSet findById(int id) throws SQLException;
	
	/**
	 * Insere um novo registro
	 * 
	 * @param EntityInterface entity
	 * @throws SQLException
	 */
	public void insert(EntityInterface entity) throws SQLException;
	
	/**
	 * Remove uma entidade do banco
	 * 
	 * @param EntityInterface entity
	 * @throws SQLException
	 */
	public void delete(EntityInterface entity) throws SQLException;
	
	/**
	 * Edita uma entidade no banco
	 * 
	 * @param entity
	 * @throws SQLException
	 */
	public void update(EntityInterface entity) throws SQLException;
}
