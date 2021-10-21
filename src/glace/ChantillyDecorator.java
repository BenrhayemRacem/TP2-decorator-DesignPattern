package glace;

public class ChantillyDecorator extends baseDecorator {
	
	public ChantillyDecorator (Produit Coupe) {
		super(Coupe);
	}
	public float cout() {
		
		return   (super.cout()+0.5f);
	}
public String description() {
		
		return coupeBaseDecorator.description() + " Chantilly";
	}

}
