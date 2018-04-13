
public class Main {


	public static void main(String[] args) {
		
		
		Animal kot = new Animal();
		
		kot.setGatunek("Kotowate");
		kot.getGatunek();
		kot.getWiek();
		kot.getWzrost();
		kot.getKolor();
		
		Animal Lew = new Animal("Kotowate","pomarańczowy",5,122);
        Lew.getGatunek();
        Lew.getWiek();
        Lew.getWzrost();
        Lew.getKolor();


        Pies puszek = new Pies("Puszek","PIES");
        
//        puszek.setGatunek("Pies");
        puszek.getGatunek();
        
        System.out.println(puszek.getName());
        

	}

}
