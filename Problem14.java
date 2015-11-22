public class Problem14 {

    public long longestCollatzSeq() {

        int maxNum = -1;
        int maxChain = 0;
        
    	for(int i = 999_999; i >0; i --) {
            int chainLength = 0;
            long x = i;
            
            while(x != 1) {
                if(x % 2 ==0) {
                    x /= 2;
                }
                else {
                    x = 3*x + 1;
                }
                chainLength++;
            }
            if(maxChain < chainLength) {
                maxChain = chainLength;
                maxNum = i;
            }
        }
        return maxNum;
    }
}
