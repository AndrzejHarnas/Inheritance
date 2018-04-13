
public class Pies extends Animal {
	
	private String imie;

	public Pies(){
	
		this.imie = "knowname";
		
	}
	
	public Pies(String imie, String gatunek ){
		this.imie = imie;
		this.gatunek = gatunek;
	}
	
	public String getName(){
		
		return imie;
	}
	
	
}


