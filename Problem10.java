public class Problem10 {

    public long sieve() {
        boolean[] notprimes = new boolean[2_000_000];
        //false is prime
        // true not prime
        notprimes[1] = true;
        
        for(int i = 2; i * i < notprimes.length; i ++) {
            
            for(int j = 2 * i; j < notprimes.length; j += i) {
                if(j % i == 0) notprimes[j] = true;            
            }
            
        }
        
        long sum = 0;
        for(int i = 2; i < notprimes.length; i ++) {
            if(!notprimes[i]) {
                sum += i;            
            }            
        }
        return sum;
    }
}
