package org.example.Services;

import java.util.Collection;

import org.example.Escola;
import org.example.Repository.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscolaService {

    @Autowired
    private EscolaRepository escolaRepository;

    public void incluir(Escola escola) {
        escolaRepository.save(escola);
    }

    public void excluir(String nome) {
        //escolas.remove(nome);
    }

    public Collection<Escola> obterLista(){
        return null;//escolas.values();
    }

    public Escola obter(String nome){
        return null;//escolas.get(nome);
    }
}
