
public class Cercles {
	public int x, y, r;
	
	

	public Cercles(int x, int y, int r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	public void afficher()
	{
		System.out.println("Cercle centre en x: "+x+ " en y: "+y);
		System.out.println("de rayon : "+r);
	}
	
	public double perimetre()
	{
		return 2*Math.PI*r;
	}
	
	public double aire() 
	{
		return Math.PI*Math.pow(r, 2);
	}
	
	public void deplacer(int nx, int ny)
	{
		x=nx;
		y=ny;
	}
	
	public void agrandir(int nr)
	{
		r+=nr;
	}
	
	public int getNewRayon()
	{
		return r;
	}

} //Fin de la classe Cercle
