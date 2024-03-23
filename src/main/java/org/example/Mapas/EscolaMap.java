package org.example.Mapas;

import org.example.Escola;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EscolaMap {
    public static final Map<Integer, Escola> escolas = new HashMap<>();
    private static int nextId = 1;

    public static Escola salvar(Escola escola) {
        escola.setId(nextId++);
        escolas.put(escola.getId(), escola);
        return escola;
    }

    public static Escola getById(int id) {
        return escolas.get(id);
    }

    public static void deletar(int id) {
        escolas.remove(id);
    }
}
