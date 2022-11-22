package vezhbabroj1;

public class MainClass {
	public static void main(String[] args) {
		Covek coek = new Covek();
		coek.setIme("Filip");
		coek.setPrezime("Risteski");
	    coek.setIndex("INKI835");
	    
	    System.out.println("Ime "+coek.getIme()+" Prezime "+coek.getPrezime()+" Indeks "+coek.getIndex());
	}

}
