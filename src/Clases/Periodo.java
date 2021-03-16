package Clases;

import java.util.Date;

public class Periodo {
    private String Descripcion;
    private Date FechaFin;
    private Date FechaInicio;
    private int Id;

    public Periodo(){}
    public Periodo(int Id, String Descripcion, Date FechaInicio, Date FechaFin){
        this.Id = Id;
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }//Fin del constructor: Periodo(int Id, String Descripcion, Date FechaInicio, Date FechaFin).

    public void setDescripcion(String descripcion) {this.Descripcion = descripcion;}//Fin de: setDescripcion.
    public void setFechaFin(Date fechaFin) {this.FechaFin = fechaFin;}//Fin de: setFechaFin.
    public void setFechaInicio(Date fechaInicio) {this.FechaInicio = fechaInicio;}//Fin de: setFechaIniio.
    public void setId(int id) {this.Id = id;}//Fin de: setId.

    public String getDescripcion() {return this.Descripcion;}//Fin de: getDescripcion.
    public Date getFechaFin() {return this.FechaFin;}//Fin de: getFechaFin.
    public Date getFechaInicio() {return this.FechaInicio;}//Fin de: getFechaInicio.
    public int getId() {return this.Id;}//Fin de: getId.
}//Fin de la clase periodo.
