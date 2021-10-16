package programmers;

public class Greedy {
    public static void main(String[] args) {
        String number = "1924";
        int k = 2;

        solution(number, k);
    }

    public static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;

        for(int i=0; i<number.length()-k; i++){
            int max = 0;
            for(int j=idx; j<=i+k; j++){
                if(max < number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
}
