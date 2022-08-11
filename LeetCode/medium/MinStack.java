package LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    int index = -1;

    List<Integer> arr = null;

    public MinStack() {
        arr = new ArrayList();
    }

    public void push(int val) {
        arr.add(val);
        index++;
    }

    public void pop() {
        arr.remove(index);
        index--;
    }

    public int top() {
        return arr.get(index);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (min > arr.get(i)) {
                min = arr.get(i);
            }
        }
        return min;
    }
}

