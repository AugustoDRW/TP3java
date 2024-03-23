package org.example.Clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.example.Distrito;
import org.example.Estado;
import org.example.Municipio;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades", name = "localidadeClient")
public interface LocalidadeClient {

    @GetMapping(value = "/estados?orderBy=nome")
    Collection<Estado> obterEstados();

    @GetMapping(value = "/estados/{uf}/municipios")
    Collection<Municipio> obterMunicipioPorUF(@PathVariable Integer uf);

    @GetMapping(value = "/municipios/{municipio}/distritos")
    Collection<Distrito> obterDistritoPorMunicipio(@PathVariable Integer municipio);
}
