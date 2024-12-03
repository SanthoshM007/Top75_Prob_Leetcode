class Solution {
    public String mergeAlternately(String word1, String word2) {
        int j=0;
        StringBuilder k=new StringBuilder();
        if(word1.length()>=word2.length()){

            for(int i=0;i<word1.length();i++){
                k.append(word1.charAt(i));
                if(i<word2.length()){
                    k.append(word2.charAt(i));
                }
            } 
        }
        else{
           for(int i=0;i<word2.length();i++){
                
                if(i<word1.length()){
                    k.append(word1.charAt(i));
                }
                k.append(word2.charAt(i));
            }  
        }
        return k.toString();
    }
}
