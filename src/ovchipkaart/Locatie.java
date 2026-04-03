package ovchipkaart;

public class Locatie
{

    private double posX;
    private double posY;
    private String naam;
    

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
	double afstandX = this.posX - andereLocatie.posX;
	double afstandY = this.posY - andereLocatie.posY;

	return Math.sqrt(afstandX * afstandX + afstandY * afstandY);
    }

    public double setposX(double posX)
    {
	return this.posX = posX;
    }

    public double setposY(double posY)
    {
	return this.posY = posY;
    }
    
    public String getNaam() 
    {
	    return naam;
	}

}
