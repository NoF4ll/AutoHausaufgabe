//Nicolaus ist dick
public enum Farbe {
	Rot(255, 0, 0), Grün(0, 255, 0), Blau(0, 0, 255);
	
	int r,g,b = 0;
	
	Farbe(int rot, int grün, int blau)
	{
		this.r = rot;
		this.g = grün;
		this.b = blau;
	}
}
