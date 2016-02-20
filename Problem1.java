public class Problem1 {
	public static void main(String args[]){
	/*Problem 1:If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	The sum of these multiples is 23.
	Find the sum of all the multiples of 3 or 5 below 1000.*/

	//Multiples of 3, every 5th multiple will be a multiple of 5
	//Multiples of 5, every 3rd multiple will be a multiple of 3

	int sum = 0;

	//First sum all multiples of 5 under 1000
	for(int num = 5; num < 1000; num += 5)
	{
		sum += num;
	}

	int count = 0;

	//Sum all multiples of 3 except every 5th multiple which will already have been added to sum
	for(int num = 3; num < 1000; num += 3)
	{
		count++;
		if(count == 5)
		{
			count = 0;
		}
		else
		{
			sum += num;
		}
	}

	System.out.println(sum);
	}
}