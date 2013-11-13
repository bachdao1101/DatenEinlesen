import java.io.*;
import java.util.*;
import java.text.*;

public class Daten{
  //double data[]=new double[33000];
  
  List<Zeile> ar=new ArrayList<Zeile>();
  
  //public  void einlesen(double data[]){
  public  List<Zeile> einlesen(){
    String zeile="";
    String[] tokens;
    
    
    Date d=new Date();
      SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
      df.setTimeZone(TimeZone.getDefault());
      String DatumsString=df.format(d);
      
      String dateiName="crop_"+DatumsString+".csv";
      //zum Test:
      dateiName="crop_18_05_12.csv";
      
    try {
      BufferedReader br=new BufferedReader(new FileReader(new File(dateiName)));
      int zahler=0;
      while (zeile!=null){
        zeile=br.readLine();
        if (zeile!=null){
          //System.out.println("Zeile: "+zeile);
          tokens=zeile.split(";");

          for (String s:tokens) {

           //data[zahler]=Double.parseDouble(tokens[1]);
           ar.add(new Zeile(tokens[0],Double.parseDouble(tokens[1]),zahler));
            //System.out.println(s);
            }
          //System.out.println("======");

        }
         zahler++;
      }//ende while
       br.close();
    } catch (IOException e){
      e.printStackTrace();
    }
    return ar;
  }
  
}