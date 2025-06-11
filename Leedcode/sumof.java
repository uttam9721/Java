public class sumof {
    public static int twosum(int [] nums , int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return nums[i] + nums[j];
                    }
                
            
        }
        }
    return 0;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        
        System.out.println(twosum(nums, target));
    }
    
    
}
