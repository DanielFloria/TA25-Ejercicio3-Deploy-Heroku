package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.ICajaDAO;
import com.crud.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService {

	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public Caja guardarCaja(Caja caja) {
		return iCajaDAO.save(caja); 
	}

	@Override
	public List<Caja> listarCajas() {
		return iCajaDAO.findAll();
	}

	@Override
	public Caja cajaPorId(String num_referencia) {
		return iCajaDAO.findById(num_referencia).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public void borrarCaja(String num_referencia) {
		iCajaDAO.deleteById(num_referencia);		
	}

}
