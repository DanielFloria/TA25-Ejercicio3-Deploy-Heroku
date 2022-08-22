package com.crud.service;

import java.util.List;

import com.crud.dto.Almacen;

public interface IAlmacenService {
	public Almacen guardarAlmacen(Almacen almacen);
	
	public List<Almacen> listarAlmacenes();
	
	public Almacen almacenPorId(Long id);
	
	public Almacen actualizarAlmacen(Almacen almacen);
	
	public void borrarAlmacen(Long id);
}
