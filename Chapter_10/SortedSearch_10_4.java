class Solution{
    public int getIndex(Listy listy, int target){

        int start = 0, end = 1;

        while(listy.elementAt(end) != -1 && listy.elementAt(end) < target){
            end *= 2;
        }

        while(start <= end){
            int mid = (start+end)/2;

            if (listy.elementAt(mid) == target) return mid;

            else if(listy.elementAt(mid) < target) start = mid+1;

            else end = mid-1;

        }

        return -1;
    }
}
