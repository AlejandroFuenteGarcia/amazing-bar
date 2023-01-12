
public class Duenio
{
    private String nombreDuenio;
    private String dni;
    private Bar barDelQueEsPropietario;

    public Duenio(String nombreDelDuenio, String dniDuenio, Bar barDelPropietario){
        nombreDuenio=nombreDelDuenio;
        dni=dniDuenio;
        barDelQueEsPropietario= barDelPropietario;
    }
    
    public String getNombre() {
        return nombreDuenio;
    }

    public String getDNI() {
        return dni;
    }

    public Bar getBarDelPropietario() {
        return barDelQueEsPropietario;
    }
    
    public void setduenio(String nuevoDuenio){
        nombreDuenio = nuevoDuenio;
    }
    
    public void setdni(String nuevodni){
        dni = nuevodni;
    }
    
    public void setnuevoBar(Bar nuevoBarDelQueEsPropietario){
        barDelQueEsPropietario = nuevoBarDelQueEsPropietario;
    }
    
    public void imprimirDetalles(){
        System.out.println("El nombre del dueño es : "+ nombreDuenio);
        System.out.println("El DNI del dueño es : "+ dni);
        System.out.println("El bar del que es propietario es : "+ barDelQueEsPropietario.getNombreDelBar()  + " con un aforo de : "+ barDelQueEsPropietario.getNumeroDelAforo() + " personas");
    }
}