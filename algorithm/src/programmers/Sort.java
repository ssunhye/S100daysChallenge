package programmers;

import java.util.*;

public class Heap {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        solution(numbers);
    }

    public static String solution(int[] numbers) {
        String answer = "";

        String[] s = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            s[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        if (s[0].equals("0")) return "0";

        for (String num : s) {
            answer += num;
        }

        return answer;
    }
}
