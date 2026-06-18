import java.util.*;
class TimestampValue {
    int timestamp;
    String value;

    public TimestampValue(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}
class Timestamp {

    private Map<String, ArrayList<TimestampValue>> mapKey;

    public Timestamp() {
        mapKey = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        mapKey.putIfAbsent(key, new ArrayList<>());
        mapKey.get(key).add(new TimestampValue(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!mapKey.containsKey(key)) {
            return "";
        }

        ArrayList<TimestampValue> list = mapKey.get(key);

        int left = 0;
        int right = list.size() - 1;
        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid).timestamp <= timestamp) {
                result = list.get(mid).value;
                left = mid + 1; // look for a larger valid timestamp
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    public static void main (String args[]){
        Timestamp timeMap = new Timestamp();

        timeMap.set("foo", "bar", 1);

        System.out.println(timeMap.get("foo", 1)); // bar
        System.out.println(timeMap.get("foo", 3)); // bar

        timeMap.set("foo", "bar2", 4);

        System.out.println(timeMap.get("foo", 4)); // bar2
        System.out.println(timeMap.get("foo", 5)); // bar2
    }

}
