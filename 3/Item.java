//Cadastro com Sobrecarga Qual será a saída? 

public class Item {
    String nome;
    int quantidade;

    // Construtor com 1 argumento
    public Item(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    // Construtor com 2 argumentos
    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}

//Respuesta Da Terminal: 4