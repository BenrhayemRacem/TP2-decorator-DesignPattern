package glace;

public class Cafe extends Boissons {

	public static final Cafe SINGLETON = new Cafe();
	private Cafe() {
	this.parfums.add(Parfum.ARABICA);
	this.parfums.add(Parfum.ROBUSTA);
	
	}
	public float cout() {
		return 1.5f;
		}
	
}
