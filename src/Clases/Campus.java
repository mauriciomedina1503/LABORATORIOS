package Clases;

import java.util.Date;

public class Campus {
    private String Direccion;
    private Date FechaInicio;
    private int Id;
    private String Nombre;

    public Campus(){}
    public Campus(int Id, String Nombre, String Direccion, Date FechaInicio){
    this.Id = Id;
    this.Nombre = Nombre;
    this.Direccion = Direccion;
    this.FechaInicio = FechaInicio;
    }//Fin del constructor: Campus(int Id, String Nombre, String Direccion, Date FechaInicio).

    public String getDireccion(){return this.Direccion;}//Fin del método: getDireccion.
    public Date getFechaInicio(){return this.FechaInicio;}//Fin del método: getFechaInicio.
    public int getId(){return this.Id;}//Fin del método: getId.
    public String getNombre(){return this.Nombre;}//Fin del método: getNombre.

    public void setDireccion(String Direccion){this.Direccion = Direccion;}//Fin del método: setDireccion.
    public void setFechaInicio(Date FechaInicio){this.FechaInicio = FechaInicio;}//Fin del método: setFechaInicio.
    public void setId(int Id){this.Id = Id;}//Fin del método: setId.
    public void setNombre(String Nombre){this.Nombre = Nombre;}//Fin del método: setNombre.

}//Fin de la clase: Campus.
