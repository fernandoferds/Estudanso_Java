import java.util.Scanner;
import java.util.Random;

public class Adivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        boolean acerto = false;
        System.out.println(aleatorio);

        for(int i = 0; i<5; i++) {
            int palpite = leitura.nextInt();
            if (palpite >= 0 && palpite <= 100) {
                if (palpite == aleatorio) {
                    System.out.println("Voce acertou");
                    acerto = true;
                    break;
                } else if (palpite > aleatorio) {
                    System.out.println("seu palpite foi maior que o numero gerado");
                } else if (palpite < aleatorio) {
                    System.out.println("seu palpite foi menor que o numero gerado");
                }
            }else {
                System.out.println("Palpite invalido");
            }
        }

    if(!acerto){
        System.out.println("Suas tentativas acabaram");
    }
    }
}
