import java.util.*;

public class Demo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings : ");
        String str1 = input.next();
        String str2 = input.next();

        System.out.print(checkPermutation(str1,str2));
    }

    public static boolean checkPermutation(String str1, String str2){

        if(str1.length() != str2.length())
            return false;

        boolean[] foundChars = new boolean[128];
        for(int i = 0 ; i < str2.length() ; ++i) {

            char c = str2.charAt(i);
            foundChars[c] = true;
        }

        for(int i = 0 ; i < str1.length() ; ++i){

            char c = str1.charAt(i);

                if (!foundChars[c])
                    return false;
        }

        return true;
    }
}
