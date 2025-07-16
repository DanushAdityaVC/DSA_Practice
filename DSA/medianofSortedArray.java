public class medianofSortedArray {
    public double median(int nums[]){
        int mid=nums.length/2;
        double med=0;
        if(nums.length%2==0){
            med=(nums[mid-1]+nums[mid])/2.0;
        }
        else{
             med=nums[mid];
        }
        return med;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                num[k]=nums1[i];
                k++;
                i++;
            }
            else{
                 num[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            num[k]=nums1[i];
                k++;
                i++;
        }
        while(j<nums2.length){
            num[k]=nums2[j];
                k++;
                j++;
        }
        return median(num);
    }
}
