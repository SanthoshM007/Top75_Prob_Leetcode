class Solution {
    public int largestAltitude(int[] gain) {
        int s=gain[0],m=s;
        for(int i=1;i<gain.length;i+=1){
            s+=gain[i];
            if(m<s) m=s;
        }

        return m<0 ? 0:m;
    }
}
