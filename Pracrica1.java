package es.escuelait.poo;


public class Pracrica1  {
	
	static final int SAMPLE_LIMIT = 50;

	private static boolean esPrimo(int number) {
		
		int i = 2;
		while (i<=number && number % i != 0) {
			i++;
		} 
		
		return i == number;
	}

	private static int sumPrimesTo(int numberTo) {

    	int sum = 0;
    	for (int i=1;i<=numberTo;i++) {
    		if(esPrimo(i)) {
    			sum += i;
    		}
    	}

    	return sum;
	}
	
	private static int sumPrimes(int quantity) {

    	int sum = 0;
    	int number = 2;
    	int count = 0;
    	
	   	 do {
	   		if(esPrimo(number)) {
	   			count++;
	   			sum += number;
	   		}
	   		number++;
	   	} while (count < quantity);
		
		return sum;
	}	
	
    public static void main(String args[]) {
    	
		System.out.printf("Suma de prima 1s: %d\n",sumPrimesTo(SAMPLE_LIMIT));
		System.out.printf("Suma de prima 2s: %d\n",sumPrimes(SAMPLE_LIMIT));
    
    }

}
