package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.IAlmacenDAO;
import com.crud.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	IAlmacenDAO iAlmacenDAO;
	
	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public List<Almacen> listarAlmacenes() {
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen almacenPorId(Long id) {
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void borrarAlmacen(Long id) {
		iAlmacenDAO.deleteById(id);
	}

}
