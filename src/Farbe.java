//Nicolaus ist dick
public enum Farbe {
	Rot(255, 0, 0), Gr�n(0, 255, 0), Blau(0, 0, 255);
	
	int r,g,b = 0;
	
	Farbe(int rot, int gr�n, int blau)
	{
		this.r = rot;
		this.g = gr�n;
		this.b = blau;
	}
}
