package dao.repositories;

import java.util.List;

import domain.model.Service;

public interface IServiceRepository extends IRepository<Service>{

	public List<Service> withName(String name);
	public List<Service> withPrice(String price);
}
