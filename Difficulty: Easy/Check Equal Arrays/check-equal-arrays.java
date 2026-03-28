class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        boolean flag = false;
        // code here
        if(a.length != b.length) return false;
        int res = 0;
        int resM =1;
        int counterRes = 0;
        int counterResM = 1;
        for(int i=0; i<a.length; i++){
            res = res + a[i];
            if(a[i] == 0){
            a[i] = 1;
            resM = resM * a[i];
            }
            resM = resM * a[i];
        }
        
        for(int i=0; i<b.length; i++){
            counterRes = counterRes + b[i];
            if(b[i] == 0){
            b[i] = 1;
            counterResM = counterResM * b[i];
            }
            counterResM = counterResM * b[i];
        }
        
        if(res == counterRes && resM == counterResM) return true;
        
        return flag;

    }
}