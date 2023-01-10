
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
}