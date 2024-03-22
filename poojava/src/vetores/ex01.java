package vetores;

import java.util.Scanner;
public class ex01{
    public static void main(String[] args) {
        int vetor[] = new int[15];
        try (Scanner ler = new Scanner(System.in)) {
            for(int c = 0; c < vetor.length; c++){
                System.out.print("Digite o valor para o vetor: ");
                vetor[c] = ler.nextInt();
            }
        }
        for(int valores: vetor){
            System.out.print(valores + "/");
        }
    }
}
