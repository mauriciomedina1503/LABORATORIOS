package Clases;

public class Carrera {
    private int Id;
    private String Nombre;
    public Carrera(){}
    public Carrera(int Id, String Nombre){
        this.Id = Id;
        this.Nombre = Nombre;
    }//Fin del constructor:

    public int getId(){return this.Id;}//Fin del método: getId.
    public String getNombre(){return this.Nombre;}//Fin del método: getNombre.

    public void setId(int Id){this.Id = Id;}//Fin del método: setId.
    public void setNombre(String Nombre){this.Nombre = Nombre;}//Fin del método: setNombre.

}//Fin de la clae: carrera.
