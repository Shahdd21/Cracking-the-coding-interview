 public static int findMagicIndex(int[] arr){

        int st = 0, end = arr.length-1;

        while(st <= end){
            int mid = (st+end)/2;

            if(arr[mid] == mid) return mid;

            else if(arr[mid] < mid){ //go right
                st = Math.max(mid+1, arr[mid]);
            }

            else if(arr[mid] > mid){ //go left
                end = Math.min(mid-1, arr[mid]);
            }
        }

        return -1; // the magic index is not found
    }
