package Clases;

import java.util.Date;

public class Alumno extends Persona{
    private long Cuenta;
    public Alumno(){}
    public Alumno(long Cuenta, long Id, String Nombre, Date FechaNacimiento){
        super(Id, Nombre, FechaNacimiento);
        this.Cuenta = Cuenta;
    }//Fin del constructor: Alumno(long Cuenta, long Id, String Nombre, Date FechaNacimiento).

    public long getCuenta(){return this.Cuenta;}//Fin del método: getCuenta.
    public void setCuenta(long Cuenta){this.Cuenta = Cuenta;}//Fin del método: setCuenta.

}//Fin de la clase: Alumno.
