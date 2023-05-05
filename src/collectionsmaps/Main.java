package collectionsmaps;

import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));


    public static void main(String[] args) {
        nums1();
        nums2();
        words1();
        words2();

    }

    public static void nums1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void nums2() {
        Collections.sort(nums);
        int compareNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != compareNum) {
                System.out.println(num);
                compareNum = num;
            }

        }
    }

    public static void words1() {
        Set<String> wordList = new HashSet<>(strings);
        System.out.println(wordList);
    }

    public static void words2() {
        Set<String> wordList = new HashSet<>(strings);
        System.out.println(strings.size() - wordList.size());
    }

}