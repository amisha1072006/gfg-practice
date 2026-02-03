class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
         Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int firstMax=Integer.MIN_VALUE;
        char firstChar=' ';
        for(Map.Entry<Character,Integer>res:map.entrySet()){
            int val=res.getValue();
            char key=res.getKey();
            if(val>firstMax){
                firstMax=val;
                firstChar=key;
            }else if(val==firstMax && key<firstChar){
               firstChar=key;
            }
        }
        return firstChar;
        
    }
}