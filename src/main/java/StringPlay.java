import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class StringPlay {

//    public static String capitalizedLetter(String letter) {
////        return letter.toUpperCase();
//        return StringUtils.upperCase(letter);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a letter: ");
//        String letter = scanner.next();
//        System.out.println(capitalizedLetter("q"));
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = scanner.nextLine();
        System.out.printf("You Entered: %s\n", input);
        if(StringUtils.isNumeric(input)) {
            System.out.printf("%s is a number.\n", input);
        } else {
            System.out.printf("%s is NOT a number.\n", input);
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(input));
        System.out.println("Reversed " + StringUtils.reverse(input));
    }
}
