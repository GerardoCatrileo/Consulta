package cl.consulta.web.services;

import java.util.List;

import cl.consulta.web.model.Register;

public interface DataServices {
	public boolean addEntity(Register user) throws Exception;
	public Register getEntityById(long id) throws Exception;
	public List<Register> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
