package org.example.Services;

import java.util.Collection;

import org.example.Endereco;
import org.example.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public void incluir(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public void excluir(Integer id) {
        enderecoRepository.deleteById(id);
    }

    public Collection<Endereco> obterLista(){
        return (Collection<Endereco>) enderecoRepository.findAll();
    }

    public Endereco obter(Integer id){
        return enderecoRepository.findById(id).orElse(null);
    }
}
