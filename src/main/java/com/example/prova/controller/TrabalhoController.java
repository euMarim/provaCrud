package com.example.prova.controller;

import com.example.prova.dto.TrabalhoDTO;
import com.example.prova.model.Pessoa;
import com.example.prova.model.Trabalho;
import com.example.prova.service.TrabalhoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalhos")
public class TrabalhoController {
    private final TrabalhoService service;

    public TrabalhoController(TrabalhoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Trabalho> listar() {
        return service.listar();
    }

    @PostMapping
    public Trabalho salvar(@RequestBody TrabalhoDTO dto) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(dto.getPessoaId());

        Trabalho trabalho = new Trabalho();
        trabalho.setCargo(dto.getCargo());
        trabalho.setEmpresa(dto.getEmpresa());
        trabalho.setPessoa(pessoa);

        return service.salvar(trabalho);
    }

    @PutMapping("/{id}")
    public Trabalho atualizar(@PathVariable Long id, @RequestBody TrabalhoDTO dto) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(dto.getPessoaId());

        Trabalho trabalho = new Trabalho();
        trabalho.setCargo(dto.getCargo());
        trabalho.setEmpresa(dto.getEmpresa());
        trabalho.setPessoa(pessoa);

        return service.atualizar(id, trabalho);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

