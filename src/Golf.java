public class Golf extends Auto {

	Golf(int kmH, int ps, Farbe farbe) {
		super(kmH, ps, farbe);
	}
	

	@Override //�berschreibung der fahren Methode in der Auto Klasse
	void fahren() {
		System.out.println("Ich Golf, fahre " + this.kmH + "kmh");
		System.out.println("Ich habe " + this.ps + "Ps");
		System.out.println("Ich habe die Farbe "+this.farbe);
	}

}
