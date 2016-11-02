package br.usjt.arqdesis.clientep2.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import br.usjt.arqdesis.clientep2.R;
import br.usjt.arqdesis.clientep2.model.Cliente;
import br.usjt.arqdesis.clientep2.model.ClienteAdapter;
import br.usjt.arqdesis.clientep2.model.Data;

public class ListaClientesActivity extends AppCompatActivity {
    public static final String NOME = "br.usjt.arqdesis.clientep2.nome";
    public static final String EMAIL = "br.usjt.arqdesis.clientep2.email";
    public static final String FONE = "br.usjt.arqdesis.clientep2.fone";
    Activity atividade;
    Cliente[] lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        atividade = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        lista = Data.buscaClientes(chave);

        BaseAdapter adapter = new ClienteAdapter(lista, this);
        ListView listView = (ListView) findViewById(R.id.lista_clientes);
        listView.setAdapter(adapter);

    }

}
