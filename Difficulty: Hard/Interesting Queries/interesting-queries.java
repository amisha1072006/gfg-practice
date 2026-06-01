// User function Template for Java

class Solution {
        // Code here
            static class Query {
        int l, r, idx;

        Query(int l, int r, int idx) {
            this.l = l;
            this.r = r;
            this.idx = idx;
        }
    }

    public int[] solveQueries(int[] nums, int[][] Queries, int k) {

        int n = nums.length;
        int q = Queries.length;

        Query[] query = new Query[q];

        for (int i = 0; i < q; i++) {
            query[i] = new Query(
                Queries[i][0] - 1,
                Queries[i][1] - 1,
                i
            );
        }

        int block = (int)Math.sqrt(n);

        Arrays.sort(query, (a, b) -> {
            int blockA = a.l / block;
            int blockB = b.l / block;

            if (blockA != blockB)
                return blockA - blockB;

            return a.r - b.r;
        });

        HashMap<Integer, Integer> freq = new HashMap<>();

        int[] ans = new int[q];

        int currL = 0;
        int currR = -1;

        int count = 0;

        for (Query qu : query) {

            int L = qu.l;
            int R = qu.r;

            while (currR < R) {
                currR++;

                int val = nums[currR];

                int f = freq.getOrDefault(val, 0);

                if (f == k - 1)
                    count++;

                freq.put(val, f + 1);
            }

            while (currR > R) {

                int val = nums[currR];

                int f = freq.get(val);

                if (f == k)
                    count--;

                freq.put(val, f - 1);

                currR--;
            }

            while (currL < L) {

                int val = nums[currL];

                int f = freq.get(val);

                if (f == k)
                    count--;

                freq.put(val, f - 1);

                currL++;
            }

            while (currL > L) {
                currL--;

                int val = nums[currL];

                int f = freq.getOrDefault(val, 0);

                if (f == k - 1)
                    count++;

                freq.put(val, f + 1);
            }

            ans[qu.idx] = count;
        }

        return ans;
    }
}