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
	this.locatie = new Locatie(posX, posY);
    }

    public Paal(Locatie locatie)
    {
	this.instapTarief = 20;
	this.locatie = locatie;
    }

    public Paal(double posX, double posY)
    {
	this.instapTarief = 20;
	this.locatie = new Locatie(posX, posY, "Arnehm");
    }

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
	    System.out.println("jou kaart is niet geldig koop een nieuwe");

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

    public void inchecken(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getGeldig() == true && checkSaldo(oVChipkaart))
	{
	    
	    System.out.println("de instapkosten zijn " + (instapTarief) +" dit gaat van jouw saldo huidege " + (oVChipkaart.getSaldo()));
	    
	    System.out.println("jouw nieuwe saldo is " + (this.instapKosten = oVChipkaart.setSaldo(oVChipkaart.getSaldo() - instapTarief)));
	    
	    
	    
	  System.out.println("je bent in gecheckt met je ov kaart op ");
	  
	    oVChipkaart.setInstapLocatie(locatie.setposX(70));// moet de double van de huidge locatie

	} else
	{
	    System.out.println("test teweining saldo");
	}

    }
}
