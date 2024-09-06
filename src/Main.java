import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);

        Integer[] arr;
        Integer maiorNumero = 0;
        Integer menorNumero = 0;

        System.out.print("Enter with the length value: ");
        int tam = sc.nextInt();
        arr = new Integer[tam];

        preencherArray(arr, tam);

        for (Integer n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("2nd bigger: " + encontrarSegundoMaior(arr, maiorNumero, menorNumero));

        sc.close();

    }

    public static void preencherArray(Integer[] arr, Integer tam) {
        Random random = new Random();

        for (int i = 0; i < tam; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static Integer encontrarSegundoMaior(Integer[] arr, Integer maiorNumero, Integer menorNumero) {
        if (arr.length <= 1) {
            throw new Error("Invalid array length. Please enter a length bigger than 1.");
        }

        for (Integer value : arr) {
            if (value > maiorNumero) {
                maiorNumero = value;
            }

            for (Integer integer : arr) {
                if (!Objects.equals(integer, value) && integer < maiorNumero && integer > menorNumero) {
                    menorNumero = integer;
                }
            }

        }

        return menorNumero;
    }
}