import game.Game;
import game.GameOpt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Olá! Bem vindo ao jogo de advinhação de um número aleatório!\n");
        Game game = new Game();
        System.out.println("Número aleatório inicializado com sucesso, você terá 10 tentativas para advinhar, boa sorte!");
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Digite um número inteiro entre 1 e 100 (inclusivo): ");
            Integer guess = input.nextInt();
            GameOpt temp = game.compare(guess);
            if(temp.equals(GameOpt.ACERTOU)){
                System.out.println("Parabéns, você acertou o número em " + game.getTentativas() + " tentativas!");
                break;
            }
            else if(temp.equals(GameOpt.ERROU)){
                System.out.println("Infelizmente acabou as tentativas, o número era: " + game.getRandnumber());
                break;
            }
            else if(temp.equals(GameOpt.MAIOR))
                System.out.println("O número digitado é MAIOR que o que você deve acertar, você ainda tem " + (game.getMaxTentativas() - game.getTentativas()) + " tentativas!");
            else
                System.out.println("O número digitado é MENOR que o que você deve acertar, você ainda tem " + (game.getMaxTentativas() - game.getTentativas()) + " tentativas!");
        }
        input.close();
    }
}