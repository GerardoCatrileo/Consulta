package cl.consulta.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.consulta.web.dao.DataDao;
import cl.consulta.web.model.Register;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(Register user) throws Exception {
		return dataDao.addEntity(user);
	}

	@Override
	public Register getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Register> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
