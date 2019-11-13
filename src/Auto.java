
public abstract class Auto {
	int kmH = 0;
	int ps = 0;
	Farbe farbe;

	Auto(int kmH, int ps, Farbe farbe) {
		this.kmH = kmH;
		this.ps = ps;
		this.farbe = farbe;
	}

	abstract void fahren();

}
