package com.example.prova.service;

import com.example.prova.model.Pessoa;
import com.example.prova.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> listar() {
        return repository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa atualizar(Long id, Pessoa novaPessoa) {
        return repository.findById(id).map(pessoa -> {
            pessoa.setNome(novaPessoa.getNome());
            pessoa.setIdade(novaPessoa.getIdade());
            return repository.save(pessoa);
        }).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
