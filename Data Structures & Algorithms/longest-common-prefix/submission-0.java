class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i =1; i<strs.length;i++)
        {
            String currString = strs[i];
            int strlength = Math.min(prefix.length(),currString.length());

        int j;
            for ( j=0;j<strlength;j++)
            {
                if(prefix.charAt(j)!=currString.charAt(j))
                {
                    break;
                }

            }
            prefix = prefix.substring(0,j);
        }
        return prefix;
    }
}