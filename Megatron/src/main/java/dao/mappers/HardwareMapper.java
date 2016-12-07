package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Hardware;

public class HardwareMapper implements IMapResultSetIntoEntity<Hardware>{

	public Hardware map(ResultSet rs) throws SQLException {
		Hardware hardware = new Hardware();
		hardware.setId(rs.getInt("id"));
		hardware.setName(rs.getString("name"));
		hardware.setPrice(rs.getString("price"));
		hardware.setManufacturer(rs.getString("manufacturer"));
		return hardware;
	}

}
