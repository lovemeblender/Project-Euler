public class Problem3 {

    public long getMaxPrimeFactor() {
    
        long n = 600_851_475_143L;
    
        long maxPrimeFactor = -1;
        for(long i = 2; i <= n; i ++) {
            while(n % i == 0) {
                n /= i;
                if(n == 1) {
                    maxPrimeFactor = i;
                    break;
                }
            }
        }
        return maxPrimeFactor;
    }
}