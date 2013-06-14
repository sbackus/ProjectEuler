package primeNumbers;

public class PrimeSeive {
	public static final int TWOMILLION = 2000000;
	
	public static void main(String[] args){
		System.out.println("the sum of all primes less than n : " + SumOfAllPrimesLessThan(TWOMILLION));
	}
	
	public static long SumOfAllPrimesLessThan(int n){
		long sum = 0;
		int [] numbers = new int[n+1];
		for(int num = 0; num < numbers.length; num++){
			numbers[num] = num;
		}
		for(int d = 2; d < numbers.length; d++){
			if(numbers[d]!=0){
				for(int num = d*2; num < numbers.length; num= num+d){
					numbers[num] = 0;
				}
				System.out.println(numbers[d]);
			}
		}
		for(int num = 2; num < numbers.length; num++){
			if(numbers[num]!=0){
				sum = sum + numbers[num];
				//System.out.println(numbers[num]);
			}
		}
		
		return sum;
	}
	
}
