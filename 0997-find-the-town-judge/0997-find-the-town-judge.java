class Solution {
    public int findJudge(int n, int[][] trust) {

        // 2M: Using 1 Array
        int len = trust.length;
        int[] indegree = new int[n+1];
        for (int i=0; i<len; i++) {
            indegree[trust[i][1]]++;
        }

        int ans = 0;

        for (int i=0; i<=n; i++) {
            if (indegree[i] == n-1) ans = i; 
        }

        for (int i=0; i<len; i++) {
            if (trust[i][0] == ans) return -1;
        }
        return ans == 0 ? -1 : ans;


        // 1M: Graph problem solved using 2 hashmaps
        // int len = trust.length;
        // Map<Integer, Integer> incoming = new HashMap<>();
        // Map<Integer, Integer> outgoing = new HashMap<>();
        // if (trust.length == 0 && n == 1) return 1;
        // else if (trust.length == 0) return -1;

        // for (int i=0; i<len; i++) {
        //     // outgoing.put(trust[i][0], outgoing.getOrDefault(trust[i][0], 0) + 1);
        //     outgoing.put(trust[i][0], 1);
        //     incoming.put(trust[i][1], incoming.getOrDefault(trust[i][1], 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> entry: incoming.entrySet()) {
        //     if (entry.getValue() == n-1 && !outgoing.containsKey(entry.getKey())) {
        //         return entry.getKey();
        //     }
        // }
        // return -1;


        // if (n == 1) return 1;

        // Map<Integer, Integer> trustCounts = new HashMap<>();

        // for (int[] relation : trust) {
        //     trustCounts.put(relation[0], -1); // Person who trusts someone gets -1
        //     if (!trustCounts.containsKey(relation[1]) || trustCounts.get(relation[1]) != -1) {
        //         trustCounts.put(relation[1], trustCounts.getOrDefault(relation[1], 0) + 1);
        //     }
        // }

        // for (Map.Entry<Integer, Integer> entry : trustCounts.entrySet()) {
        //     if (entry.getValue() == n - 1) {
        //         return entry.getKey();
        //     }
        // }

        // return -1;
    }
}