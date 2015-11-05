import java.util.Arrays;

public class Problem1 {
    
    public int sum() {
        int sum = 0;
        for(int i = 3; i < 1000; i ++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        System.out.println(p.sum());
        
    }
}