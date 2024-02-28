package HashMaps;

import java.util.HashMap;

public class frequency {
    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 2, 8, 6, 10, 5 };
        int queries[] = { 2, 6, 8, 3 };
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i];
            if (hm.containsKey(val) == true) {
                System.out.println(val + " Frequency is " + hm.get(val));
            } else {
                System.out.println(val + " Frequency is 0");
            }

        }

    }
}