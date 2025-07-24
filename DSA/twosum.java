class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0,diff=0 ,result=0,i,j,k,tempDiff;
        for(i=0;i<nums.length-2;i++){
            for(j=i+1;j<nums.length-1;j++){
                for(k=j+1;k<nums.length;k++){
                    sum=nums[i]+nums[j]+nums[k];
                    if(sum==target){
                        result=sum;
                        break;
                    }
                    tempDiff=Math.abs(target-sum);
                    if(diff==0){
                        diff=tempDiff;
                        result=sum;
                        continue;
                    }
                    if(diff>tempDiff){
                        diff=tempDiff;
                        result=sum;
                    }
                }
                if(sum==target){
                    break;
                }
            }
            if(sum==target){
                break;
            }
        }
        return result;
    }
}