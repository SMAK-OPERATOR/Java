import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int s = -1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\nWhat do you want to test? \n1 - the longest string \n2 - palindrome check\n3 - censor word \"Fuck\" in the string\n4 - matches substring in the string\n5 - reverse string\n6 - frequency dictionary\n0 - exit \n");
            s = in.nextInt();
            switch (s){
                case(1):{
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter first string");
                    String s1 = scanner.nextLine();
                    System.out.println("Enter second string");
                    String s2 = scanner.nextLine();
                    System.out.println("Enter third string");
                    String s3 = scanner.nextLine();
                    strings.longest(s1,s2,s3);
                    break;
                }

                case(2):{
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter string to check");
                    String s1 = scanner.nextLine();
                    strings.isPalindrome(s1);
                }

                case(3):{
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter string to censor");
                    String s1 = scanner.nextLine();
                    System.out.println("Censured string:\n" + strings.censor(s1));
                }

                case(4):{
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter main string");
                    String s1 = scanner.nextLine();
                    System.out.println("Enter substring string");
                    String s2 = scanner.nextLine();
                    strings.matcher(s1,s2);
                }
                case(5):{
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter string to reverse");
                    String s1 = scanner.nextLine();
                    strings.reverse(s1);
                }

                case(6):{
                    String content = new String(Files.readAllBytes(Paths.get("readMe.txt")), "UTF-8");
                    char alphabet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                    for(int i = 0;i < alphabet.length;i++){
                        strings.matcher(content,String.valueOf(alphabet[i]));
                    }
                }

                default:
                    break;
            }
        }while (s != 0);
    }
}
