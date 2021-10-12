package programmers;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        solution(phone_book);
    }

    public static boolean solution(String[] phone_book) {
        int n = phone_book.length;

        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            map.put(phone_book[i], i);
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<phone_book[i].length(); j++) {
                String str = phone_book[i].substring(0, j);
                if (map.containsKey(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
