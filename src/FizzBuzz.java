
import java.util.Scanner;

/*
@thinktrasform
Problema 1
Imprime Fizz no lugar dos números múltiplos de três, Buzz no lugar dos múltiplos de cinco e
FizzBuzz no lugar dos múltiplos de três e cinco.
*/
 
public class FizzBuzz {
    public static void main(String [] agrs){
		Scanner sc = new Scanner(System.in);
                System.out.println("Entre com um número: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			if((i%3 == 0) && (i%5 == 0))
				System.out.println("FizzBuzz");
			else if(i%3 == 0)
				System.out.println("Fizz");
			else if(i%5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}
}
