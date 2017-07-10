package collection_i.map_inv;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wly on 17-3-23.
 */
public class count {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7,9, 11, 13, 17, 19, 2, 3, 5, 33, 12, 5};
        HashMap<Integer,Integer> numberCount = new HashMap<Integer,Integer>();

        for(int i : numbers) {
            if (numberCount.get(i) != null) {
                int count = numberCount.get(i);
                numberCount.put(i, ++count);
            }
            else {
                numberCount.put(i, 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : numberCount.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
