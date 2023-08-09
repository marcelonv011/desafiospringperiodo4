package br.com.uniamerica.desafio.desafioperiodo4.controller;

import br.com.uniamerica.desafio.desafioperiodo4.dto.ValorDto;
import br.com.uniamerica.desafio.desafioperiodo4.service.ValorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/api/valor")
public class ValorController {

    private List<Double> valoresGuardados;

    @Autowired
    private ValorService valorService;

    @PostMapping
    public ResponseEntity<ValorDto> cadastrar(@RequestBody final List<Double> valores){
        valoresGuardados = valores;
        ValorDto valorDto = valorService.obtenerDatos(valores);
        return ResponseEntity.ok(valorDto);
    }

    @GetMapping("/lista")
    public ResponseEntity<ValorDto> findAll() {
     ValorDto valorDto = valorService.mostrarDatos(valoresGuardados);
     return ResponseEntity.ok(valorDto);
    }


}
