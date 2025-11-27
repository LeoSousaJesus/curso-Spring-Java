package br.com.senai.jseries;

import br.com.senai.jseries.model.DadosSerie;
import br.com.senai.jseries.service.ConsumoAPI;
import br.com.senai.jseries.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JseriesApplication implements CommandLineRunner {



	public static void main(String[] args) {


        SpringApplication.run(JseriesApplication.class, args);


	}
        @Override
        public void run(String...args) throws Exception{
            System.out.println("Olá Mundo Spring Console!");
            var consumoAPI =  new ConsumoAPI();
            var json= consumoAPI.oberDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
            System.out.println(json);

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

            ConverteDados conversor = new ConverteDados();
            DadosSerie dados = conversor.obterDados(json,DadosSerie.class);
            System.out.println(dados);
        }
}
