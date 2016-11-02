package br.usjt.arqdsis.clientefinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText texto;
    public static final String LISTA = "br.usjt.arqdsis.clientefinal.lista";
    ArrayList<Cliente> lista;
    ClienteRequester requester;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buscando objeto EditText do xml
        texto = (EditText) findViewById(R.id.busca_cliente);
    }

    public void buscarClientes(View view){
        requester = new ClienteRequester();
        intent = new Intent(this, ListarClientesActivity.class);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    lista = requester.getClientes("http://10.0.2.2:8080/arqdesis_poetas_(1)/cliente");
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            intent.putExtra(LISTA,lista);
                            startActivity(intent);
                        }
                    });
                    }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
