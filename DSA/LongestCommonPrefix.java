class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str=strs[0],str_samp="";
        StringBuilder final_str = new StringBuilder();
        int i,j;
        for(i=1;i<strs.length;i++){
            if(strs[i].length()<str.length()){
                str=strs[i];
            }
        }
        for(j=0;j<strs.length;j++){
            str_samp=strs[j];
            if(!str.equals(str_samp)){
                final_str.setLength(0);
                for(int k=0;k<str.length();k++){
                    if(str.charAt(k)==str_samp.charAt(k)){
                        final_str.append(str.charAt(k));
                    }
                    else{
                        break;
                    } 
                }
                if(final_str.length()<str.length()){
                    str=final_str.toString();
                }
            }
        }
        return str;
    }
}