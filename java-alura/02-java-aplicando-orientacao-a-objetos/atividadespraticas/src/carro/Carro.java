package carro;

import java.time.LocalDateTime;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calcularIdadeCarro(){
        int idadeCarro = LocalDateTime.now().getYear() - ano;
        return idadeCarro;
    }
}
