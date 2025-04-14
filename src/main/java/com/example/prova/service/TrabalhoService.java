package com.example.prova.service;

import com.example.prova.model.Trabalho;
import com.example.prova.repository.TrabalhoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabalhoService {
    private final TrabalhoRepository repository;

    public TrabalhoService(TrabalhoRepository repository) {
        this.repository = repository;
    }

    public List<Trabalho> listar() {
        return repository.findAll();
    }

    public Trabalho salvar(Trabalho trabalho) {
        return repository.save(trabalho);
    }

    public Trabalho atualizar(Long id, Trabalho novoTrabalho) {
        return repository.findById(id).map(trabalho -> {
            trabalho.setCargo(novoTrabalho.getCargo());
            trabalho.setEmpresa(novoTrabalho.getEmpresa());
            trabalho.setPessoa(novoTrabalho.getPessoa());
            return repository.save(trabalho);
        }).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

