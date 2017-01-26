package s12833.Megatron;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.CustomerRepository;
import dao.mappers.CustomerMapper;
import dao.mappers.IMapResultSetIntoEntity;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;
import domain.model.Customer;

public class Main {



	public static void main(String[] args) {



		String url = "jdbc:hsqldb:hsql://localhost/workdb";

		

		System.out.println("START");

		try {



			Connection connection = DriverManager.getConnection(url);

			IUnitOfWork uow = new UnitOfWork(connection);

			IMapResultSetIntoEntity<Customer> mapper = new CustomerMapper();

			CustomerRepository customer2 = new CustomerRepository(connection, mapper, uow);

			DatabaseMetaData meta = connection.getMetaData();

			boolean tableCustomerExists = false;

//			ResultSet res = meta.getTables(null, null, "people", new String[] { "TABLE" });
//
//			while (res.next()) {
//
//				if (res.getString("TABLE_NAME").equals("people")) {
//
//					tableCustomerExists = true;
//
//				}
//
//			}

//			if (!tableCustomerExists) {

				String createTableSql = customer2.createTableSql();

				Statement createTable = connection.createStatement();

				createTable.executeUpdate(createTableSql);

//			}

			System.out.println("?::::");

			


			Customer customer = new Customer();

			customer.setName("name");

			customer.setSurname("surname");

			customer2.add(customer);





		} catch (SQLException e) {

			e.printStackTrace();

		}

		System.out.println("koniec");

	}
}