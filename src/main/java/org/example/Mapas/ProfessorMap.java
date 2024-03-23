package org.example.Mapas;

import org.example.Escola;
import org.example.Professor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfessorMap {

    public List<Professor> Professores;
    private static final Map<Integer, Professor> professores = new HashMap<>();
    private static int nextId = 1;

    public static Professor salvar(Professor professor) {
        professor.setId(nextId++);
        professores.put(professor.getId(), professor);
        return professor;
    }

    public static Professor getById(int id) {
        return professores.get(id);
    }

    public static void deletar(int id) {
        professores.remove(id);
    }

}
