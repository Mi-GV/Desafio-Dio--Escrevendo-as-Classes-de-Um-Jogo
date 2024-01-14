public class Heroi {
    String ataque;
    String nome;
    int idade;
    String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        if (this.tipo.equals("mago")) {
            this.ataque = "magia";
        } else if (this.tipo.equals("guerreiro")) {
            this.ataque = "espada";
        } else if (this.tipo.equals("monge")) {
            this.ataque = "artes marciais";
        } else if (this.tipo.equals("ninja")) {
            this.ataque = "shuriken";
        } else {
            this.tipo = "- " + this.tipo + " - é um TIPO INVÁLIDO";
            this.ataque = "ATAQUE INVÁLIDO";
        }
        System.out.println("O " + this.tipo + " atacou usando " + this.ataque);
    }
}

