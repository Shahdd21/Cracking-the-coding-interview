// O(M*N) space

import java.util.*;

public class Demo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        int[][] mat = new int[m][n];
        generateMatrix(mat,m,n);

        displayMatrix(mat);
        System.out.println("--------------------------");


        ArrayList<Pair<Integer,Integer>> coordinates = new ArrayList<>();
        getCoordinates(mat, coordinates);

     //   int[][] spare = new int[m][n];
     //   generateSpare(spare,m,n);

        zeroSpare(coordinates,mat,m,n);
    //    completeSpare(mat,spare);

        displayMatrix(mat);
     //   System.out.println("--------------------------");
      //  displayMatrix(spare);
    }

    public static void generateMatrix(int[][] mat, int m, int n){
        for(int i = 0 ; i < m; ++i)
            for(int j = 0 ; j < n ; ++j)
                mat[i][j] = (int)(Math.random()*5);
    }

    public static void generateSpare(int[][] spare,int m, int n){
        for(int i = 0 ; i < m; ++i)
            for(int j = 0 ; j < n ; ++j)
                spare[i][j] = -1;
    }

    public static void getCoordinates(int[][] mat, ArrayList<Pair<Integer,Integer>> coordinates){

        for(int i = 0 ; i < mat.length; ++i){
            for(int j = 0 ; j < mat[0].length ; ++j){
                if(mat[i][j] == 0)
                    coordinates.add(new Pair<>(i,j));
            }
        }
    }

    public static void zeroSpare(ArrayList<Pair<Integer,Integer>> coordinates, int[][] spare, int m, int n){

            for(Pair<Integer,Integer> pair : coordinates){

                int rows = 0, cols = 0 ;

                while(rows < m ) {
                    spare[rows++][pair.second()] = 0;
                }

                while(cols < n){
                    spare[pair.first()][cols++] = 0;
                }
            }
    }

    public static void completeSpare(int[][] mat, int[][] spare){

        for(int i = 0 ; i < mat.length; ++i){
            for(int j = 0 ; j < mat[0].length ; ++j){
                if(spare[i][j] == -1)
                    spare[i][j] = mat[i][j];
            }
        }
    }

    public static void displayMatrix(int[][] mat){

        for(int i = 0 ; i < mat.length; ++i){
            for(int j = 0 ; j < mat[0].length ; ++j){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
