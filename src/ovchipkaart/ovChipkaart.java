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

    public double getSaldo()
    {
	return saldo;
    }

    public double setSaldo(double setSaldo)
    {
	return this.saldo = setSaldo;
    }

    public Locatie getInstapLocatie()
    {
	return instapLocatie;
    }

    public void setInstapLocatie(Locatie locatie)
    {
	instapLocatie = locatie;
    }

}
