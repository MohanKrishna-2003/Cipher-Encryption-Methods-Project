package CipherMethods;
import java.util.Scanner;
public class CaesarCipher {
    public CaesarCipher(){
        Scanner input = new Scanner(System.in);
        String text;
        int key;
        System.out.println("1.Encrypt\n2.Decrypt\n3.Exit\nEnter your choice");
        int choice = input.nextInt();
        input.nextLine();
        switch(choice){
            case 1 : System.out.print("Enter Text:");
                text = input.nextLine();
                System.out.print("Enter key:");
                key = input.nextInt();
                CaesarEncrypt(text,key);
                break;
            case 2 : System.out.print("Enter Text:");
                text = input.nextLine();
                System.out.print("Enter key:");
                key = input.nextInt();
                CaesarDecrypt(text,key);
                break;
            default : System.out.println("Choose a valid option");
        }
    }
    public static void CaesarEncrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        for (char character : plaintext.toCharArray()) {
            if (Character.isUpperCase(character)) {
                char shiftedChar = (char) ((character - 'A' + shift) % 26 + 'A');
                ciphertext.append(shiftedChar);
            } else if (Character.isLowerCase(character)) {
                char shiftedChar = (char) ((character - 'a' + shift) % 26 + 'a');
                ciphertext.append(shiftedChar);
            } else {
                ciphertext.append(character);
            }
        }
        System.out.println("The Encrypted Message is :" + ciphertext.toString());
    }
    public static void CaesarDecrypt(String ciphertext, int shift) {
        StringBuilder plaintext = new StringBuilder();

        for (char character : ciphertext.toCharArray()) {
            if (Character.isUpperCase(character)) {
                char shiftedChar = (char) ((character - 'A' - shift + 26) % 26 + 'A');
                plaintext.append(shiftedChar);
            } else if (Character.isLowerCase(character)) {
                char shiftedChar = (char) ((character - 'a' - shift + 26) % 26 + 'a');
                plaintext.append(shiftedChar);
            } else {
                plaintext.append(character);
            }
        }
        System.out.println("The Decrypted Message is :" + plaintext.toString());
    }
}
