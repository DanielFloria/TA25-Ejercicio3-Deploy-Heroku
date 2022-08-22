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

import com.crud.dto.Caja;
import com.crud.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;

	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaServiceImpl.guardarCaja(caja);
	}

	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServiceImpl.listarCajas();
	}

	@GetMapping("/cajas/{num_referencia}")
	public Caja cajaPorId(@PathVariable(name="num_referencia") String num_referencia) {
		Caja cajaPorId = new Caja();
		cajaPorId = cajaServiceImpl.cajaPorId(num_referencia);

		return cajaPorId;
	}	

	@PutMapping("/cajas/{num_referencia}")
	public Caja actualizarCaja(@PathVariable(name="num_referencia") String num_referencia, @RequestBody Caja caja) {
		Caja cajaSeleccionado = new Caja();
		Caja cajaActualizado = new Caja();

		cajaSeleccionado = cajaServiceImpl.cajaPorId(num_referencia);

		cajaSeleccionado.setContenido(caja.getContenido());
		cajaSeleccionado.setValor(caja.getValor());
		cajaSeleccionado.setAlmacen(caja.getAlmacen());

		cajaActualizado = cajaServiceImpl.actualizarCaja(cajaSeleccionado);

		return cajaActualizado;
	}

	@DeleteMapping("/cajas/{num_referencia}")
	public void borrarCaja(@PathVariable(name="num_referencia") String num_referencia) {
		cajaServiceImpl.borrarCaja(num_referencia);
	}

}

