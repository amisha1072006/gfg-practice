class Solution {
    boolean sameFreq(String s) {
        // code here
                HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }
            else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        HashMap<Integer,Integer> freqCount=new HashMap<>();
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            if(!freqCount.containsKey(entry.getValue())){
                freqCount.put(entry.getValue(),1);
            }
            else{
                freqCount.put(entry.getValue(),freqCount.get(entry.getValue())+1);
            }
        }
        if(freqCount.size()==1){
            return true;
        }
        else{
            if(freqCount.size()==2){
                ArrayList<Integer> freq=new ArrayList<>(freqCount.keySet());
                int f1=freq.get(0),f2=freq.get(1);
                if(f1>f2){
                    int temp=f1;
                    f1=f2;
                    f2=temp;
                }
                if(f1==1 && freqCount.get(f1)==1){
                    return true;
                }
                if(f2==f1+1 && freqCount.get(f2)==1){
                    return true;
                }
                return false;
            }
            else{
                return false;
            }
        }

    }
}