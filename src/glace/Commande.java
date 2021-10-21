package glace;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Commande {
	
	public List lesCoupes ;
	public Commande() {
		List<Produit> listeDesCommandes = new LinkedList<>()  ;
		Produit coupeFruits = FruitsRouges.SINGLETON;
		Produit coupeTripleChocolat = TripleChocolat.SINGLETON;
		Produit chantilly = new ChantillyDecorator(coupeTripleChocolat);
		listeDesCommandes.add(coupeTripleChocolat);
		listeDesCommandes.add(coupeFruits) ;
		listeDesCommandes.add(chantilly) ;
		Produit sauce = new SauceChocolatDecorator(chantilly);
		listeDesCommandes.add(sauce) ;
		Produit cafeArabica = Cafe.SINGLETON ;
		listeDesCommandes.add(cafeArabica) ;
		Produit cafeArabica2 = Cafe.SINGLETON ;
		Produit cafeChantilly = new ChantillyDecorator(cafeArabica2);
		listeDesCommandes.add(cafeChantilly) ;
		this.lesCoupes = listeDesCommandes ;
	}

	public void publieFacture() {
		float total = 0;
		for (Iterator it = this.lesCoupes.iterator(); it.hasNext();) {
		Produit coupe = (Produit) it.next();
		System.out.println(coupe.description()+" + "+coupe.cout());
		total = total + coupe.cout();
		}
		System.out.println(" TOTAL : "+total);
		}

}
