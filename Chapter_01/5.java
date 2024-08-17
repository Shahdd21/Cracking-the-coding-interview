import java.util.*;

public class Demo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();

        System.out.print(checkEdits(str1,str2));
    }

    public static boolean checkEdits(String str1, String str2){

        int editsCount = 0;

        if(Math.abs(str1.length()-str2.length()) > 1 )
            return false;
//        else if (Math.abs(str1.length()-str2.length()) == 1)
//            editsCount++;

        boolean[] visited = new boolean[128];

        String mxString = (str1.length() >= str2.length() ? str1 : str2);
        String mnString = (str1.length() < str2.length() ? str1 : str2);

        for(int i = 0 ; i < mxString.length(); ++i)
            visited[mxString.charAt(i)] = true;

        for(int i = 0 ; i < mnString.length() ; ++i){
            if(!visited[mnString.charAt(i)])
                editsCount++;
        }

        return editsCount <= 1;
    }
}
