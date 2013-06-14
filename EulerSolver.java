public class EulerSolver {
public EulerSolver(){
	
}




/*problem 5
 * What is the smallest number divisible by each of the numbers 1 to 20?
 */
public int problem5(int s, int e){
	for (int i = e;true;i++){
		if(isDivisibleByAll(i,s,e)){
			return i;
		}
	}
	
	
}

//assumption: s < e
private boolean isDivisibleByAll(int x,int s, int e){
	for(int i = s;i<= e;i++){
		if(x%i!=0){
			return false;
		}
	}
	return true;
}

/*Problem 4
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public int problem4(int n, int d){
	for(int i = (int) Math.pow(10,(n*d));i>0;i--){
		if(isPalindrome(i)&& isGoodProduct(i,d)){
			return i;
		}
	}
	return 0;
}

private boolean isGoodProduct(int x, int d){
	for(int i = (int) Math.pow(10,d);i>Math.pow(10, d-1);i--){
		if(x%i==0&&(x/i)>Math.pow(10, d-1)&&(x/i)<Math.pow(10, d)){
			return true;
		}
	}
	return false;
}

private boolean isPalindrome(int i){
	String s = Integer.toString(i);
	return isPalindrome(s);
}

private boolean isPalindrome(String s){
	for(int i=0; i< s.length()/2; i++){
		if(s.charAt(i)!=s.charAt(s.length()-i-1)){
			return false;
		}
	}
	return true;
}

/* Problem 1
 * Add all the natural numbers below one thousand that are multiples of 3 or 5.
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 */
public int problem1(int bound){
	int m3 =0;
	int m5 = 0;
	int sum = 0;
	while(m3 < bound){
		sum += m3;
		//System.out.println("sum ; " +  sum);
		m3 += 3;
		//System.out.println("m3 ; "+ m3);
	}
	while(m5 < bound){
		//System.out.println("test ; " + m5%3);
		if(m5%3 != 0){
			sum += m5;
			//System.out.println("sum : " +  sum);
		}
		m5 += 5;
		//System.out.println("m5 ; "+m5);
	}
	return sum;
}

//Find the sum of all the even-valued terms in the Fibonacci sequence which do not exceed four million
public int problem2(int bound){
	int f1 = 0;
	int ft, sum = 0;
	int f2 = 1;
	while (f2 < bound){
		ft = f1 + f2;
		f1= f2;
		f2=ft;
		if(ft%2==0){
			sum +=ft;
		}
	}
	return sum;
}

//Find the largest prime factor of a composite number.
public long problem3(long n){
	long f = 1;
	long lpf = 0;
	while(f<n){
		f++;
		if(n%f == 0 && isPrime(f)){
			lpf = f;
			System.out.println(lpf);
		}
	}
	return lpf;
}

private boolean isPrime(long n){
	boolean isPrime = true;
	for (long i=2;i<n;i++){
		if(n%i ==0){
			isPrime = false;
		}
	}
	return isPrime;
}


}