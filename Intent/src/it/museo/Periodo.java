package it.museo;

public	class Periodo implements Comparable{

		private int annoInizio;
		private int annoFine;

		public Periodo(int AI,int AF){
			if(AI<AF){
			annoInizio=AI;
			annoFine=AF;
			}
			else
			{	annoInizio=AF;
				annoFine=AI;
				}
		}

		public int getAnnoInizio(){
			return annoInizio;
		}

		public int getAnnoFine(){
			return annoFine;
		}

		public String toString(){
			String labelAI="DC";
			if(this.annoInizio <0)
				labelAI="AC";
			String labelAF="DC";
				if(this.annoFine <0)
					labelAF="AC";				
			return 	"Anno Inizio: "+Math.abs(annoInizio)+labelAI+" Anno Fine: "+Math.abs(annoFine)+labelAF;
		}
		
		public boolean equals(Object o){
			Periodo op=(Periodo)o;
			return this.annoFine==op.annoFine && this.annoInizio==op.annoInizio;
		} 
		public int compareTo(Object o){
			Periodo op=(Periodo)o;
			if(this.annoFine < op.annoFine)
				return -1;
			if(this.annoFine>op.annoFine)
					return 1;
			else{
				if(this.annoInizio<op.annoInizio)
						return -1;
				if(this.annoInizio>op.annoInizio)
					return 1;
			}
			return 0;
		}
}
