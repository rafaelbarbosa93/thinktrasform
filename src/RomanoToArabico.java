
import java.util.Scanner;

/*
@thinktrasform
Problema 2
Converte um número romano entre 0 < 3999 para número arábico.
*/
public class RomanoToArabico {
    public static void main(String [] args){
 		Scanner sc = new Scanner(System.in);
		
		int[] arabicos = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String[] romanos = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		String resultado = "";
                System.out.println("Entre com um número romano:");
		int n = sc.nextInt();
		for(int i = 12; i >= 0; i--){
			while(n >= arabicos[i]){
				n -= arabicos[i];
				resultado += romanos[i];
			}
		}
		System.out.println(resultado);
	}
}
