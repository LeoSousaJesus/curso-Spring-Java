package br.com.senai.jseries;

import br.com.senai.jseries.sevice.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
        }
}
