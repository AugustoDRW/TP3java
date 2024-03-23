package org.example.Controller;
import org.example.Escola;
import org.example.Mapas.EscolaMap;
import org.example.Mapas.EscolaMap;
import org.example.Escola;
import org.springframework.web.bind.annotation.*;
import  org.example.Repository.EscolaRepository;

import java.util.Collection;
import java.util.List;
@RestController
@RequestMapping("/escolas")
public class EscolaController {

    private final EscolaMap escolaMap;

    public EscolaController(EscolaMap escolaMap) {
        this.escolaMap = escolaMap;
    }
    @GetMapping("/Get")
    public Collection<Escola> obterLista(){
        return EscolaMap.escolas.values();
    }

    @PostMapping("/Post")
    public Escola criarEscola(@RequestBody Escola escola) {
        return escolaMap.salvar(escola);
    }

    @DeleteMapping("/Delete/{id}")
    public void deletarEscola(@PathVariable int id) {
        escolaMap.deletar(id);
    }


}
