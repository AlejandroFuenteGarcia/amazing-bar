

public class bar
{
    private String nombreBar;
    private int aforo;

    public bar(String nombreDelBar, int numeroDeAforo)
    {
        nombreBar= nombreDelBar;
        aforo= numeroDeAforo;
    }
    
    public String getNombreDelBar(){
        return nombreBar;
    }
    
    public int getNumeroDelAforo(){
        return aforo;
    }
    
    public void setNombre(String nuevoNombre){
        nombreBar = nuevoNombre;
    }

    public void setAforo(int nuevoAforo){
        aforo = nuevoAforo;
    }
}
