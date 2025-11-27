package br.com.senai.jseries.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {
    //separar responsabilidades
    //código limpo, testável e reutilizável

    // assinatura do metodo - endereço (pegar o endereço da API)
    public String oberDados(String endereco) {
        // Objeto que representa o cliente
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = null;
        try{
            response = client.send(request,HttpResponse.BodyHandlers.ofString());

        }catch(IOException e){
            throw new RuntimeException();

        }catch(InterruptedException e) {
            throw new RuntimeException();
        }

        String json = response.body();
        return json;
    }
}
