package com.getfin.service;

import com.getfin.models.Ingreso;
import com.getfin.repository.IngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngresoService {
    @Autowired
    private IngresoRepository repository;

    public Ingreso guardar(Ingreso ingreso){
        return repository.save(ingreso);
    }

    public List<Ingreso> listar(){
        return repository.findAll();
    }

    public Ingreso actualizar(Long id, Ingreso ingreso){
        Ingreso existente = repository.findById(id).orElseThrow();
        existente.setCategoria(ingreso.getCategoria());
        existente.setProducto_servicio(ingreso.getProducto_servicio());
        existente.setCantidad(ingreso.getCantidad());
        existente.setMonto(ingreso.getMonto());
        existente.setFecha(ingreso.getFecha());
        existente.setDescripcion(ingreso.getDescripcion());
        return repository.save(existente);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
