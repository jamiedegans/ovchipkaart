package ovchipkaart;

public class Paal
{
    private double instapTarief = 00.00;
    private Locatie locatie;
    private double prijsPerKm = 1.34; 
    private double ritKosten;
 

    // ==================================================//
    // construcor

    public Paal(double instapTarief, Locatie locatie)
    {
	this.instapTarief = instapTarief;
	this.locatie = locatie;

    }

    public Paal(Locatie locatie)
    {
	this.locatie = locatie;
    }

    // functions
    // =================================================//
    public void leesKaart(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getGeldig() == true)
	{
	    System.out.println("Uw kaart is geldig.");

	} else
	{
	    System.out.println("jou kaart is niet geldig koop een nieuwe");

	}
    }

    private boolean checkSaldo(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getSaldo() <= instapTarief)
	{
	    System.out.println("Onvoldoende saldo. Laad uw kaart op");
	    return false;
	} else
	{
	    System.out.println("Voldoende saldo beschikbaar.");
	    return true;
	}

    }

    public void inchecken(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getGeldig() == true && checkSaldo(oVChipkaart))
	{

	    System.out.println("de instapkosten zijn € " + (instapTarief) + " dit gaat van jouw saldo huidige "
		    + (oVChipkaart.getSaldo()));
	    
	    oVChipkaart.inchecken(this.instapTarief, this.locatie);

	    System.out.println("jouw nieuwe saldo is " + oVChipkaart.getSaldo());
	   // oVChipkaart.setInstapLocatie(locatie);// moet de double van de huidge locatie

	    System.out.println("je bent in gecheckt met je ov kaart op " + oVChipkaart.getInstapLocatie().getNaam());

	} else
	{
	    System.out.println("Inchecken mislukt.");
	}

    }

    public void uitchecken(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getInstapLocatie() == null)
	{
	    System.out.println("Uitchecken niet mogelijk: u bent niet ingecheckt.");
	    return;
	}

	Locatie begin = oVChipkaart.getInstapLocatie();
	Locatie eind = this.locatie;

	double afstand = begin.afstandUitrekenen(eind);

	ritKosten = afstand * prijsPerKm;

	oVChipkaart.uitchecken(ritKosten);
	
	
	System.out.println("afstand gereisd " + afstand + "km");
	System.out.println("ritkosten " + ritKosten);
	System.out.println("nieuw saldo " + oVChipkaart.getSaldo());
	System.out.println("je bent uitgecheckt op " + eind.getNaam());
    }
}