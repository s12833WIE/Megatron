package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Service;

public class ServiceMapper implements IMapResultSetIntoEntity<Service>{

	public Service map(ResultSet rs) throws SQLException {
		Service service = new Service();
		service.setId(rs.getInt("id"));
		service.setName(rs.getString("name"));
		service.setPrice(rs.getString("price"));
		return service;
	}

}
