package primeNumbers;

import java.util.LinkedList;


public class ThousandAndFirstPrime {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The 10001th prime is " + findNthPrime(10001));
		
		
	}

	
	
	private static long findNthPrime(int nthPrime){
		int primeCount = 1;
		long candidate = 3;
		LinkedList <Long> primeList = new LinkedList <Long> ();
		primeList.add(new Long("2"));
		while (primeCount <= nthPrime){
			
			boolean primeIsFound = true;
			for(long trialDivisor : primeList){
				
				if(candidate % trialDivisor == 0){
					primeIsFound= false;
					break;
				}
			}
			if(primeIsFound){
				primeCount ++;
				System.out.println(primeCount + ":  " + candidate);
				primeList.add(candidate);
			}
			candidate ++;
			
		}
		return primeList.get(nthPrime-1);
	}
	
	
}
