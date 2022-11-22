package vezhbabroj3;

public class Proizvod {
	private String ime;
	private String proizvoditel;
	private int cena;
	private double tezhina;
	
	public Proizvod () {
		this.ime = "Milka Bubbly";
		this.proizvoditel = "Milka";
		this.cena = 70;
		this.tezhina = 100;
	}
	
	public String getIme () {
		return this.ime;
	}
	public String getProizvoditel () {
		return this.proizvoditel;
	}
	public int getCena () {
		return this.cena;
	}
	public double getTezhina () {
		return this.tezhina;
	}
}
