class Solution {
    public int pivotIndex(int[] nums) {
        
        int s1=0,s2=0;
        int i=0,j=nums.length-1,p=0;

        while(p<nums.length){
            s1=0;s2=0;
            i=0;j=nums.length-1;
            while(i<p||j>p){
                if(i<p) {s1+=nums[i];i+=1;}
                if(j>p) {s2+=nums[j];j-=1;}
            }
            if(s1==s2) return p;
            p+=1;
        }
        return -1;
            
    }
}
