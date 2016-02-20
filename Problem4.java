public class Problem4{
	public static void main(String args[]){
		/*A palindromic number reads the same both ways. 
		The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		Find the largest palindrome made from the product of two 3-digit numbers.*/
		int product = 0;
		int max = -1;

		for(int i = 999; i > 99; i--)
		{
			for(int j = 999; j > 99; j--)
			{
					product = (i*j);
					if(isPalindrome(product) && (product > max))
					{
						System.out.println(i + " X " + j);
						max = product;
					}

			}
		}
		System.out.println(max);
	}
	public static boolean isPalindrome(int num)
	{
		int r = 0;
		int n = num;

		while( n != 0 )
      {
          r = r * 10;
          r = r + n%10;
          n = n/10;
      }

    if (r == num)
    {
    	return true;
    }
    else
    {
			return false;
		}
	}
}
