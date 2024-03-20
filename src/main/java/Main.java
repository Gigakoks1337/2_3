import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(101);
            sum += randomNumber;
            System.out.println("Losowa liczba " + (i + 1) + ": " + randomNumber);
        }
        System.out.println("Suma losowo wygenerowanych liczb wynosi : " + sum);
    }
}