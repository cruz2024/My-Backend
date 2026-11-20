package com.getfin.controllers;


import com.getfin.models.Egreso;
import com.getfin.service.EgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/egreso")
@CrossOrigin(origins = "http://localhost:5173")
public class EgresoController {

    @Autowired
    private EgresoService service;

    @GetMapping
    public List<Egreso> listar(){
        return service.listar();
    }

    @PostMapping
    public Egreso guardar(@RequestBody Egreso egreso){
        return service.guardar(egreso);
    }

    @PutMapping("/{id}")
    public Egreso actualizar(@PathVariable Long id, @RequestBody Egreso egreso){
        return service.actualizar(id, egreso);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }
}
