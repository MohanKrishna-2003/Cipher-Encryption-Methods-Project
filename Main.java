package CipherMethods;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-WELCOME TO CIPHER METHODS-*-*-*-*-*-*-*-*-*-*-*");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your option : \n1. Caesar Cipher \n2. Atbash Cipher \n3. Monoalphabetic Cipher \n4. Route Cipher \n5. Exit");
            int input = sc.nextInt();
            switch (input)
            {
                case 1 : CaesarCipher cc = new CaesarCipher();
                break;
                case 2 : AtbashCipher ac = new AtbashCipher();
                break;
                case 3 : MonoalphabeticCipher mc = new MonoalphabeticCipher();
                break;
                case 4 : RouteCipher rc = new RouteCipher();
                break;
                case 5 : System.exit(0);
                default:
                    System.out.println("Please enter a valid option");
            }
        }
    }
}