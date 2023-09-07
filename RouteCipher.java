package CipherMethods;
import java.util.Scanner;
public class RouteCipher {
    public RouteCipher(){
        Scanner input = new Scanner(System.in);
        String text;
        int key1;
        int key2;
        System.out.println("1.Encrypt\n2.Decrypt\n3.Exit\nEnter your choice");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter Text:");
                text = input.nextLine();
                System.out.print("Enter key1:");
                key1 = input.nextInt();
                System.out.print("Enter key2:");
                key2 = input.nextInt();
                encrypt(text, key1, key2);
                break;
            case 2:
                System.out.print("Enter Text:");
                text = input.nextLine();
                System.out.print("Enter Key1:");
                key1 = input.nextInt();
                System.out.print("Enter Key2:");
                key2 = input.nextInt();
                decrypt(text, key1, key2);
                break;
            default:
                System.out.println("Choose a valid option");
        }
    }
        public static char[][] grid;

        public static void fillGrid(String message,int key1,int key2) {
            int messageIndex = 0;
            grid = new char[key1][key2];
            for (int col = 0; col < key2; col++) {
                for (int row = 0; row < key1; row++) {
                    if (messageIndex < message.length()) {
                        grid[row][col] = message.charAt(messageIndex);
                        messageIndex++;
                    }else{
                        grid[row][col]=' ';
                    }
                }
            }
        }
        public static void fillGridDecrypt(String message,int key1,int key2) {
            int messageIndex = 0;
            grid = new char[key1][key2];
            for (int row = 0; row < key1; row++) {
                for (int col = 0; col < key2; col++) {
                    if (messageIndex < message.length()) {
                        grid[row][col] = message.charAt(messageIndex);
                        messageIndex++;
                    }
                }
            }
        }

        public static void encrypt(String text,int key1,int key2) {
            fillGrid(text,key1,key2);
            StringBuilder cipherText = new StringBuilder();
            for (int row = 0; row < key1; row++) {
                for (int col = 0; col < key2; col++) {
                    cipherText.append(grid[row][col]);
                }
            }
            System.out.println(cipherText.toString());
        }

        public static void decrypt(String text, int key1,int key2) {
            fillGridDecrypt(text,key1,key2);
            StringBuilder plainText = new StringBuilder();
            for (int col = 0; col < key2; col++) {
                for (int row = 0; row < key1; row++) {
                    plainText.append(grid[row][col]);
                }
            }
            System.out.println(plainText.toString());
        }
    }
