import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String line = input.next();

        int check = line.charAt(0);

        int[] found = new int[128];
        boolean isUnique = true;

        for(int i = 0 ; i < line.length(); ++i){

            if(found[line.charAt(i)] == 1){
                isUnique = false;
                break;
            }
            else
                found[line.charAt(i)] = 1;
        }

        if(isUnique)
            System.out.print("The string has unique characters");
        else
            System.out.print("The string has duplicate characters");
    }
}
