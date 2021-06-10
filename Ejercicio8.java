import java.util.Scanner;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Random r = new Random();
        String Pausa = " ";
        do {
            int Num = r.nextInt(25) * 5;
            System.out.println(Num);
            Pausa = src.nextLine();

        } while (!Pausa.equals("S"));
    }

}
