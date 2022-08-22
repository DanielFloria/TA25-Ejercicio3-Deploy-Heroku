package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Long>{

}
