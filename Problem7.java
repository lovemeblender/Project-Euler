public class Problem7 {

	// Using the prime number theorem, the nth prime is bounded as: logn + loglogn - 1 < pn / n < logn + loglogn, n >= 6
	// We are interested in the upper bound since we need to look up to this point to find the nth prime
	// https://en.wikipedia.org/wiki/Prime_number_theorem#Approximations_for_the_nth_prime_number

    public int sieve() {
    	int n = 10_001;
    	int upto = (int) (n * Math.log(n) + n * Math.log(Math.log(n)));
    	
    	boolean[] primes = new boolean[upto + 1];
    	// false: prime
    	// true: non prime

    	primes[1] = true;

    	// sieve
    	for(int i = 2; i * i < primes.length; i ++) {
    		for(int j = i + 1; j < primes.length; j ++) {
    			if(j % i == 0) {
    				primes[j] = true;
    			}
    		}
    	}

    	int count = 0;
    	// count primes
    	for(int i = 1; i < primes.length; i ++) {

    		if(!primes[i]) count ++;
  			// return 10001th prime
    		if(count == n) return i;
    	}
    	return -1;
    }
}
