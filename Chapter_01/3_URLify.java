import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int size = input.nextInt();

        char[] alteredStr = alter(str,size);

        System.out.println(alteredStr);
    }

    public static char[] alter(String str, int size){

        String exp = "%20";
        int spacesCnt = 0;

        for(int i = 0 ; i < size; ++i) {
            if(str.charAt(i) == ' ')
                spacesCnt++;
        }

        int additional = (spacesCnt > 0 ? 3*spacesCnt-spacesCnt : 0);

        char[] arr = new char[size+additional];

        int arrCnt = arr.length-1;

        for(int i = size-1; i >= 0 ; --i){

            if(str.charAt(i) == ' '){
                arr[arrCnt--] = exp.charAt(2);
                arr[arrCnt--] = exp.charAt(1);
                arr[arrCnt--] = exp.charAt(0);
            }

            else
             arr[arrCnt--] = str.charAt(i);
        }

        return arr;
    }
}
