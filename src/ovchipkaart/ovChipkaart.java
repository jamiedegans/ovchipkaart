package ovchipkaart;

public class OVChipkaart
{
    private int kaartNummer;
    private double saldo;
    private boolean geldig;
    private Locatie instapLocatie;

    // Constructor
    public OVChipkaart(int kaart, double geld, boolean geldig)
    {

	this.kaartNummer = kaart; // 2345.6543.9876.9889
	this.saldo = geld; // 0.96
	this.geldig = geldig; // nu nog boolean
    }

    public boolean getGeldig()
    {
	return geldig;
    }

    public void setSaldo(double setSaldo)
    {
	this.saldo = setSaldo;
    }

    public double getSaldo()
    {
	return saldo;
    }

    public Locatie getInstapLocatie()
    {
	return instapLocatie;
    }

    public void inchecken(double instapTarief, Locatie locatie)
    {
	this.saldo -= instapTarief;
	this.instapLocatie = locatie;

    }
    
    public void uitchecken(double ritKosten)
    {
	this.saldo -= ritKosten;
	this.instapLocatie = null;

    }
}
