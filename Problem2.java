class Problem2 {

	public int fibEvenSum() {

		int a = 1;
		int b = 1;
		int c = 0;
		int sum = 0;

		for(int i = 0; ; i++) {
			if(c > 4_000_000) break;
			c = a;
			a = b;
			b = c + b; 
			if(c % 2 == 0) {
				sum += c;
			}
		}
		return sum;
	}
}
