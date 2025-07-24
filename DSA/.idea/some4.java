class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> FinalList=new ArrayList<>();
        int i,j,left,right;
        long sum=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
                left=j+1;
                right=nums.length-1;
                while(left<right){
                    sum=(long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> list=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        FinalList.add(list);
                        while(left<right && nums[left]==nums[left+1]){
                             left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else if(sum>target){
                        right--;
                    }

                }
            }
        }
        return FinalList;
    }
}