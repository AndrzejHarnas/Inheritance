
public class Animal {
	
	
	public String gatunek;
	private String kolor;
	private int wiek;
	private int wzrost;
	
	
	public Animal(String gatunek, String kolor, int wiek, int wzrost){
		
		this.gatunek = gatunek;
		this.kolor = kolor;
		this.wiek = wiek;
		this.wzrost = wzrost;
		
		
	}
	
	
	public Animal(){
		
		this.gatunek="zwierze";
		this.kolor="brak";
		this.wiek=0;
		this.wzrost=0;
	}
	
	
	
	public void setGatunek(String gatunek){
		
		this.gatunek=gatunek;
		
	}
	
	public String getGatunek(){
		
		System.out.println(gatunek);
		return gatunek;
	}
	
	public String getKolor(){
		
		System.out.println(kolor);
		return kolor;
	}
	
	public int getWiek(){
		
		System.out.println(wiek);
		return wiek;
	}
	
	public int getWzrost(){
		
		System.out.println(wzrost);
		return wzrost;
	}
	
	
	

}
