package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Customer;

public class EmployeeMapper implements IMapResultSetIntoEntity<Customer>{

	public Customer map(ResultSet rs) throws SQLException {
		Customer customer = new Customer();
		customer.setId(rs.getInt("id"));
		customer.setName(rs.getString("name"));
		customer.setSurname(rs.getString("surname"));
		return customer;
	}

}