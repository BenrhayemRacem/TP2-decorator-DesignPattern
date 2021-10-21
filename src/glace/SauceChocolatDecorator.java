package glace;

public class SauceChocolatDecorator extends baseDecorator {
	public SauceChocolatDecorator (Produit Coupe) {
		super(Coupe);
	}
	public float cout() {
		
		return   (super.cout()+0.7f);
	}
public String description() {
		
		return coupeBaseDecorator.description() + " et sa delicieuse sauce Chocolat";
	}

}

