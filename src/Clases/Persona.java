package Clases;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Persona {
    private Date FechaNacimiento;
    private long Id;
    private String Nombre;
    public Persona(){}
    Persona(long Id, String Nombre, Date fechaNacimiento){
        this.Id = Id;
        this.Nombre = Nombre;
        this.FechaNacimiento = fechaNacimiento;
    }//Fin del constructor: Persona(long Id, String Nombre, Date fechaNacimiento).

    public int CalcularEdad(){
        LocalDateTime horaActual = LocalDateTime.now();
        return Integer.parseInt(new SimpleDateFormat("yyyy").format(FechaNacimiento)) - horaActual.getYear();
    }//Fin del método: CalcularEdad.

    public Date getFechaNacimiento(){return this.FechaNacimiento;}//Fin del método: getFechaNacimiento.
    public long getId(){return this.Id;}//Fin del método: getId.
    public String getNombre(){return this.Nombre;}//Fin del método: getId.

    public void setFechaNacimiento(Date fechaNacimiento){this.FechaNacimiento = fechaNacimiento;}//Fin del método: setFechaNacimiento.
    public void setId(long Id){this.Id = Id;}//Fin del método: setId.
    public void setNombre(String Nombre){this.Nombre = Nombre;};

}//Fin de la clase: Persona.
