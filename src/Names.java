import java.util.Scanner;

public class Names {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String names[] = new String[5];
        int i = 0;
        int lenght = 5;
        do {
            System.out.println("Podaj imię");
            names[i] = input.nextLine();
            i++;
        } while (i < lenght);
        input.close();

        i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }
        do {
            i--;
            System.out.println("Cześć " + names[i]);
        } while (i > 0);
    }
}