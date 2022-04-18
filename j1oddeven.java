//Devyani Mahale
//Question 1

import java.io.*;

public class FileEx
{
 public static void main(String ar[])
 {
     int i;
     try{
     FileInputStream fodd = new FileInputStream("odd.txt");
     FileOutputStream fin = new FileOutputStream("number.txt");
     FileInputStream feven = new FileInputStream("even.txt");
    
     while((i=fin.read()) != -1) 
     {
      if(i%2==0)
      feven.write(i);
      else
      fodd.write(i);
     }
    
     fodd.close();
     fin.close();
     feven.close();
     }catch(Exception e){
        
     }
 }
}