package br.com.leandro.conversorDeMoedas.model;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public Conversao conversao1(String moedaOrigem, String moedaDestino, double valor){
        URI convertido = URI.create("https://v6.exchangerate-api.com/v6/fecfd2229687949b1b4624ab/pair/"+ moedaOrigem + "/" + moedaDestino + "/" + valor);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(convertido)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return  new Gson().fromJson(response.body(), Conversao.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter endereço");
        }
    }
}
