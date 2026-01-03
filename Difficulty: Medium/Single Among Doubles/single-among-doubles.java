// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
    int ans = 0;
    for(int i =0;i<n;i++){
        ans = ans^arr[i];
    }
    return ans;
        }
    
    }
