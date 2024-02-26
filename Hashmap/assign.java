package HashMaps;

import java.util.HashMap;

public class assign {
    public static void main(String args[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(10, 20);
        hm.put(20, 44);
        hm.put(30, 25);
        hm.put(40, 45);

        System.out.println(hm.get(10));

        // hm.remove(10);

        System.out.println(hm.containsKey(10));

        for (int val : hm.keySet()) {
            System.out.println(val);
            System.out.println(hm.size());
        }

    }

}