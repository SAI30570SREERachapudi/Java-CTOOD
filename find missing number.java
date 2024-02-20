class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i,j,x=0;;
        for(i=0;i<=n;i++){
            x=0;
            for(j=0;j<n;j++){
                if(nums[j]==i)
                x++;
            }
            if(x==0)
            return i;
        }
        return -1;
    }
}
