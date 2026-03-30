package ovchipkaart;

public class Paal
{
    private double instapTarief = 00.00;
    private boolean hebIkGenoegGeld;
    private double instapKosten = 00.00;
    private Locatie locatie;
    // ==================================================//
    // construcor
    public Paal(double instapTarief, Locatie locatie)
    {
	this.instapTarief = instapTarief;
	this.locatie = locatie;
    }
    
    public Paal(double instapTarief, double posX, double posY)
    {
	this.instapTarief = instapTarief;
	this.locatie = new Locatie(posX,posY);
    }
    
    public Paal(Locatie locatie)
    {
	this.instapTarief = 20;
	this.locatie = locatie;
    }
    
    public Paal(double posX, double posY)
    {
	this.instapTarief = 20;
	this.locatie = new Locatie(posX,posY);
    }

    // functions
    public void setinstapKosten(double instapKosten)
    {
	this.instapKosten = instapKosten;
    }

    // functions
    // =================================================//
    public void leesKaart(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getGeldig() == true)
	{
	    System.out.println("jou kaart is geldig");

	} else
	{
	    System.out.println("jou kaart is niet geldig");

	}
    }

    private boolean checkSaldo(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getSaldo() <= instapTarief)
	{
	    System.out.println("test geen saldo");
	    return false;
	} else
	{
	    System.out.println("test genoeg saldo");
	    return true;
	}

    }

    public double inchecken(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getGeldig() == true && checkSaldo(oVChipkaart))
	{
	   this.instapKosten = oVChipkaart.setSaldo(oVChipkaart.getSaldo() - instapTarief);
	    System.out.println("ingecheckt");
	} else
	{
	    System.out.println("test teweining saldo");
	}
	
	
	
	
    }
}
