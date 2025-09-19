package com.exemplo.agenda;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        ListView listaAlunos = findViewById(R.id.lista_alunos);
        // TODO: Carregar do DAO
        ArrayAdapter<Aluno> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new AlunoDAO().buscarTodos());
        listaAlunos.setAdapter(adapter);
    }
}
