package ovchipkaart;

public class deScanner
{
    double instapTariefTrein = 20.00;
    double instapTariefBus = 2.00;
    
   private void instapTariefBus(double hetSaldo) {
       if(hetSaldo <= this.instapTariefBus)
       {
	   System.out.print("verdoende saldo");
       } else {
	   System.out.print("niet verdoende saldo");
       }
   }
   


private double instapTariefTrein(double hetSaldo) {
    if(hetSaldo <= instapTariefTrein)
    {
	  return System.out.print("verdoende saldo");
    } else {
	  return System.out.print("niet verdoende saldo");
    }
}

}

