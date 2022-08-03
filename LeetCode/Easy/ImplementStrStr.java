package LeetCode.Easy;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int index = 0;

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}

