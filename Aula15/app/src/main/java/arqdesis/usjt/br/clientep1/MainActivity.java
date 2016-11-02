package arqdesis.usjt.br.clientep1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    public static final String CHAVE =  "br.usjt.arqdesis.clientep1.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById( R.id.busca_nome_cliente );
    }

    public void buscarClientes(View view){

        Intent intent = new Intent(this, ListaClientesActivity.class);

        String chave = nome.getText().toString();

        intent.putExtra(CHAVE, chave);

        startActivity(intent);

    }
}
