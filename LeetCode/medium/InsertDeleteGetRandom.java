package LeetCode.medium;

import java.util.HashSet;
import java.util.Set;

public class InsertDeleteGetRandom {
    public class RandomizedSet {

        Set<Integer> set;

        public RandomizedSet() {
            set = new HashSet();
        }

        public boolean insert(int val) {
            if (set.contains(val)) {
                return false;
            } else {
                set.add(val);
                return true;
            }
        }

        public boolean remove(int val) {
            if (set.contains(val)) {
                set.remove(val);
                return true;
            } else {
                return false;
            }
        }

        public int getRandom() {
            int random = (int) (Math.random() * (set.size()));
            int i = 0;
            for (int el : set) {
                if (i == random) {
                    return el;
                }
                i++;
            }
            return -1;
        }
    }
}
