package com.ventas.ventas.repository;

import com.ventas.ventas.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository <Producto, Integer> {
}