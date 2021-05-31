import java.util.Scanner;

public class Hangmain {
    public static void main(String[] args) {
        System.out.println("Startar spelet");

        String[] ord = new String[]{"elefant", "kattspya", "potatis", "kanonkula"};

        String randomWord = ord[(int) Math.random() * ord.length];
        char[] letters = new char[randomWord.length()];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '.';


        }

        int liv = 3;

        Scanner scanner = new Scanner(System.in);

        while (liv > 0) {
            System.out.print("Liv: ");

            for (int i = 0; i < liv; i++) {
                System.out.print("<3 ");
            }
            System.out.println();

            System.out.println("Input: ");
            String input = scanner.nextLine();
            char letter = input.charAt(0);

            System.out.print("ord: ");

            for (int i = 0; i < letters[i]; i++) {
                System.out.print(letters[i]);
            }

            System.out.println();

            boolean isCorrect = false;

            for (int i = 0; i < randomWord.length(); i++) {
                char l = randomWord.charAt(i);

                if (l ==letter){
                    letters[i] = l;
                    isCorrect = true;
                }
            }
            if(!isCorrect){
                liv = liv -1;
            }

            System.out.println("----------------");
        }
        System.out.println("stänger av spelet");
    }
}
