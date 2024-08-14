import java.util.*;

public class Demo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        System.out.println(checkPalindrome(str));

    }

    public static boolean checkPalindrome(String str){

        int[] freq = new int[128];
        int oddCount = 0 ;

        for(int i = 0 ; i < str.length(); ++i){
            if(Character.isLetter(str.charAt(i))) {

                freq[str.charAt(i)]++;

                if(freq[str.charAt(i)] % 2 == 1)
                    oddCount++;
                else
                    oddCount--;
            }
        }
        return oddCount <= 1 ;
    }
}
