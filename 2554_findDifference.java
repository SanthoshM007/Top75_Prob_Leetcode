class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer =new ArrayList<>();

        List<Integer> n1=new ArrayList<>();
        List<Integer> n2=new ArrayList<>();
        int i=0,j=0;
        int i1=0,i2=(nums1.length/2)/2,i3=nums1.length/2,i4=(i3+nums1.length)/2;
        int j1=0,j2=(nums2.length/2)/2,j3=nums2.length/2,j4=(j3+nums2.length)/2;
        int f1=0,f2=0;
        while(i<nums1.length||j<nums2.length){
            i1=0;i2=(nums1.length/2)/2;i3=nums1.length/2;i4=(i3+nums1.length)/2;
            j1=0;j2=(nums2.length/2)/2;j3=nums2.length/2;j4=(j3+nums2.length)/2;
            f1=0;f2=0;
           while(i1<(nums1.length/2)/2||i2<nums1.length/2||i3<((nums1.length/2)+nums1.length)/2||i4<nums1.length||j1<(nums2.length/2)/2||j2<nums2.length/2||j3<((nums2.length/2)+nums2.length)/2||j4<nums2.length){

                if(j<nums2.length&&i1<(nums1.length/2)/2&&nums1[i1]==nums2[j]) {f1=1;}
                if(j<nums2.length&&i2<nums1.length/2&&nums1[i2]==nums2[j]) {f1=1;}
                if(j<nums2.length&&i3<((nums1.length/2)+nums1.length)/2&&nums1[i3]==nums2[j]) {f1=1;}
                if(j<nums2.length&&i4<nums1.length&&nums1[i4]==nums2[j]) {f1=1;}
                if(i<nums1.length&&j1<(nums2.length/2)/2&&nums2[j1]==nums1[i]) {f2=1;}
                if(i<nums1.length&&j2<nums2.length/2&&nums2[j2]==nums1[i]) {f2=1;}
                if(i<nums1.length&&j3<((nums2.length/2)+nums2.length)/2&&nums2[j3]==nums1[i]) {f2=1;}
                if(i<nums1.length&&j4<nums2.length&&nums2[j4]==nums1[i]) {f2=1;}

                i1+=1;
                i2+=1;
                i3+=1;
                i4+=1;
                j1+=1;
                j2+=1;
                j3+=1;
                j4+=1;

                if(f1==1&&f2==1) break;

           }
           if(j<nums2.length&&f1==0&&(!n1.contains(nums2[j]))) n1.add(nums2[j]);
           if(i<nums1.length&&f2==0&&(!n2.contains(nums1[i]))) n2.add(nums1[i]);

           i+=1;
           j+=1;
        }
        answer.add(n2);
        answer.add(n1);
        

        return answer;

    }
}
