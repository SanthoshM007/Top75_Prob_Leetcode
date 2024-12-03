class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int i=0,j=(nums.length/2)/2,k=nums.length/2,l=(k+nums.length)/2;
        int ip=1,jp=1,kp=1,lp=1;
        HashSet<Integer> in=new HashSet<>();
        while(i<(nums.length/2)/2||j<nums.length/2||k<((nums.length/2)+(nums.length))/2||l<nums.length){
            if(i<(nums.length/2)/2) {
                if(nums[i]==0) {in.add(i);i+=1;continue;}
                ip*=nums[i];
                i+=1;
            }
            if(j<nums.length/2) {
                if(nums[j]==0) {in.add(j);j+=1;continue;}
                jp*=nums[j];
                j+=1;
            }
            if(k<((nums.length/2)+(nums.length))/2){
                if(nums[k]==0) {in.add(k);k+=1;continue;}
                 kp*=nums[k];
                 k+=1;
            }
            if(l<nums.length){
                if(nums[l]==0) {in.add(l);l+=1;continue;}
                 lp*=nums[l];
                 l+=1;
            }

            
        }
        if(in.size()>=2) return arr;
        else if(in.size()==1) {arr[in. stream(). findFirst(). get()]=ip*jp*kp*lp;return arr;}

        else {

         i=0;j=(nums.length/2)/2;k=nums.length/2;l=(k+nums.length)/2;
         int p=ip*jp*kp*lp;

            while(i<(nums.length/2)/2||j<nums.length/2||k<((nums.length/2)+(nums.length))/2||l<nums.length){
            if(i<(nums.length/2)/2) {
                arr[i]=p/nums[i];
                i+=1;
            }
            if(j<nums.length/2) {
                arr[j]=p/nums[j];
                j+=1;
            }
            if(k<((nums.length/2)+(nums.length))/2){
               arr[k]=p/nums[k];
                k+=1;
            }
            if(l<nums.length){
                arr[l]=p/nums[l];
                l+=1;
            }

            
        }
        }

        // System.out.println(ip+" "+jp+" "+kp+" "+lp);
        // System.out.println(in);


        return arr;
    }
}
