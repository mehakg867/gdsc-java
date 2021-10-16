class Solution {
    public int removeDuplicates(int[] nums) {
      int len = nums.length;
      //  int temp[] = new int[nums.length];
        int j = 1;
        for(int i=0;i< len-1; i++)
        {
            if(nums[i]!= nums[i+1])
            {
                nums[j++]=nums[i+1];

            }
        }


        return j;

            }
}
