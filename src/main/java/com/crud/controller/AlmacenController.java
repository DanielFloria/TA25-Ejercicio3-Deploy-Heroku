package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.Almacen;
import com.crud.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes() {
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen almacenPorId(@PathVariable(name="codigo") Long id) {
		Almacen almacenPorId = new Almacen();
		almacenPorId = almacenServiceImpl.almacenPorId(id);

		return almacenPorId;
	}	
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacen(@PathVariable(name="codigo") Long id, @RequestBody Almacen almacen) {
		Almacen almacenSeleccionado = new Almacen();
		Almacen almacenActualizado = new Almacen();
		
		almacenSeleccionado = almacenServiceImpl.almacenPorId(id);
		
		almacenSeleccionado.setLugar(almacen.getLugar());
		almacenSeleccionado.setCapacidad(almacen.getCapacidad());
		almacenSeleccionado.setCaja(almacen.getCaja());
		
		almacenActualizado = almacenServiceImpl.actualizarAlmacen(almacenSeleccionado);
		
		return almacenActualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void borrarAlmacen(@PathVariable(name="codigo") Long id) {
		almacenServiceImpl.borrarAlmacen(id);
	}
}

