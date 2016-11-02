package br.usjt.arqdsis.clientefinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ListarClientesActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_clientes);
        Intent intent = getIntent();
        ArrayList<Cliente> lista = (ArrayList<Cliente>) intent.getSerializableExtra(MainActivity.LISTA);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listaNome(lista));

        listView = (ListView)findViewById(R.id.lista_de_clientes);

        // ArrayAdapter<?>
    }

    public ArrayList<String> listaNome(  ArrayList<Cliente> lista){
        ArrayList<String> nomes = new ArrayList<String>();

        for(Cliente cliente: lista){
            nomes.add(cliente.getNome());
        }

        return nomes;
    }



}
