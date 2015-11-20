public class Problem12 {

    public int triangle() {
        int prev = 0;
        for(int i = 1 ;; i++) {
            int tri = prev + i;
            prev = tri;

            if(getDivs(tri) > 500) {
                return tri;
            }
        }      
    }

    private float getDivs(int n) {
        float divSum = 0;
        
        // Key trick here: divisors can be listed in factor pairs:
        // 48 = 1×48 = 2×24 = 3×16 = 4×12 = 6×8

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                if(n / i == i) divSum += 0.5;
                else divSum ++;
            }
        }
        return 2 * divSum;
    }
}
