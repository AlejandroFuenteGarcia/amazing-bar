

public class Bar
{
    private String nombreBar;
    private int aforo;

    public Bar(String nombreDelBar, int numeroDeAforo)
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
    
    public void imprimirDetalles(){
        System.out.println("El bar se llama " + nombreBar + " y su  aforo es de " + aforo + " personas");
    }
}
