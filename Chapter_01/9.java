import java.util.*;

public class Demo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        if(isSubstring(s1,s2))
            System.out.print("True");
        else
            System.out.print("False");
    }

    public static boolean isSubstring(String s1, String s2){

        if(s1.length() != s2.length() ) return false;

        int startIndex = -1;
        for(int j = 0 ; j < s2.length(); ++j){
            if(s2.charAt(j) == s1.charAt(0))
                startIndex = j;
        }

        if(startIndex == -1) return false;

        int i = 0 ;
        for(int start = startIndex; i < s1.length() && start < s2.length(); i++ , start++ ){

            if(s1.charAt(i) != s2.charAt(start)) return false;
        }

        for(int j = 0 ; j < startIndex && i < s1.length() ; ++i , ++j){
            if(s1.charAt(i) != s2.charAt(j)) return false;
        }

        return true;
    }
}
