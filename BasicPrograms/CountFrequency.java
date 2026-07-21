import java.util.HashMap;

public class CountFrequency {
    public static void countFrequency(int[] arr) {

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {

        if (map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
        } else {
            map.put(num, 1);
        }
    }

    System.out.println(map);
}

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        countFrequency(arr);
    }
}
