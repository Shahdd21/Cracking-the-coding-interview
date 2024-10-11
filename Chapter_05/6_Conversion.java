public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 8, b = 4, cnt = 0 ;

        while(a > 0 || b > 0){

            int bitA = a & 1;
            int bitB = b & 1;

            if(bitB != bitA)
                cnt++;

            a = a >> 1;
            b = b >> 1;
        }

        System.out.println(cnt);
    }
}
