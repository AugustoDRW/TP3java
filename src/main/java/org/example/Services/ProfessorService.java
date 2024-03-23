package org.example.Services;

import org.example.Mapas.ProfessorMap;
import org.example.Professor;
import org.example.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public void incluir(Professor professor) {
        professorRepository.save(professor);
    }

    public void excluir(int registro) {
        //professores.remove(registro);
    }

    public Collection<Professor> obterLista(){
        return null;//professores.values();
    }

    public Professor obter(int registro){
        return null;//professores.get(registro);
    }
}
