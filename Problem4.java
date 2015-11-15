public class Problem4 {

    public int largestPalindromeProduct() {
        int max = Integer.MIN_VALUE;

        for(int i = 100; i <= 999; i ++) {
            for(int j = 100; j <= 999; j ++) {
                int prod = i * j;
                if(isPalindome(prod)) {
                    max = Math.max(max, prod);
                }        
            }
        }
        return max;
    }

    public boolean isPalindome(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i));
        return sb.toString().equals(sb.reverse().toString());
    }
}