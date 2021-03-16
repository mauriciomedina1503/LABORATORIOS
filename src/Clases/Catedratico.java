package Clases;

import java.util.Date;

public class Catedratico extends Persona{
    private int Codigo;
    public Catedratico(){}
    public Catedratico(int Codigo, long Id, String Nombre, Date FechaNacimiento){
        super(Id, Nombre, FechaNacimiento);
        this.Codigo = Codigo;
    }//Fin del constructor: Catedratico(int Codigo, long Id, String Nombre, Date FechaNacimiento).

    public int getCodigo(){return this.Codigo;}//Fin del método: getCódigo.
    public void setCodigo(int Codigo){this.Codigo = Codigo;}//Fin del método: setCodigo.

}//Fin de la clase: Catedratico.
