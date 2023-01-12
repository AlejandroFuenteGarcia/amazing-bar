
public class dueño
{
    private String nombreDuenio;
    private String dni;
    private bar barDelQueEsPropietario;

    public dueño(String nombreDelDuenio, String dniDuenio, bar barDelPropietario){
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

    public bar getBarDelPropietario() {
        return barDelQueEsPropietario;
    }
    
    public void setduenio(String nuevoDuenio){
        nombreDuenio = nuevoDuenio;
    }
    
    public void setdni(String nuevodni){
        dni = nuevodni;
    }
    
    public void setnuevoBar(bar nuevoBarDelQueEsPropietario){
        barDelQueEsPropietario = nuevoBarDelQueEsPropietario;
    }
    
    public void imprimirDetalles(){
        System.out.println("El nombre del dueño es : "+ nombreDuenio);
        System.out.println("El DNI del dueño es : "+ dni);
        System.out.println("El bar del que es propietario es : "+ barDelQueEsPropietario.getNombreDelBar() + " con un aforo de : "+ barDelQueEsPropietario.getNumeroDelAforo() + " personas");
    }
}