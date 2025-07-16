public class containWater {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,count=height.length,min=0,max=0,temp=0;
        while(i!=j){
            if(height[i]<height[j]){
                min=height[i];
                i++;
                count--;
            }
            else{
                 min=height[j];
                 j--;
                 count--;
            }
            temp=min*count;
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
}
