import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();

        System.out.println(checkPermutation(str1,str2));
    }

    public static boolean checkPermutation(String str1, String str2){

        if(str1.length() != str2.length())
            return false;

        int[] freq = new int[128];

        for(int i = 0 ; i < str1.length(); ++i)
            freq[str1.charAt(i)]++;

        for(int i = 0 ; i < str2.length(); ++i)
            freq[str2.charAt(i)]--;

        for(int i = 0 ; i < freq.length; ++i){
            if(freq[i] > 0)
                return false;
        }

        return true;
    }
}
