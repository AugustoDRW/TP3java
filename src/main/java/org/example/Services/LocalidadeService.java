package org.example.Services;

import java.util.Collection;

import org.example.Clients.EnderecoClient;
import org.example.Distrito;
import org.example.Endereco;
import org.example.Estado;
import org.example.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.example.Clients.EnderecoClient;
import org.example.Clients.LocalidadeClient;

@Service
public class LocalidadeService {

    @Autowired
    private LocalidadeClient localidadeClient;

    @Autowired
    private EnderecoClient enderecoClient;

    public Endereco obterPorCep(String cep) {
        return enderecoClient.obterPorCep(cep);
    }

    public Collection<Estado> obterEstados(){
        return localidadeClient.obterEstados();
    }

    public Collection<Municipio> obterMunicipioPorUF(Integer uf){
        return localidadeClient.obterMunicipioPorUF(uf);
    }

    public Collection<Distrito> obterDistritoPorMunicipio(Integer municipio){
        return localidadeClient.obterDistritoPorMunicipio(municipio);
    }
}
