package br.com.senai.jseries.principal;


import br.com.senai.jseries.model.DadosSerie;
import br.com.senai.jseries.service.ConsumoAPI;
import br.com.senai.jseries.service.ConverteDados;

import java.awt.*;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    public void exibeMenu(){
        System.out.println("Digite o nome da série que deseja buscar");
        var nomeSerie = leitura.nextLine();
        var json = consumo.oberDados(ENDERECO+nomeSerie.replace("","+")+API_KEY);

        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

        System.out.println(dados);
    }
}
