class Solution {
    public boolean isPalindrome(String s) {
        int left =s.length()-1;
        int right = 0;

        while(right<left)
        {
                
            if (!Character.isLetterOrDigit(s.charAt(right)))
              { right++;
              }

            
            else if (!Character.isLetterOrDigit(s.charAt(left)))
            {
                left--;
            } 

            else if(Character.toLowerCase(s.charAt(right))== Character.toLowerCase(s.charAt(left)))
                {
                    right++;
                    left--;

                }
                else{
                    return false;
                }
        }
        return true;
    }
}
