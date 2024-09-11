import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        
        // atividade1(sc);
        System.out.println("\nCaso 1");
        caso1();
        System.out.println("\nCaso 2");
        caso2();
        System.out.println("\nCaso 3");
        caso3();
        System.out.println("\nCaso 4");
        caso4();
        sc.close();

    }

    // Atividade 1: Achar o segundo maior valor de um array

    public static void atividade1(Scanner sc) {
        Integer[] arr;
        Integer segundoMaiorValor = 0;
        Integer size = 0;

        do {
            System.out.print("Enter with the length value: ");
            size = sc.nextInt();

            if (size < 2) {
                System.out.println("Enter a value greater than or equal to 2.");
            }

        } while (size < 2);

        arr = new Integer[size];

        preencherArray(arr, size);
        segundoMaiorValor = encontrarSegundoMaior(arr);
        for (Integer n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("2nd bigger: " + segundoMaiorValor);
    }

    public static void preencherArray(Integer[] arr, Integer tam) {
        Random random = new Random();

        for (int i = 0; i < tam; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static Integer encontrarSegundoMaior(Integer[] arr) {
        Integer maiorNumero = Integer.MIN_VALUE;
        Integer segundoMaiorNumero = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maiorNumero) {
                segundoMaiorNumero = maiorNumero;
                maiorNumero = arr[i];
            } else if (arr[i] > segundoMaiorNumero && arr[i] != maiorNumero) {
                segundoMaiorNumero = arr[i];
            }
        }

        return segundoMaiorNumero;
    }

    // Atividade 2: impressão
    // Caso 1: | Caso 2: | caso 3:  | caso 4:
    // 1       | 1       |   12345  | xxxxx
    // 12      | 22      |    1234  | x   x
    // 123     | 333     |   123    | x   x
    // 1234    | 4444    |    12    | x   x
    // 12345   | 55555   |    1     | xxxxx

    public static void atividade2(Scanner sc) {}
    
    // Impressão done
    public static void caso1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // impressão done
    public static void caso2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            } 
            System.out.println();
        }
    }

    // Impressão done
    public static void caso3() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void caso4() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               if (i == 0 || i == 4) {
                System.out.print("x");
               } else if (j == 0 || j == 4){
                System.out.print("x");
               } else {
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }

    // Atividade 3
}