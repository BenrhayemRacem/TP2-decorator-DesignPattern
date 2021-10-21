package glace;

public class CoulisFraiseDecorator extends baseDecorator {
	public CoulisFraiseDecorator (Produit Coupe) {
		super(Coupe);
	}
	public float cout() {
		
		return   (super.cout()+ 1f);
	}
public String description() {
		
		return coupeBaseDecorator.description() + " au Coulis de fraise fraiches";
	}
}
