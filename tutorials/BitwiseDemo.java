class BitwiseDemo {
	public static void main(String[] args) {
		int test = 0;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		test = ~test;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		test = test >> 1;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		test = test >>> 1;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));	
		test = 1;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		test = test << 1;	
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		test = test >> 1;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		test = 0b01010101_01010101_01010101_01010101;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		test = ~test;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		test = test^test;
		System.out.printf("int: %10d,\tbinary: %s%n", test, Integer.toBinaryString(test));
		int bitmask = 0x000F;
		int val = 0x2222;
		System.out.println("0x"+ (val & bitmask));
		System.out.println("0x"+Integer.toHexString(val));	

		//CCI 1
		int M = 0b1;
		int N = 0b1000_0000_000;
		int i = 0;
		int j = 0;
		int expected = 0b1000_0000_001;
		System.out.printf("M: %s, N: %s, i: %d, j: %d Expected= %s, Actual = %s%n",
							Integer.toBinaryString(M),
							Integer.toBinaryString(N),
							i, j,
							Integer.toBinaryString(expected),
							Integer.toBinaryString(insertMIntoNBetweenJandI(M, N, i, j)));
		M = 0b1010_1010_101;
		N = 0b1000_0000_000;
		i = 0;
		j = 10;
		expected = 0b1010_1010_101;
		System.out.printf("M: %s, N: %s, i: %d, j: %d Expected= %s, Actual = %s%n",
							Integer.toBinaryString(M),
							Integer.toBinaryString(N),
							i, j,
							Integer.toBinaryString(expected),
							Integer.toBinaryString(insertMIntoNBetweenJandI(M, N, i, j)));
		M = 0b10011;
		N = 0b1000_0000_000;
		i = 2;
		j = 6;
		expected = 0b1000_1001_100;
		System.out.printf("M: %s, N: %s, i: %d, j: %d Expected= %s, Actual = %s%n",
							Integer.toBinaryString(M),
							Integer.toBinaryString(N),
							i, j,
							Integer.toBinaryString(expected),
							Integer.toBinaryString(insertMIntoNBetweenJandI(M, N, i, j)));
		double testdbl = 10.2;
		System.out.println(Double.toHexString(testdbl));
		System.out.println("Double conversion: ");
		System.out.println(toBinaryString(0.72));
		System.out.println(toBinaryString(0));
		System.out.println(toBinaryString(1));
		System.out.println(toBinaryString(1.1));
		System.out.println(toBinaryString(-0.1));
		System.out.println(toBinaryString(0.5));
		System.out.println(toBinaryString(0.25));
		System.out.println(toBinaryString(0.125));
		System.out.println("Next Smallest In same 1s:");
		int d = 0b010;
		int e = 0b001;
		int answer = nextSmallestIntegerWithSameNumBinary1s(d);
		System.out.printf("i = %s %d%nexpect = %s %d%nactual = %s %d%n", 
							Integer.toBinaryString(d), d,
							Integer.toBinaryString(e), e,
							Integer.toBinaryString(answer), answer);
	}

	public static int insertMIntoNBetweenJandI(int M, int N, int i, int j) {
		int mask = ~0;
		System.out.println(Integer.toBinaryString(mask));
		mask <<= (j-i+1);
		System.out.println(Integer.toBinaryString(mask));
		mask = ~mask;
		System.out.println(Integer.toBinaryString(mask));
		mask <<= i;
		mask = ~mask;
		System.out.println(Integer.toBinaryString(mask));
		N &= mask;
		System.out.println(Integer.toBinaryString(N));
		M <<= i;
		System.out.println(Integer.toBinaryString(M));
		N |= M;
		System.out.println(Integer.toBinaryString(N));
		return N;
	}

	public static String toBinaryString(double num){
		if(num >= 1 || num <= 0)
			return "ERROR";
		StringBuffer s = new StringBuffer("0.");
		num *= 2;
		if(num >= 1){
			s.append("1");
			num -= 1;
		} else {
			s.append("0");
		}
		for(int i = 2; i < 32; i++){
			if(num == 0) break;
			num *= 2;
			if(num >= 1){
				s.append("1");
				num -= 1;
			} else {
				s.append("0");
			}
			
		}
		if(num > 0) return "ERROR";
		else return s.toString();
	}
	public static int nextSmallestIntegerWithSameNumBinary1s(int num){
		if(num <= 0) return -1;
		int last1 = -1;
		int last0 = -1;
		int mask = 1;
		int counter = 0;
		while(counter < 32 && (last1 < 0 || last0 < 0 || last0 >= last1)) {
			System.out.println("mask "+Integer.toBinaryString(mask));
			if((num & mask) == 0) { //0 here
				last0 = counter;
				System.out.println("last0 "+ last0);
			} else {
				last1 = counter;
				System.out.println("last1 "+ last0);
			}
			counter++;
			if(counter == 32) break;
			mask <<= 1;
		}
		if(last0 < last1) {
			num -= (1 << last1);
			num += (1 << last0);
			return num;
		} else {
			return -1;
		}
	}
}