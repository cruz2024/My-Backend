package com.getfin.controllers;

import com.getfin.models.Usuario;
import com.getfin.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173") /** Lo habilite para el frontend */
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    /** Registro */
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Usuario usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(Map.of("success", false, "message", "Email ya registrado"));
        }
        Usuario nuevo = usuarioRepository.save(usuario);
        return ResponseEntity.ok(Map.of("success", true, "usuario", nuevo));
    }

    /** Login */
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario loginData) {
        Usuario usuario = usuarioRepository.findByEmail(loginData.getEmail());
        if (usuario != null && usuario.getPassword().equals(loginData.getPassword())) {
            return ResponseEntity.ok(Map.of("success", true, "usuario", usuario));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("success", false));
    }

    /** Listar usuarios (GET) */
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(usuarioRepository.findAll());
    }
}
