package hundirLaFlota;
import java.util.Scanner;
public class juego {
	public static void main(String[] args) {
		int valorX;
		int valorY;
		String[][] campo= new String [10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Vamos a elegir la ficha que solo ocupa una casilla, procedamos...");
		System.out.println("introduce valor X");
		valorX = sc.nextInt();
		System.out.println("introduce valor y");
		valorY=sc.nextInt();
		FichaUnica ficha1= new FichaUnica(valorX, valorY);
		int importValorX = ficha1.getValorX();
		int importValorY = ficha1.getValorY();
		editarArray(campo, ficha1.getValorY(), ficha1.getValorX());
		System.out.println("los valores son " + valorX + valorY);
		for (int y=0; y < campo.length ;y++){
			for (int x=0; x < campo.length ;x++){
				System.out.print(campo[y][x]);
			} 
			System.out.println();
		}
	}

	public static String[][] editarArray(String[][] campo, int importValorY, int importValorX) {
		importValorX -= 1;
		for (int y=0; y < campo.length ;y++){
			for (int x=0; x < campo.length ;x++){
				if (importValorY == y && importValorX == x){
					campo[y][x]="O";
				}
				if(campo[y][x] != "O"){
						campo[y][x]="X";
				} 
				
			}
		}
		
		return campo;
		
		
	}
}