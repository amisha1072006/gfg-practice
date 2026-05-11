class Solution {
    public static String caseSort(String s) {
        // code here
                int[] arr =  new int[256];
        StringBuilder sb = new StringBuilder();
        int lwrPointer = 'a', uprPointer = 'A';
        for (int i : s.toCharArray()) {
            arr[i]++;
          //  System.out.println("i:"+i+" arr[i]: "+arr[i] + " : " + (char) i);
        }
        for(int i = 0; i < s.length(); i++) {
            while (lwrPointer <= 'z' && arr[lwrPointer] == 0) {
                lwrPointer++;
            }
         //   System.out.println("lwrPointer: " + lwrPointer);
            while (uprPointer <= 'Z' && arr[uprPointer] == 0) uprPointer++;
         //   System.out.println("uprPointer: " + uprPointer);
            if (s.charAt(i) <= 'Z') {
                sb.append((char) uprPointer);
                arr[uprPointer]--;
            } else {
                sb.append((char) lwrPointer);
                arr[lwrPointer]--;
            }
         //   System.out.println("sb: " + sb);
        }
        return sb.toString();

    }
}