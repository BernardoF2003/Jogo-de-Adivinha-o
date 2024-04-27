package game;
import java.util.Random;

public class Game{
    private Integer randnumber, tentativas;
    private final Integer maxTentativas = 10; // O trabalho não especifica quantas tentativas, por isso, deixei 10
                                              // Caso queira, pode usar o rand.nextInt(100) + 1 para gerar
                                              // um número de tentativas aleatórias entre um e 100, mas preferi deixar com 10
    public Game(){
        this.tentativas = 0;
        this.init();
    }
    public Integer getTentativas(){
        return this.tentativas;
    }

    public Integer getRandnumber(){
        return this.randnumber;
    }

    public Integer getMaxTentativas(){
        return this.maxTentativas;
    }

    private void init(){
        Random rand = new Random();
        this.randnumber = rand.nextInt(100) + 1;
    }

    public GameOpt compare(Integer usrInput){
        tentativas++;
        if(usrInput.equals(this.randnumber))
            return GameOpt.ACERTOU;
        if(this.maxTentativas.equals(tentativas))
            return GameOpt.ERROU;
        return usrInput > this.randnumber ? GameOpt.MENOR : GameOpt.MAIOR;
    }
}
