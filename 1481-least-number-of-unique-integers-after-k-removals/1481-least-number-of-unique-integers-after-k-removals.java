class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer key: map.keySet()) {
            int v = map.get(key);
            list.add(v);
        }

        // For ArrayList
        Collections.sort(list);

        // For 1D Array
        // Arrays.sort(arr);

        int cnt = 0;

        for (int i=0; i<list.size(); i++) {
            if (k >= list.get(i)) {
                k -= list.get(i);
                list.set(i, 0);
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}