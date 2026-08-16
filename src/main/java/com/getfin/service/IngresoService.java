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
        existente.setNombre(ingreso.getNombre());
        existente.setCantidad(ingreso.getCantidad());
        existente.setFecha(ingreso.getFecha());
        return repository.save(existente);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
