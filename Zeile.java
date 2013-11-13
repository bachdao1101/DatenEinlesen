public class Zeile{
  private String datum;
  private double wert;
  private long zaehler;
  
  public Zeile(String datum, double wert, long zaehler){
    this.datum=datum;
    this.wert=wert;
    this.zaehler=zaehler;
  }
  
  public Zeile(){
    }

  
  public String getDatum(){
    return datum;
  }
  
   public double getWert(){
    return wert;
  }
  
  public double getZaehler(){
    return zaehler;
  }
  
  public void setDatum(String datum){
    this.datum=datum;
  }

   public void setWert(double dax){
    this.wert=wert;
  }
  
  
    public void setZaehler(long zaehler){
    this.zaehler=zaehler;
  }
 }

