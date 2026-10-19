class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels=Set.of('a','e','i','o','u');
        int count=0;

        int maxcount=0;
        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
        }
        maxcount=count;
        for(int i=k;i<s.length();i++){
             if(vowels.contains(s.charAt(i-k))){
                count--;
             }
              if(vowels.contains(s.charAt(i))){
                count++;
              }
              maxcount = Math.max(maxcount,count);
              if(maxcount==k){
                return k;
              }
        }
        return maxcount;

          

        
    }
}