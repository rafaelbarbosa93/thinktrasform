
import java.util.Scanner;

/*
@thinktrasform
Problema 4
Babai é um robo que anda por um grid, Babai começa na posição (0,0) do grid virado para o leste,
a cada passo de Babai ele vira para direita. Objeito descobrir quantas casas babai anda antes de parar.

*/
public class CelulasVisitadas {
    public static void main(String [] agrs){
		Scanner sc = new Scanner(System.in);
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		int[][] matriz = new int[linha][coluna];
		for(int i = 0; i < linha; i++){
			for(int j = 0; j < coluna; j++){
				matriz[i][j] = 0;
			}
		}
		Babai bb = new Babai(0,0,'L');
		matriz[0][0] = 1;
		int contaPassos = 1;
		int contaVirada = 1;
		
		while(contaVirada <= 5){
		switch(bb.orientacao){
		case 'N':
			if(caminhoLivre(matriz, bb.getpLinha() - 1, bb.getpColuna())){
				bb.setpLinha(bb.getpLinha() - 1);
				bb.setorientacao('L');
				matriz[bb.getpLinha()][bb.getpColuna()] = 1;
				contaPassos++;
				contaVirada = 0;
				System.out.println("("+bb.getpLinha()+","+bb.getpColuna()+")");
				}else{
					bb.setorientacao('L');
					contaVirada++;
				}
			break;
		case 'S':
			if(caminhoLivre(matriz, bb.getpLinha() + 1, bb.getpColuna())){
				bb.setpLinha(bb.getpLinha()+1);
				bb.setorientacao('O');
				matriz[bb.getpLinha()][bb.getpColuna()] = 1;
				contaPassos++;
				contaVirada = 0;
				System.out.println("("+bb.getpLinha()+","+bb.getpColuna()+")");
				}else{
					bb.setorientacao('O');
					contaVirada++;
				}
			break;
		case 'L':
			if(caminhoLivre(matriz, bb.getpLinha(), bb.getpColuna() + 1)){
			bb.setpColuna(bb.getpColuna()+1);
			bb.setorientacao('S');
			matriz[bb.getpLinha()][bb.getpColuna()] = 1;
			contaPassos++;
			contaVirada = 0;
			System.out.println("("+bb.getpLinha()+","+bb.getpColuna()+")");
			}else{
				bb.setorientacao('S');
				contaVirada++;
			}
			break;
		case 'O':
			if(caminhoLivre(matriz, bb.getpLinha(), bb.getpColuna() - 1)){
				bb.setpColuna(bb.getpColuna() - 1);
				bb.setorientacao('N');
				matriz[bb.getpLinha()][bb.getpColuna()] = 1;
				contaPassos++;
				contaVirada = 0;
				System.out.println("("+bb.getpLinha()+","+bb.getpColuna()+")");
				}else{
					bb.setorientacao('N');
					contaVirada++;
				}
			break;
		}
	}
		
		System.out.println(contaPassos);
		
	}
	
	public static boolean caminhoLivre(int[][] matriz, int linha, int coluna){
		if(( linha >= 0 && linha <  matriz.length) && (coluna >= 0 &&  coluna < matriz[0].length)){
			if(matriz[linha][coluna] == 0)
				return true;
			else
				return false;
		}else{
			return false;
		}
	}
	
	public static class Babai{
		private int pLinha;
		private int pColuna;
		private char orientacao;
		
		public Babai(int pLinha, int pColuna, char orientacao){
			this.pLinha = pLinha;
			this.pColuna = pColuna;
			this.orientacao = orientacao;
		}
		
		public int getpLinha(){
			return this.pLinha;
		}
		
		public int getpColuna(){
			return this.pColuna;
		}
		
		public char getorientacao(){
			return this.orientacao;
		}
		
		public void setpLinha(int linha){
			this.pLinha = linha;
		}
		
		public void setpColuna(int coluna){
			this.pColuna = coluna;
		}
		
		public void setorientacao(char orientacao){
			this.orientacao = orientacao;
		}
	}
}

