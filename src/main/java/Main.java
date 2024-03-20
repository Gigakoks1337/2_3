import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            int losowa = random.nextInt(101);
            suma += randomNumber;
            System.out.println("Losowa liczba " + (i + 1) + ": " + losowa);
        }
        System.out.println("Suma losowo wygenerowanych liczb wynosi : " + suma);
    }
}