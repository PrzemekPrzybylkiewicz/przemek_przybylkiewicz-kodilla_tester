import java.util.Random;

public class User { // tu znajdują sie dwa zadania z loop


    public int randomNumber() {
        Random random = new Random();

        int result = 0;
        int max = 0;
        int min = 31;
        int[] sum = new int[5000];  // Nie wiem jak poprawnie deklarowac wielkosć tabeli.

        for (int i = 0; i < sum.length; i++) {
            sum[i] = random.nextInt(30) + 1; // Random tabela od 1 do 30
            result = result + sum[i];           // wynik dodawnia

            System.out.println(sum[i]);
            //   System.out.println("min " + min );
            //   System.out.println("max " + max );
            if (min >= sum[i]) {  // sprawdzenie min
                min = sum[i];
            }
            if (max <= sum[i]) {  //sprawdzenie max
                max = sum[i];
            }
            if (result >= 5000) {
                System.out.println("min" + min); // Min liczba
                System.out.println("max" + max); // Max liczba
                System.out.println("Wynik dodawania rówana się 5000");
                break; // Brak pomysłu, zatrzymanie na siłę.
            }
        }
        return result;


    }
}