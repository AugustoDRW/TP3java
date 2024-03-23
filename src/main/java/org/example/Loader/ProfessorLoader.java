package org.example.Loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import org.example.Endereco;
import org.example.Professor;
import org.example.Services.LocalidadeService;
import org.example.Services.ProfessorService;

@Component
public class ProfessorLoader implements ApplicationRunner {

    @Autowired
    private LocalidadeService localidadeService;
    @Autowired
    private ProfessorService professorService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Endereco enderecoProfessor = localidadeService.obterPorCep("20041-005");

        professorService.incluir(new Professor());

        professorService.excluir(123);

        professorService.incluir(new Professor(enderecoProfessor));

        System.out.println(" - " + professorService.obter(123));

        Professor professor = new Professor();
        professor.setRegistro(234);
        professor.setNome("Professor Elberth Moraes");
        professor.setSalario(777);
        professor.setMestre(false);
        professor.setEndereco(new Endereco("20010020", "Prof Rua São José", "Prof 4º andar", "Prof Centro", "Prof Rio de Janeiro", "UF"));

        professorService.incluir(professor);

        System.out.println(" - " + professorService.obterLista());
    }
}
