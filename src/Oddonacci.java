/*
 * Oddonacci Class
 * This class implements a calculator to get a Oddonacci number from a given index.
 * 
 * An Oddonacci number is basically a number composed from the last 3 precedent numbers (added themselves)
 * in the Oddonacci sequence where the first three digits are 1. 
 * 	Ex: 1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, 355, 653, 1201, ...
 * 
 * This calculator implements two recursive methods to achieve the objective of retrieving the Oddonacci Number.
 * 
 * @Authors:
 * 		Author 1
 * 		Author 2
 * 		Author 3
 * 
 */

public class Oddonacci {

	static long startTime = System.nanoTime();
  //  Stopwatch timer = new Stopwatch().start();

	

	public static void main(String[] args) {	
		/*int answer = linearOddo(3,41,1,1,1);
		System.out.println("First linear implementation : " + answer);
		
		int answerFab = linearOdd(5,1,1,1);
		System.out.println("Second linear implementation : " + answerFab);
		*/
		
		
		System.out.println(linearOdd(10, 1,1,1));
		System.out.println(linearOddo(3, 10, 1, 1, 1));
	//	long start = System.currentTimeMillis();
		//System.out.println("Start : " + System.currentTimeMillis());
		//long answerTime = linearOddoo(3, 10000, 1, 1 ,1);
	//	System.out.println("Number Oddo(40));

		//System.out.println("First  linear implementation & time : " + answerTime);
	//	long time = System.currentTimeMillis() - start;
	//	System.out.println("End : " + time);

	//	System.out.println(totalTime);

	}
	
	/*
	 * Linear recursion implementation:
	 * Finds the k-th Oddonacci number.
	 * @param i: 		 Counter used to terminate the recursion. Must always be set to 3.
	 * @param k:	     Position of the desired Oddonacci number.
	 * @param temp_1:    (k-3)th Oddonacci number Must always be set to 1.
	 * @param temp_2:    (k-2)th Oddonacci number Must always be set to 1.
	 * @param temp_3:    (k-1)th Oddonacci number Must always be set to 1.
	 * @return K-th Oddonacci number
	 */
	public static int linearOddo(int i, int k, int temp_1, int temp_2, int temp_3) {
		int temp_4 = temp_1 + temp_2 + temp_3; // Current Oddonacci number.
		i++;
		if ((k ==1) || (k==2) || (k==3))	// First base case.
			return 1;
		else if (i == k)					// Second base case.
			return temp_4;
		else {
			return (linearOddo(i, k, temp_2, temp_3, temp_4));
		}
	}
	
	public static int linearOdd(int index, int temp_1, int temp_2, int temp_3){
		int temp = temp_1 + temp_2 + temp_3;
		
		if (index < 4){
			return 1;
		}else if(index == 4){
			return temp;
		}

		return linearOdd(index- 1, temp_2,temp_3, temp);
	}

	 public static long linearOddoo(int i, int k, int temp_1, int temp_2, int temp_3) {
			int temp_4 = temp_1 + temp_2 + temp_3; // Current Oddonacci number.
			i++;
			if ((k ==1) || (k==2) || (k==3))	// First base case.
				return 1;
			else if (i == k)					// Second base case.
				return temp_4;
			else {
				return (linearOddoo(i, k, temp_2, temp_3, temp_4));
			}
		}
	 
	 public static int Oddo(int i){
		    if(i == 1 || i == 2 || i == 3){
		      return 1; 
		    }
		    else{
		      return Oddo(i - 1) + Oddo(i - 2) + Oddo(i - 3);
		    }
		  }

}
