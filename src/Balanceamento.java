
import java.util.Scanner;
import java.util.Stack;

/*
@thinktrasform
Problema 3
Verifica se um expressão esta balanceada. Expressão contem apenas sinais. 
Tipo de entrada: []{}()
*/
public class Balanceamento {
    public static void main(String [] agrs){
		Scanner sc = new Scanner(System.in);
		String balancear= sc.nextLine();
		
		
		Stack<Character> pilha = new Stack<Character>();
		
		char aux;
		
		for(int i = 0; i < balancear.length(); i++){
			if(abre(balancear.charAt(i))){
				if(balancear.charAt(i) == '(')
					pilha.push(')');
				else if(balancear.charAt(i) == '{')
					pilha.push('}');
				else if(balancear.charAt(i) == '[')
					pilha.push(']');
			}
			if(fecha(balancear.charAt(i))){
				if(pilha.isEmpty()){
					System.out.println("1");
					break;
				}
				
				aux = pilha.pop();
			
				if(!(balancear.charAt(i) == aux)){
					break;
				}
			}
		}
	
		if(pilha.isEmpty()){
			System.out.println(0);
		}else{
			System.out.println(1);
		}
	}	
			
	
	static boolean abre(char sinal){
		if(sinal == '(' || sinal == '[' || sinal == '{')
			return true;
		else
			return false;
	}
	
	static boolean fecha(char sinal){
		if(sinal == ')' || sinal == ']' || sinal == '}')
			return true;
		else
			return false;
	}
}

