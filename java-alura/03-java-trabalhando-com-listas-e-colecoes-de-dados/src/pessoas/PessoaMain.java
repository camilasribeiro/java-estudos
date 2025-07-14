package pessoas;

import java.util.ArrayList;

public class PessoaMain {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Camila", 18);
        Pessoa pessoa2 = new Pessoa("Leticia", 27);
        Pessoa pessoa3 = new Pessoa("Vitoria", 21);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}