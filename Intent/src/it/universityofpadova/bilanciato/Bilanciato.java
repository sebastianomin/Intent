package it.universityofpadova.bilanciato;

/*
 * Testo:
Un array di interi di lunghezza n si dice bilanciato se esiste un indice i tale
che la somma dei primi i elementi dell'array sia uguale alla somma dei rimanenti
n - i elementi. Ad esempio, l'array [20, -4, 11, 1, 4] è bilanciato, perche i
primi due elementi hanno somma uguale ai rimanenti elementi, mentre l'array [7,
13, 6, 8] non è bilanciato, perché nessun indice verifica la proprietà
richiesta. Sviluppare un metodo public static boolean bilanciato(int[]
unArray){...} che restituisce true se unArray è bilanciato, e false altrimenti.
Consigli:
Per risolvere questo esercizio è necessario usare due for innestati. Vanno
create 2 variabili int sx(sinistra), dx(destra). Nel primo for si inserisce in
sx il primo elemento di unArray e si pone dx=0. Nel secondo for si sommano tutti
i restanti elementi, il risultato va inserito in dx. Fuori dal for più interno
si verifica se sx e dx sono uguali. Quindi se sono uguali si restituisce true e
il metodo finisce, se non sono uguali il compilatore ritorna al primo for e
somma a sx anche il secondo elemento di unArray. Nel secondo for si sommano
tutti i restanti elementi, il risultato va inserito in dx. si verifica se sx e
dx sono uguali ecc. se l’uguaglianza non si verifica mai si restituisce false.
 * 
 * 
 * */

public class Bilanciato {
	public static boolean bilanciato(int[] unArray) {
		int sx = 0;
		int dx = 0;
		for (int i = 0; i < unArray.length; i++) {
			sx = sx + unArray[i];
			dx = 0;
			for (int j = i + 1; j < unArray.length; j++) {
				dx = dx + unArray[j];
			}
			if (sx == dx)
				return true;
		}
		return false;
	}
}