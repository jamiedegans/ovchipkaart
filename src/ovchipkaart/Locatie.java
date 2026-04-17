package ovchipkaart;

public class Locatie
{
    
    private double posX;
    private double posY;
    private String naam;
    private double afstandX;
    private double afstandY;
    
    // ================================================== //
    // con strucor
    public Locatie(double posX, double posY, String naam)
    {
	this.posX = posX;
	this.posY = posY;
	this.naam = naam;
	
    }

    // functions

    public double afstandUitrekenen(Locatie andereLocatie)
    {
	afstandX = this.posX - andereLocatie.posX;
	afstandY = this.posY - andereLocatie.posY;

	return Math.sqrt(afstandX * afstandX + afstandY * afstandY);
    }

    public String getNaam() 
    {
	    return naam;
	}

}
