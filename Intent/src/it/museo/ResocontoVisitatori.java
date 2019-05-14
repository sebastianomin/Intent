package it.museo;

public class ResocontoVisitatori {

		private int numeroVisitatori;
		private int codiceMuseo;
		private int anno;

		public ResocontoVisitatori(int NV,int CM,int a){
			numeroVisitatori=NV;
			codiceMuseo=CM;
			anno=a;
		}

		public int getNumeroVisitatori(){
			return numeroVisitatori;
		}

		public int getCodiceMuseo(){
			return codiceMuseo;
		}

		public int getAnno(){
			return anno;
		}

}
