package dao.repositories;

import java.util.List;

import domain.model.Employee;

public interface IEmployeeRepository extends IRepository<Employee>{

	public List<Employee> withName(String name);
	public List<Employee> withSurname(String surname);
}
