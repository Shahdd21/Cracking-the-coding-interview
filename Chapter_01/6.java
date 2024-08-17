import java.util.*;

public class Demo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.print(compressString(str));
    }

    public static String compressString(String str){

        StringBuilder res = new StringBuilder();
        int cnt = 1;

        for(int i = 1 ; i < str.length(); ++i){

            if(str.charAt(i) == str.charAt(i-1))
                cnt++;
            else{
                res.append(str.charAt(i-1));
                res.append(cnt);
                cnt = 1;
            }
        }

        res.append(str.charAt(str.length()-1));
        res.append(cnt);

        if(res.length() < str.length())
            return res.toString();
        else
            return str;
    }
}
