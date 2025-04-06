public static void main(String[] args){

        int[] arr = new int[]{8,7,6,5,4};

        System.out.println(fun(arr));
    }

    public static int fun(int[] arr){

        return helper(0,arr.length-1, arr);
    }

    private static int helper(int low, int high, int[] arr) {

        //assuming desc order
       // no duplicates

        int mid = (low+high)/2;

        if(mid >= arr.length) return -1;

        if(arr[mid] == mid) return mid;

        else if(arr[mid] > mid) return helper(mid+1, high, arr);

        else return helper(low,mid-1, arr);

    }
