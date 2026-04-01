package ovchipkaart;

public class Locatie
{

    private double posX;
    private double posY;
    

    // ================================================== //
    // con strucor
    public Locatie(double posX, double posY, String string)
    {
	this.posX = posX;
	this.posY = posY;
	
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

}
