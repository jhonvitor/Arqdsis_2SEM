package arqdesis.usjt.br.clientep1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);

        Intent intent = getIntent();
        String nome = intent.getStringExtra(ListaClientesActivity.NOME);
        TextView textview = (TextView) findViewById(R.id.nome_cliente);
        textview.setText(nome);

    }
}
