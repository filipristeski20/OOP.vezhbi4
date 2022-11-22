package vezhbabroj2;

public class MainClass {
	public static void main(String[] args) {
		Restoran restoranche = new Restoran();
		restoranche.setIme("Belvedere");
		restoranche.setLokacija("Bitola");
		restoranche.setTelefon(072254123);
		restoranche.setBroj(42);
		System.out.println("Restoranot " + restoranche.getIme() + " se naogja vo " + restoranche.getLokacija() + " nivniot telefon e " + restoranche.getTelefon()+ " i imaat slobodni "+restoranche.getBroj()+" mesta");
	}
}
