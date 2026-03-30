package ovchipkaart;

public class OVChipkaart
{
    private int kaartNummer;
    private double saldo;
    private boolean geldig;
    private double InstapLocatie;
    
    // Constructor
    public OVChipkaart(int kaart, double geld, boolean geldig, boolean benIkAangemeld)
    {

	this.kaartNummer = kaart; // 2345.6543.9876.9889
	this.saldo = geld; // 0.96
	this.geldig = geldig; // nu nog boolean
	this.InstapLocatie = InstapLocatie;
    }

    public boolean getGeldig()
    {
	return geldig;
    }

    public double getSaldo()
    {
	return saldo;
    }
    
    public void setSaldo(double setSaldo)
    {
	this.saldo = setSaldo;
    }


    public void setBenIkInAangemeld(boolean benIkAangemeld)
    {
	this.benIkAangemeld = benIkAangemeld;
    }
    
}
