import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);

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

        sc.close();

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
}