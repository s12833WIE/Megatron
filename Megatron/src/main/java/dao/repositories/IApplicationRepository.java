package dao.repositories;

import java.util.Date;
import java.util.List;

import domain.model.Application;

public interface IApplicationRepository extends IRepository<Application>{

	public List<Application> withPrice(String price);
	public List<Application> withDate(Date from, Date to);
}
