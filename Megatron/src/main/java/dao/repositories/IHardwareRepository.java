package dao.repositories;

import java.util.List;

import domain.model.Hardware;

public interface IHardwareRepository extends IRepository<Hardware>{

	public List<Hardware> withName(String name);
	public List<Hardware> withPrice(String name);
	public List<Hardware> withManufacturer(String name);
	
}