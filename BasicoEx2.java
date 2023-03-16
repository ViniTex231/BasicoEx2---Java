import java.util.Random;
public class BasicoEx2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1;
        }

        int MaiorValor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > MaiorValor) {
                MaiorValor = vetor[i];
            }
        }
        int MenorValor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < MenorValor) {
                MenorValor = vetor[i];
            }
        }

        System.out.println("O maior valor é: " + MaiorValor);
        System.out.println("O menor valor é: " + MenorValor);
    }
}
