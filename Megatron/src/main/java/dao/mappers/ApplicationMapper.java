package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Application;

public class ApplicationMapper implements IMapResultSetIntoEntity<Application>{

	public Application map(ResultSet rs) throws SQLException {
		Application application = new Application();
		application.setId(rs.getInt("id"));
		application.setName(rs.getString("price"));
		application.setDate(rs.getDate("date"));
		return application;
	}

}