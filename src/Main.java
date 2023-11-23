import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");

        String ciag = scanner.nextLine();

        if (ciag.length() >= 3) {
            String wyciecieSrodka = ciag.substring(ciag.length() / 2, (ciag.length() / 2) +1);
            String polaczenie = wyciecieSrodka.concat(ciag);
            System.out.println(polaczenie);
        }else{
            System.out.println("Nieprawidłowe dane");
        }

    }
}
