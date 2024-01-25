class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j = 0;

        while(i<n){
            if(nums[i] > 0 || nums[i] < 0){
                nums[j++] = nums[i];
            }  
            i++;
        }
        while(j<n){
            nums[j] = 0;
            j++;
        }
 
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}