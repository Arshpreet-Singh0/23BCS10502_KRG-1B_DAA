public class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        Map<Integer, Integer> freq = new TreeMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }

        return result;
    }
}
