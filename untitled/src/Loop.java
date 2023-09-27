import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double notaIndividual = 0;
        int totalDeNotas = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme");
            notaIndividual = leitura.nextDouble();
            mediaAvaliacao += notaIndividual;
        }
        System.out.println("Media de avaliação " + mediaAvaliacao/3);

        mediaAvaliacao = 0;

        while (notaIndividual != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");

            notaIndividual = leitura.nextDouble();

            if(notaIndividual != -1){
                mediaAvaliacao += notaIndividual;
                totalDeNotas++;}

        }
        System.out.println("Media de avaliação " + mediaAvaliacao/totalDeNotas);

    }
}
