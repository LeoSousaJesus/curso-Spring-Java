package br.com.senai.jseries;

import br.com.senai.jseries.model.DadosEpisodio;
import br.com.senai.jseries.model.DadosSerie;
import br.com.senai.jseries.model.DadosTemporada;
import br.com.senai.jseries.principal.Principal;
import br.com.senai.jseries.service.ConsumoAPI;
import br.com.senai.jseries.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JseriesApplication implements CommandLineRunner {


    public static void main(String[] args) {


        SpringApplication.run(JseriesApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibeMenu();

        System.out.println("Olá Mundo Spring Console!");
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.oberDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
        // System.out.println(json);
        //json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
        //System.out.println(json);
        //ConverteDados conversor = new ConverteDados();
        //DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

        // Próximo passo - Transfomrar esse JSON em objetos Java com Jackson.

        // O que é serializar e desserializar?
            /* Serializar é converter um objeto em um fluxo de bytes para ser salvo ou enviado, enquanto a desserialização é o processo inverso,
            reconvertendo o fluxo de bytes em um objeto
            */

        // Qual a diferença entre @JsonProperty e @JsonAlias?
            /*
                Os dois não tem o mesmo comportamento
                JSON --> java
                java --> JSON
                JsonAlias --> permite apelido
                JsonProperty --> não permite apelido
                API criada pela turma em SpringBoot para o ESP32
                Buscar uma API Web Externa de Pokemon = @JsonAlias
             */



        //System.out.println(dados);
        json = consumoAPI.oberDados("https://omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=6585022c");
        //DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
        //System.out.println(dadosEpisodio);

        List<DadosTemporada> temporadas = new ArrayList<>();
        System.out.println(temporadas);

        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            json = consumoAPI.oberDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=6585022c");
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);

        }
        temporadas.forEach(System.out::println);


    }
}