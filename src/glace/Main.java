package glace;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List listeDesCommandes = null  ;
//		CoupeGlacee coupeFruits = FruitsRouges.SINGLETON;
//		CoupeGlacee coupeTripleChocolat = TripleChocolat.SINGLETON;
//		listeDesCommandes.add(coupeTripleChocolat);
//		listeDesCommandes.add(coupeFruits) ;
		Commande commande = new Commande ();
		
		
			commande.publieFacture();
		

	}

}
