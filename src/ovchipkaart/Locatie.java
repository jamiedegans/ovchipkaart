package ovchipkaart;

public class Locatie
{

    private double posX;
    private double posY;

    // ================================================== //
    // construcor
    public Locatie(double posX, double posY)
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
}
