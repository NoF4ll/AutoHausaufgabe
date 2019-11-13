
public class Audi extends Auto {

	Audi(int kmH, int ps, Farbe farbe) {
		super(kmH, ps, farbe);

	}

	@Override
	void fahren() {
		System.out.println("Ich bin ein Audi und fahre " + this.kmH + "kmh");
		System.out.println("Ich habe " + this.ps + "Ps");
		System.out.println("Ich habe die Farbe " + this.farbe);

	}

}
