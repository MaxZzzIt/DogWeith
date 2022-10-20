package by.home.maxzzzit;

public class Dog {
	private int weith;
	
	public int getWeith () {
		return weith;
	}
	
	public void setWeith (int weith) {
		if (weith > 0) {
		this.weith = weith;
		}
		else System.out.println("Vvedite korrektnii ves dog ! "+weith);
	}
}
