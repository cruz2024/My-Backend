package com.getfin.controllers;

import com.getfin.models.Modulo;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/modulos")
@CrossOrigin(origins = "http://localhost:5173")
public class ModuloController {

    @GetMapping
    public List<Modulo> listarModulos() {
        return List.of(
                new Modulo("Dashboard Principal", "/dashboard"),
                new Modulo("Control Financiero", "/control-financiero"),
                new Modulo("Gestión Agropecuaria", "/gestion-agropecuaria"),
                new Modulo("Gestión Agrícola", "/gestion-agricola"),
                new Modulo("Prácticas Estudiantiles", "/practicas"),
                new Modulo("Configuración y Seguridad", "/configuracion")
        );
    }
}
