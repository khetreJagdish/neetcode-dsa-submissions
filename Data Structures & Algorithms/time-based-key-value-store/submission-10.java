class TimeMap {
    Map<String, List<Pair>> hashMap = null;

    public TimeMap() {
        this.hashMap = new HashMap<>();
        ;
    }
    public class Pair {
        String value;
        int timestamp;

        Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public void set(String key, String value, int timestamp) {
        List<Pair> list = hashMap.getOrDefault(key, new ArrayList<>());
        Pair pair1 = new Pair(value, timestamp);
        list.add(pair1);
        hashMap.put(key, list);
    }

    public String get(String key, int timestamp) {
        List<Pair> listOfPairs = hashMap.get(key);
        if (listOfPairs == null)
            return "";
        return findLeastPairUsingBinarySearch(listOfPairs, timestamp);
    }

    private String findLeastPairUsingBinarySearch(List<Pair> listOfPairs, int timestamp) {
        int left = 0;
        int right = listOfPairs.size() - 1;
        String mostRecentValue = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Pair pair = listOfPairs.get(mid);
            if (pair.timestamp <= timestamp) {
                left = mid + 1;
                mostRecentValue = pair.value;
            } else {
                right = mid - 1;
            }
        }
        return mostRecentValue;
    }
}
