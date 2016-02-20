public class Problem3{
	public static void main(String args[]){
	/*The prime factors of 13195 are 5, 7, 13 and 29.
	What is the largest prime factor of the number 600851475143 ?*/

	/*This solution works on the premise of if you keep dividing off the smallest factors until you 
	reach a prime number, that number will be the largest prime factor*/

		long largeNum = 600851475143L;
		long smallFactor = 0;
		boolean go = true;

		while(go == true)
		{
			smallFactor = smallestFactor(largeNum);
			largeNum = largeNum/smallFactor;
			if(smallFactor == 1)
			{
				go = false;
			}
		}

		System.out.println(largeNum);


	}
	public  static long smallestFactor(long num)
	{
		long smallFactor = 1;

		for(int i = 2; i < num; i++)
		{
			if((num%i) == 0)
			{
				return i;
			}
		}
		return smallFactor;
	}
}