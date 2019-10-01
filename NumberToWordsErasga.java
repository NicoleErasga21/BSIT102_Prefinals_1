import java.util.Scanner;


public class NumberToWordsErasga 
{
	
	public static void main (String []args)
	{
	
		Scanner numberScanner = new Scanner(System.in);
		System.out.println("Input a Number:");
		int inputNumber = numberScanner.nextInt();
		
		
		// I store only the Ones digit and the tens
		String []Ones = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourthe",
		"Fifteen","Sixteen","Seventeen","Eighteen", "Nineteen"};
		
		String []Tens = {"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		
		// Determines the digit position
		if (inputNumber <= 19)
		{
		
		// Gets the first number I used the substring to get the first value
		int firstDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(0,1));
		// Then I use the converted number and then use it as an index
		System.out.println( Ones[inputNumber-1]);
		}
		
		// Determines the digit position
		else if(inputNumber <= 99)
		{
	
		// Since there are 2 position I used 2 conversion
		// I get the first and second number into 2 different integers
   		int firstDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(0,1));
   		int secondDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(1,2));
   	
   		// Then use the 2 different integers to determine the position
		System.out.println(Tens[firstDigitKo-1] +" " + Ones[secondDigitKo-1]);
		}
		
		// Determisn the digit position
		else if(inputNumber <= 999)
		{
		
		// I get the first, second and third number into 3 different integers
		int firstDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(0,1));
   		int secondDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(1,2));
   		int thirdDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(2,3));
   		
   		// Then I use the 3 different integers to determine the position and I added hundreds
   		System.out.println(Ones[firstDigitKo-1] + " Hundred " + Tens[secondDigitKo-1] + " " + Ones[thirdDigitKo-1]);
		}
		
		// Determines the position
		else 
		{
		int firstDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(0,1));
   		int secondDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(1,2));
   		int thirdDigitKo = Integer.parseInt(Integer.toString(inputNumber).substring(2,3));
   		
   		// Since the only limit is 1000 I only get the first digit
   		System.out.println(Ones[firstDigitKo-1] + " Thousand ");
		}
		
	}
 
    
    
}