package glace;

public class Parfum {

public static String CASSIS = "cassis";
public static String CHOCOLAT = "CHOCOLAT";
public static String CHOCOBLANC = "CHOCOBLANC";
public static String CHOCONOIR = "CHOCONOIR";
public static String FRAISE = "FRAISE";
public static String FRAMBOISE = "FRAMBOISE";
public static String ARABICA = "ARABICA" ;
public static String ROBUSTA = "ROBUSTA" ;

	private String name ;
	
	private Parfum(String s) {
		this.name = s;
	}
	
public String toString() {
	
	
	return name;
	
	
}
	
}
