import javax.swing.*;
import java.awt.*;

public class Hyrja{
   private static int count = -1;
   int i;
   
   
   public Hyrja(){
      Database d=new Database();
    
      String input= JOptionPane.showInputDialog("Pershendetje doktor, cfare deshironi te beni \n \n Shkruaj 1 : Per te bere nje termin te ri \n \n Shkruaj 2 : Per t'i shiquar te gjitha terminet \n \n Shkruaj 3: Per te fshire termin \n \n Kliko Cancel: Per ta mbyllur aplikacionin");
      if(input==null)
      {System.exit(0);} 
      
      try{
         i=Integer.valueOf(input);
      }
      catch(Exception e)
      { JOptionPane.showMessageDialog(null, "Ju lutemi shtypni ndonjenjeren nga vlerat 1 2 3 "); 
      }
    
   
      if(i==1)
      {
         count++;
         d.setTerminet(count);
           // System.out.println(count);
         new TerminIRi();
      }
           
      if(i==2)
      {String input2 = JOptionPane.showInputDialog(" cilin termin deshiron ta shikoni, Ju keni "+ d.getTerminet()+" termine"  );
         int a = Integer.valueOf(input2);
         if (a<0 || a>d.getTerminet())
         {
            JOptionPane.showMessageDialog(null,"Ky termin nuk ekziston");
         }
         else
            new Terminet(a);}   
               
               
      if(i==3)
      {String input3 = JOptionPane.showInputDialog("Cilin termin deshironi ta fshini, ju keni "+ d.getTerminet() + " termine");
         int b = Integer.valueOf(input3);
         int c= b-1;
         if (b<0 || b>d.getTerminet())
         {
            JOptionPane.showMessageDialog(null,"Ky termin nuk ekziston");
         }
         else 
            d.delete(c);
      }
             
            
      new Hyrja();
   
   } 
   
}