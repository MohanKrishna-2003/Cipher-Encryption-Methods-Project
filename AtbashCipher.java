package CipherMethods;
import java.util.HashMap;
import java.util.Scanner;
public class AtbashCipher{
    public AtbashCipher() {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("1.Encrypt\n2.Decrypt\n3.Exit\nEnter your choice");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter Text:");
                text = input.nextLine();
                System.out.println("The Encrypted Message is :" + atbash(text));
                break;
            case 2:
                System.out.print("Enter Text:");
                text = input.nextLine();
                System.out.println("The Decrypted Message is :" + atbash(text));
                break;
            default:
                System.out.println("Choose a valid option");
        }
    }
    public  static HashMap<Character, Character> lookup_table = new HashMap<Character, Character>() {{
            put('A', 'Z');
            put('0', '9');
            put('1', '8');
            put('2', '7');
            put('3', '6');
            put('4', '5');
            put('5', '4');
            put('6', '3');
            put('7', '2');
            put('8', '1');
            put('9', '0');
            put('B', 'Y');
            put('C', 'X');
            put('D', 'W');
            put('E', 'V');
            put('F', 'U');
            put('G', 'T');
            put('H', 'S');
            put('I', 'R');
            put('J', 'Q');
            put('K', 'P');
            put('L', 'O');
            put('M', 'N');
            put('N', 'M');
            put('O', 'L');
            put('P', 'K');
            put('Q', 'J');
            put('R', 'I');
            put('S', 'H');
            put('T', 'G');
            put('U', 'F');
            put('V', 'E');
            put('W', 'D');
            put('X', 'C');
            put('Y', 'B');
            put('Z', 'A');
            put('a', 'z');
            put('b', 'y');
            put('c', 'x');
            put('d', 'w');
            put('e', 'v');
            put('f', 'u');
            put('g', 't');
            put('h', 's');
            put('i', 'r');
            put('j', 'q');
            put('k', 'p');
            put('l', 'o');
            put('m', 'n');
            put('n', 'm');
            put('o', 'l');
            put('p', 'k');
            put('q', 'j');
            put('r', 'i');
            put('s', 'h');
            put('t', 'g');
            put('u', 'f');
            put('v', 'e');
            put('w', 'd');
            put('x', 'c');
            put('y', 'b');
            put('z', 'a');
        }};
    public static String atbash(String message){
        StringBuilder cipher = new StringBuilder();
        for (char letter : message.toCharArray()) {
         if (Character.isLetterOrDigit(letter)) {
                char encryptedChar = lookup_table.get(letter);
                cipher.append(encryptedChar);
            }
            else
                cipher.append(letter);
        }
        return cipher.toString();
    }
}
