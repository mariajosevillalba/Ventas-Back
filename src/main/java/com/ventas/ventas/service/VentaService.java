package com.ventas.ventas.service;

import com.ventas.ventas.model.Venta;
import com.ventas.ventas.repository.IVenta;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VentaService implements ICRUDService<Venta>{

    @Autowired
    private IVenta ventaRepository;

    @Override
    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    @Override
    public Optional<Venta> findById(Integer id) {
        return ventaRepository.findById(id);
    }

    @Override
    public Venta create(Venta model) {
        return ventaRepository.save(model);
    }

    @Override
    public Venta update(Venta model) {
        return ventaRepository.save(model);
    }

    @Override
    public void delete(Integer id) {
        ventaRepository.deleteById(id);
    }
}
