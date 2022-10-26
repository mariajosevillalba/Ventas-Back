package com.ventas.ventas.service;
import com.ventas.ventas.model.Producto;
import com.ventas.ventas.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductoService implements ICRUDService<Producto>{

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public List findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Optional findById(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto create(Producto model) {
        return productoRepository.save(model);
    }

    @Override
    public Producto update(Producto model) {
        return productoRepository.save(model);
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }
}
