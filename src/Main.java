import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Informe do heroi: ");
            String nome = input.nextLine();
            System.out.print("Informe a idade do heroi: ");
            int idade = input.nextInt();
            input.nextLine();
            System.out.print("Informe o tipo heroi [mago, guerreiro, monge ou ninja]: ");
            String tipo = input.nextLine();
            Heroi heroi = new Heroi(nome, idade, tipo.toLowerCase());
            heroi.atacar();
            System.out.print("Deseja criar um novo heroi? [s/n] ");
            String sair = input.nextLine();
            if (sair.toLowerCase().equals("n")) {
                break;
            }
        }

    }
}
