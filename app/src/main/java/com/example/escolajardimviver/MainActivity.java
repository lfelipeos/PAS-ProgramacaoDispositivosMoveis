package com.example.escolajardimviver;

    import android.os.Bundle;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

    import androidx.appcompat.app.AppCompatActivity;

    import com.example.escolajardimviver.dto.ResponsavelDTO;

public class MainActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etSobrenome;
    private EditText etEmail;
    private EditText etIdade;
    private EditText etEndereco;
    private Button btnSalvar;

    private ResponsavelDTO responsavelDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = findViewById(R.id.etNome);
        etSobrenome = findViewById(R.id.etSobrenome);
        etEmail = findViewById(R.id.etEmail);
        etIdade = findViewById(R.id.etIdade);
        etEndereco = findViewById(R.id.etEndereco);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            cadastrarResponsavel();
        });
    }

    private void cadastrarResponsavel() {
        String nome = etNome.getText().toString().trim();
        String sobrenome = etSobrenome.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String textoIdade = etIdade.getText().toString().trim();
        String endereco = etEndereco.getText().toString().trim();

        if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || textoIdade.isEmpty() || endereco.isEmpty()){
            Toast.makeText(this, "Por favor, preencha todos os campos!", Toast.LENGTH_LONG).show();
            return;
        }

        int idade;
        try{
            idade = Integer.parseInt(textoIdade);
        } catch (NumberFormatException e) {
            etIdade.setError("Idade inválida!");
            return;
        }

        responsavelDTO = new ResponsavelDTO(nome, sobrenome, email, idade, endereco);

        String mensagemSucesso = "Cadastro realizado!\n" +
                "Responsável: " + responsavelDTO.getNome() + " " + responsavelDTO.getSobrenome();

        Toast.makeText(this, mensagemSucesso, Toast.LENGTH_LONG).show();
    }
}
