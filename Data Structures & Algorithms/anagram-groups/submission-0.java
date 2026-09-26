class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> frequency = new HashMap<>();

        for(String str: strs){
            int []  count = new int[26];
            StringBuilder key = new StringBuilder();
            String keyString = null;

            for(int i=0;i<str.length();i++)
            {
                count[str.charAt(i)-'a']++;
            }

            for (int i=0;i<26;i++)
            {
                key.append(count[i]).append('#');
                keyString = key.toString();
                
            }
            if(frequency.containsKey(keyString))
            {
                frequency.get(keyString).add(str);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(str);
                frequency.put(keyString,list);

            }

        }
        return new ArrayList<>(frequency.values());
    }
}
