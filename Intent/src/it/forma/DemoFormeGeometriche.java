package it.forma;

/* Applicazione di prova per Forma, Quadrato e Cerchio. */ 
class DemoFormeGeometriche { 
    public static void main(String[] args) { 
      
    	GestioneForme gf=new GestioneForme();
    	
      Forma q = new Quadrato(5);  
      gf.getForme().add(q);
      Forma q1 = new Quadrato(15);
      gf.getForme().add(q1);
      Forma q2 = new Quadrato(13);
      gf.getForme().add(q2);
      Forma q3 = new Quadrato(14);
      gf.getForme().add(q3);
         
     Forma c=new Cerchio(3);
     gf.getForme().add(c);
     Forma c1=new Cerchio(4);
     gf.getForme().add(c1);
     Forma c2=new Cerchio(2);
     gf.getForme().add(c2);
         
        //System.out.println(c2.area());
        System.out.println(gf.cercaArea(12.566370614359172));
        System.out.println("***********************************");
        System.out.println("Ordinamento dei quadrati in ordine decrescente con lato maggiore di 10");
        System.out.println(gf.OrdinaLatoMaggioreDiDieci());
        System.out.println("***********************************");
        System.out.println("Quadrato con area minima: ");
        System.out.println(gf.quadratoAreaMinima());
        System.out.println("***********************************");
        System.out.println("Cerchio con area massima: ");
        System.out.println(gf.cerchioAreaMassima());
        System.out.println("***********************************");
        System.out.println("Quadrato con il lato minore");
        System.out.println(gf.quadratoLatoMinore());

    } 
} 