package dao;

import java.sql.Connection;

import dao.mappers.IMapResultSetIntoEntity;
import dao.repositories.IApplicationRepository;
import dao.uow.IUnitOfWork;
import domain.model.Application;

public class ApplicationRepository extends RepositoryBase<Application> 
implements IApplicationRepository{
	
	public ApplicationRepository(Connection connection, 
			IMapResultSetIntoEntity<Application> mapper, IUnitOfWork uow) {
		super(connection, mapper, uow);
	}
}
