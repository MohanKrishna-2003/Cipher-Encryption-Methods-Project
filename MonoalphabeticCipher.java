package CipherMethods;
import java.util.Scanner;
public class MonoalphabeticCipher {
    public MonoalphabeticCipher(){
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("1.Encrypt\n2.Decrypt\n3.Exit\nEnter your choice");
        int choice = input.nextInt();
        input.nextLine();
        switch(choice){
            case 1 : System.out.print("Enter Text:");
                text = input.nextLine();
                monoalphabeticEncryption(text);
                break;
            case 2 : System.out.print("Enter Text:");
                text = input.nextLine();
                monoalphabeticDecryption(text);
                break;
            default : System.out.println("Choose a valid option");
        }
    }
    public static void monoalphabeticEncryption(String message)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String substitution = "QWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder res = new StringBuilder();
        for(char c : message.toCharArray())
        {
            if(Character.isLetter(c))
            {
                int index = alphabet.indexOf(Character.toUpperCase(c));
                if(index!=-1){
                    char substituedChar = substitution.charAt(index);
                    res.append(Character.isLowerCase(c) ? Character.toLowerCase(substituedChar) : substituedChar);
                }
            }
            else
            {
                res.append(c);
            }
        }
        System.out.println("The Encrypted Message is :" + res.toString());
    }
    public static void monoalphabeticDecryption(String encryptedMessage)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String substitution = "QWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder res = new StringBuilder();
        for(char c : encryptedMessage.toCharArray())
        {
            if(Character.isLetter(c))
            {
                int index = substitution.indexOf(Character.toUpperCase(c));
                if(index!=-1){
                    char originalChar = alphabet.charAt(index);
                    res.append(Character.isLowerCase(c) ? Character.toLowerCase(originalChar) : originalChar);
                }
            }
            else
            {
                res.append(c);
            }
        }
        System.out.println("The Decrypted Message is :" + res.toString());
    }
}