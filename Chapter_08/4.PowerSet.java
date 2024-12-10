class Main{
public List<List<Integer>> result = new ArrayList<>();
public void helper(int idx, int[] nums, ArrayList<Integer> list){
        if(idx == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        
        //include
        list.add(nums[idx]);
        helper(idx+1, nums,list);

        //exclude
        list.remove(list.size()-1);
        helper(idx+1,nums,list);
    }
}
