package com.getfin.controllers;

import com.getfin.models.Ingreso;
import com.getfin.service.IngresoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingreso")
@CrossOrigin(origins = "http://localhost:5173")
public class IngresoController {
    @Autowired
    private IngresoService service;

    @GetMapping
    public List<Ingreso> listar(){
        return service.listar();
    }

    @PostMapping
    public Ingreso guardar(@Valid @RequestBody Ingreso ingreso){
        return service.guardar(ingreso);
    }

    @PutMapping("/{id}")
    public Ingreso actualizar(@PathVariable Long id, @Valid @RequestBody Ingreso ingreso){
        return service.actualizar(id, ingreso);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }

}
