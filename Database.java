import javax.swing.*;

public class Database {
    private static int Terminet;

    private static String Emri;
    private static String Numri;
    private static String Dita;
    private static String Ora;

    public static String [] EmriArray = new String[49];
    public static String [] NumriArray = new String[49];
    public static String [] DitaArray = new String[49];
    public static String [] OraArray = new String[49];


    public void setEmri(String emri)
    {
        Database.Emri=emri;
    }
    public String getEmri()
    {
        return Emri;
    }
    public void setNumri(String numri)
    {
        Database.Numri =numri;
    }
    public String getNumri()
    {
        return Numri;
    }

    public void setDita(String dita)
    {
        Database.Dita =dita;
    }
    public String getDita()
    {
        return Dita;
    }

    public void setOra(String ora)
    {
        Database.Ora =ora;
    }
    public String getOra()
    {
        return Ora;
    }

    public void setTerminet(int a)
    {
        Database.Terminet=a;

    }
    public int getTerminet()
    {
        return Terminet+1;
    }
    public Database() {
        EmriArray[Terminet]=getEmri();
        NumriArray[Terminet]=getNumri();
        DitaArray[Terminet]=getDita();
        OraArray[Terminet]=getOra();

    }
    
     public boolean delete(int vlera)
    { boolean b = false;
        if (EmriArray[vlera]  != null )
        {   
            EmriArray[vlera] = null;
            NumriArray[vlera] = null;
            DitaArray[vlera] = null;
            OraArray[vlera] = null;
            JOptionPane.showMessageDialog(null,"Termini u fshi");          
            
            b = true;
        }


        return b;
    }

    


 

}
