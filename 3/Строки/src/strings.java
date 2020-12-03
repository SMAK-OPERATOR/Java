import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strings {
    public static void longest(String a, String b, String c){
        int arr[] = {a.length(),b.length(),c.length()};
        if (arr[0] >= arr[1] && arr[0] >= arr[2] )
            System.out.println("First string is the longest\n" + a);
        else if (arr[1] >= arr[2] && arr[1] >= arr[0] )
            System.out.println("Second string is the longest\n" + b);
        else
            System.out.println("Third string is the longest\n" + c);
    }

    public static void isPalindrome(String s){
        char arr[] = s.toCharArray();
        boolean is = true;
        for(int i = 0; i != arr.length / 2;i++){
            if(arr[i] != arr[arr.length - i - 1]){
                is = false;
                break;
            }
        }
        if(is)
            System.out.println(s + " is palindrome");
        else
            System.out.println(s + " is not palindrome");
    }

    public static String censor(String s){
        Pattern pattern = Pattern.compile("fuck",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);

        return matcher.replaceAll("[censured]");
    }

    public static void matcher(String mainString, String subString){
        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(mainString);
        int c = 0;
        while (matcher.find())
            c++;
        System.out.println( subString + " matches " + c + " times");
    }

    public static void reverse(String s){
        String string[] = s.split(" ");
        String rs = "";
        for(int i = 0;i < string.length;i++){
            char arr[] = string[i].toCharArray();
            char buff;
            for(int j = 0; j < arr.length / 2;j++){
                buff = arr[j];
                arr[j] = arr[arr.length - j - 1];
                arr[arr.length - j - 1] = buff;
            }
            rs = rs.concat(String.valueOf(arr));
            rs = rs.concat(" ");
        }
        System.out.println("Start string: " + s + "\n Reversed string: " + rs);
    }
}


