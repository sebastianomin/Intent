package it.universityofpadova.pari;


/*
 * Testo:
Un array di interi si dice pari se ciascuno dei suoi elementi appare un numero
pari di volte. Ad esempio, l’array [20, 1, 1, 20] è pari, mentre l’array [20, 1,
20, 1, 1] non è pari,poichè l’elemento 1 appare un numero dispari di volte.
Sviluppare un metodo public static boolean isPari(int[] myArray) che restituisce
true se myArray è pari, false altrimenti.
Consigli:
Si utilizzano due for innestati.
 * */
public class Pari {
	public static boolean isPari(int[] myArray) {
		if (myArray.length % 2 != 0 || myArray.length == 0)
			return false;
		for (int i = 0; i < myArray.length; i++) {
			int c = 0;
			for (int j = 0; j < myArray.length; j++) {
				if (myArray[i] == myArray[j])
					c++;
				if (c % 2 != 0 && j == myArray.length - 1)
					return false;
			}
		}
		return true;
	}
}