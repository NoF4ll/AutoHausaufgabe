//Ich bin ein kommentar
public class Golf extends Auto {

	Golf(int kmH, int ps, Farbe farbe) {
		super(kmH, ps, farbe);
	}
	

	@Override
	void fahren() {
		System.out.println("Ich Golf, fahre " + this.kmH + "kmh");
		System.out.println("Ich habe " + this.ps + "Ps");
		System.out.println("Ich habe die Farbe "+this.farbe);
	}

}
