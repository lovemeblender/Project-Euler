public class Problem5 {

    public int smallestMultiple() {
        for(int i = 2;;i++) {
            boolean found = true;
            for(int j = 2; j < 21; j++) {
                if(i % j != 0) {
                    found = false;
                }
            }
            if(found) return i;
        }
    }
}
