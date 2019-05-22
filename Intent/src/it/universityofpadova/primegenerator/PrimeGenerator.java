package it.universityofpadova.primegenerator;
/*
 * Scrivere un programma che chieda all�utente un numero intero e che poi stampi
tutti i numeri primi fino al numero stesso. Per esempio, se l�utente immette 20,
il programma stamper�:
2
3
5
7
11
13
17
19
Ricordarsi che un numero � primo se non � divisibile per nessun altro numero,
salvo 1 e se stesso. Usate una classe PrimeGenerator con un metodo nextPrime.
Consigli:
Le maggiori difficolt� dell�esercizio possono essere riscontrate nel metodo
boolean isPrime(int a), il quale deve definire se un dato numero in ingresso �
primo. Si creino due variabili locali: una boolean, definita primo, che
restituisce true se il numero � primo (funziona da sentinella), l�altra int,
indicata con i, che serve da denominatore per verificare se la divisione tra il
numero dato in ingresso ed i risulta zero. Fintanto che i � minore o pari al
dato in ingresso e la divisione tra il numero stesso e i d� resto, allora
s�incrementa la variabile i. Se risulta che i � pari al numero dato, ci�
significa che � primo (un numero si definisce primo se � divisibile solo per se
stesso e per 1), e quindi il programma restituisce true, altrimenti false.
Il metodo String getFirstPrimes(int input), invece, stampa tutti i numeri primi
compresi tra 1 e il dato iniziale: ci� viene eseguito con un ciclo for, che
restituisce i valori sottoforma di stringhe.
 * */
public class PrimeGenerator {
	private int n;

	/**
	 * Si costruisce un generatore di numeri primi.
	 * 
	 * @param n
	 *            Il numero fino a cui devo trovare i primi.
	 */
	public PrimeGenerator(int numero) {
		n = numero;
	}

	/**
	 * Si verifica se un numero � primo.
	 * 
	 * @param a
	 *            Il numero su cui eseguo il test.
	 * @return Il risultato del test.
	 */
	public boolean isPrime(int a) {
		if (a < 1)
			return false;
		int i = 2;
		while (i <= a / 2) {
			if (a % i == 0)
				return false;
			i++;
		}
		return true;
	}

	/**
	 * Stampa i numeri primi.
	 * 
	 * @return primi I numeri primi.
	 */
	public String getFirstPrimes() {
		String primi = "";
		for (int i = 1; i <= n; i++) {
			if (isPrime(i))
				primi = primi + i + "\n";
		}
		return primi;
	}
}