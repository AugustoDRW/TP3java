package org.example.Controller;
import org.example.Escola;
import org.example.Mapas.ProfessorMap;
import org.example.Professor;
import org.example.Repository.EscolaRepository;
import org.example.Repository.ProfessorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorMap professorMap;

    public ProfessorController(ProfessorMap professorMap) {
        this.professorMap = professorMap;
    }
@GetMapping("/Get")
    public Collection<Professor> obterLista(){
        return null;//professores.values();
    }

    @PostMapping("/Post")
    public Professor criarProfessor(@RequestBody Professor professor) {
        return professorMap.salvar(professor);
    }

    @DeleteMapping("/Delete/{id}")
    public void deletarProfessor(@PathVariable int id) {
        professorMap.deletar(id);
    }

}
