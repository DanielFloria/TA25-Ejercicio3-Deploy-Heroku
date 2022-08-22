package com.crud.service;

import java.util.List;

import com.crud.dto.Caja;

public interface ICajaService {

	public Caja guardarCaja(Caja caja);
	
	public List<Caja> listarCajas();
	
	public Caja cajaPorId(String num_referencia);
	
	public Caja actualizarCaja(Caja caja);
	
	public void borrarCaja(String num_referencia);
}
