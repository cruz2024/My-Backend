package com.getfin.service;

import com.getfin.models.Egreso;
import com.getfin.repository.EgresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EgresoService {
    @Autowired
    private EgresoRepository repository;

    public Egreso guardar(Egreso egreso){
        return repository.save(egreso);
    }

    public List<Egreso> listar(){
        return repository.findAll();
    }

    public Egreso actualizar(Long id, Egreso egreso){
        Egreso existente = repository.findById(id).orElseThrow();
        existente.setCategoria(egreso.getCategoria());
        existente.setProducto_servicio(egreso.getProducto_servicio());
        existente.setCantidad(egreso.getCantidad());
        existente.setMonto(egreso.getMonto());
        existente.setFecha(egreso.getFecha());
        existente.setDescripcion(egreso.getDescripcion());
        return repository.save(existente);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
