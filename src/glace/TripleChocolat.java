package glace;

public class TripleChocolat extends CoupeGlacee {
public static final TripleChocolat SINGLETON = new TripleChocolat();
private TripleChocolat() {
this.parfums.add(Parfum.CHOCOBLANC);
this.parfums.add(Parfum.CHOCOLAT);
this.parfums.add(Parfum.CHOCONOIR);
}


public float cout() {
return 5.5f;
}
}
