package com.exemplo.agenda;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {
    private EditText campoNome, campoTelefone, campoEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        campoNome = findViewById(R.id.edit_nome);
        campoTelefone = findViewById(R.id.edit_telefone);
        campoEmail = findViewById(R.id.edit_email);

        Button botaoSalvar = findViewById(R.id.botao_salvar);
        botaoSalvar.setOnClickListener(v -> {
            // TODO: Salvar aluno no DAO
            Aluno aluno = new Aluno();
            aluno.setNome(campoNome.getText().toString());
            aluno.setTelefone(campoTelefone.getText().toString());
            aluno.setEmail(campoEmail.getText().toString());

            new AlunoDAO().inserir(aluno);
            finish();
        });
    }
}
