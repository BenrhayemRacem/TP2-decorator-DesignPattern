package glace;

public class baseDecorator extends Produit {

	public Produit coupeBaseDecorator ;
	
	public baseDecorator(Produit Coupe) {
		this.coupeBaseDecorator = Coupe ;
	}
	
	@Override
	public float cout() {
		// TODO Auto-generated method stub
		return coupeBaseDecorator.cout();
	}
	public String description() {
		
		return coupeBaseDecorator.description();
	}
	

}
