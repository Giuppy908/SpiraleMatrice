import java.util.Scanner;
public class Spirale {
	
					//Metodo riempiMatrice
	
	public static void riempiMatrice (int m[][], int n) {
	int i = 0;//indice per le righe
	int j = 0;//indice per le colonne
	int contatore = 1;//contatore per stampare i numeri 
	//while in cui viene riempita la matrice a spirale 
	while (contatore != n*n) {
				//inizio del while
		//in questo while lavoro sulle colonne lasciando la stessa riga
		while (j < n && j >= 0) {
			if (m[i][j] != 0) {//se la matrice incontra una posizione piena esce dal ciclo per verificare delle condizioni
				break;
			}
			if (i < n/2) { 
			m[i][j] = contatore;
			contatore++;
			j++;
		} else if (i > n/2) {
			m[i][j] = contatore;
			contatore++;
			j--;
		}	
		}//fine del while
		
		if (j > n/2 && i < n/2) {
		j--;
		i++;
		}
		
		if (i > n/2 && j < n/2) {
			j++;
			i--;
		}
				//inizio del while
		//in questo while lavoro sulle righe lasciando la stessa colonna
		while (i < n && i >= 0) {
			if (m[i][j] !=0 ) {//se la matrice incontra una posizione piena esce dal ciclo per verificare delle condizioni
				break;
			}
			
			if (j >= n/2) {
			m[i][j] = contatore;
			contatore++;
			i++;
		} else if (j <= n/2) {
			m[i][j] = contatore;
			contatore++;
			i--;
		}
		}
		if (i < n/2 && j < n/2) {
			i++;
			j++;
		}
		
		if (i > n/2 && j >= n/2) {
			i--;
			j--;
		}
	}
	}
	//Metodo stampaMatrice in cui viene stampata la matrice grazie a due cicli di for (un ciclo per ogni dimensione della matrice)
	public static void stampaMatrice(int m[][]) {
		for (int i=0; i<m.length; i++) {
			for (int j = 0; j<m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}System.out.println();
		}
	}

						//Inizio Main
	
	public static void main(String[] args) {
	int l = 0;//lunghezza della matrice
	Scanner sc = new Scanner(System.in);//dichiarazione Scanner
	System.out.print("Inserisci la lunghezza di un lato della matrice: ");
	l =sc.nextInt();
	int [][]m = new int [l][l];//matrice da riempire a spirale
	riempiMatrice(m,l);//metodo che riempe la matrice a spirale 
	stampaMatrice(m);//metodo che stampa la matrice
	}
	
}
