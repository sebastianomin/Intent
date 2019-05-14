package it.museo;

public class Opera {
	private int codice;
	private String nome;
	private String autore;
	private Periodo periodo;

	public Opera(int c,String n,String a,Periodo p){
		codice=c;
		nome=n;
		autore=a;
		periodo=p;
	}

	public int getCodice(){
		return codice;
	}

	public String getNome(){
		return nome;
	}

	public String getAutore(){
		return autore;
	}

	public Periodo getPeriodo(){
		return periodo;
	}

	public String toString(){
		return  "\nCodice: "+codice+
				"\nNome: "+nome+
				"\nAutore: "+autore+
				"\nPeriodo: "+periodo;

	}

	public boolean equals(Object o){
		Opera op=(Opera)o;
		return this.codice== op.getCodice();
	}


}
