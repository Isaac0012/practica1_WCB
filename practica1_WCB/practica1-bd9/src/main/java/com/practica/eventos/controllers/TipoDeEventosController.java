package com.practica.eventos.controller;

import com.practica.eventos.model.TipoDeEventos;
import com.practica.eventos.service.TipoDeEventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tiposDeEventos")
public class TipoDeEventosController {

    @Autowired
    private TipoDeEventosService tipoDeEventosService;

    @GetMapping
    public List<TipoDeEventos> getAllTiposDeEventos() {
        return tipoDeEventosService.getAllTiposDeEventos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDeEventos> getTipoDeEventosById(@PathVariable String id) {
        Optional<TipoDeEventos> tipoDeEventos = tipoDeEventosService.getTipoDeEventosById(id);
        if (tipoDeEventos.isPresent()) {
            return ResponseEntity.ok(tipoDeEventos.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public TipoDeEventos createTipoDeEventos(@RequestBody TipoDeEventos tipoDeEventos) {
        return tipoDeEventosService.createTipoDeEventos(tipoDeEventos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoDeEventos(@PathVariable String id) {
        Optional<TipoDeEventos> tipoDeEventos = tipoDeEventosService.getTipoDeEventosById(id);
        if (tipoDeEventos.isPresent()) {
            tipoDeEventosService.deleteTipoDeEventos(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
