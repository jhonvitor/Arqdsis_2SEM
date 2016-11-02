package br.usjt.arqdsis.clientefinal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by arqdsis on 26/10/2016.
 */
public class ClienteRequester {

    OkHttpClient client = new OkHttpClient();

    public ArrayList<Cliente> getClientes(String url) throws IOException {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();

        String strJson = response.body().string();

        try {
            JSONArray jsonArray = new JSONArray(strJson);
            JSONObject jsonObject;
            for(int i = 0; i < jsonArray.length(); i++){
                jsonObject = (JSONObject) jsonArray.get(i);
                int id = jsonObject.getInt("id");
                String nome = jsonObject.getString("nome");
                String fone = jsonObject.getString("fone");
                String email = jsonObject.getString("email");

                Cliente cliente = new Cliente(id,nome,fone,email);

                clientes.add(cliente);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}
