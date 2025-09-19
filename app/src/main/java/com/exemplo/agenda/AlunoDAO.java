package com.exemplo.agenda;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private final static List<Aluno> alunos = new ArrayList<>();
    private static int contadorId = 0;

    public void inserir(Aluno aluno) {
        aluno.setId(contadorId++);
        alunos.add(aluno);
    }

    public List<Aluno> buscarTodos() {
        return new ArrayList<>(alunos);
    }
}
