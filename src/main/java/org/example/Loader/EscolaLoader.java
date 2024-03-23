package org.example.Loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import org.example.Endereco;
import org.example.Escola;
import org.example.Services.EscolaService;
import org.example.Services.LocalidadeService;

@Component
public class EscolaLoader implements ApplicationRunner {

    @Autowired
    private LocalidadeService localidadeService;
    @Autowired
    private EscolaService escolaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Endereco enderecoInfnet = localidadeService.obterPorCep("22241900");

        escolaService.incluir(new Escola("Infnet", "infnet@infnet", enderecoInfnet));

        escolaService.excluir("Infnet");

        escolaService.incluir(new Escola("Instituto Infnet", "instituto@infnet", enderecoInfnet));

        System.out.println(" - " + escolaService.obter("Instituto Infnet"));

        escolaService.incluir(new Escola("Computação do Infnet", "computacao@infnet", enderecoInfnet));

        System.out.println(" - " + escolaService.obterLista());
    }
}
