/*
 * Created on 14 nov 2013 ( Time 17:20:05 )
 * Generated by Telosys Tools Generator ( version 2.0.6 )
 */

package com.lix.clientes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lix.clientes.dao.ClientesDao;
import com.lix.clientes.dto.ClientesDto;
import com.lix.clientes.model.Clientes;
import com.lix.clientes.service.ClientesService;
import com.lix.dto.DefaultResponse;
import com.lix.dto.PaginationParams;
import com.lix.web.Page;

/**
 * JPA implementation for basic persistence operations ( entity "Clientes" )
 * 
 * @author Telosys Tools Generator
 * 
 */

@Component("clientesService")
public class ClientesServiceImpl implements ClientesService {

	@Autowired
	ClientesDao clientesDao;

	@Override
	public void save(Clientes entity) {
		clientesDao.save(entity);
	}

	@Override
	public Clientes update(Clientes entity) {
		return clientesDao.update(entity);

	}

	@Override
	public void delete(Clientes entity) {
		clientesDao.delete(entity);

	}

	@Override
	public List<Clientes> findAll() {
		return clientesDao.findAll();
	}

	@Override
	public Clientes getById(Integer id) {
		return clientesDao.findOne(id);
	}

	@Override
	public void deleteById(Integer id) {
		clientesDao.deleteById(id);

	}

	@Override
	public DefaultResponse createOrUpdate(ClientesDto dto) {
		DefaultResponse response = new DefaultResponse();
		try {
			Clientes ent = com.lix.util.BeanUtils.copyProperties(dto,
					Clientes.class);
			ent = this.update(ent);
			response.setId(ent.getId());
		} catch (Exception e) {
			response.setSuccess(false);
			response.setMessage(e.getMessage());
		}
		return response;
	}

	@Override
	public List<Clientes> findByName(String name) {
		return clientesDao.findByName(name);

	}

	@Override
	public List<Clientes> getPage(PaginationParams params) {
		return clientesDao.getPage(params);
	}

	@Override
	public Page<ClientesDto> findPage(ClientesDto dto) {
		return clientesDao.findPage(dto);
	}

}
