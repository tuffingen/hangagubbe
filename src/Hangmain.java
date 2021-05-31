import java.util.Scanner;

public class Hangmain {
    public static void main(String[] args) {
        System.out.println("Startar spelet");

        String[] ord = new String[]{"elefant", "kattspya", "potatis", "kanonkula"};

        String randomWord = ord[(int) Math.random() * ord.length];
        char[] letters = new char [randomWord.length()];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '.';

            
        }

        int liv = 3;

        Scanner scanner = new Scanner(System.in);

        while (liv > 0 ){
            System.out.print("Liv");

            for (int i = 0; i<liv; i++){
                System.out.print("0");
            }
            System.out.println();

            System.out.println("Skriv: ");
            String input = scanner.nextLine();
            char letter = input.charAt(0);
        }
    }
}
