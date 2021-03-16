package Clases;

import Interfaces.IClase;

public class Clase implements IClase {
    private int Id;
    private int NA1;
    private int NA2;
    private int NA3;
    private int NE1;
    private int NE2;
    private int NE3;
    private int NR;
    private String Nombre;
    private int UnidadesValorativas;
    public Clase(){}
    public Clase(int Id, String Nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.UnidadesValorativas = UnidadesValorativas;
        this.NA1 = NA1;
        this.NA2 = NA2;
        this.NA3 = NA3;
        this.NE1 = NE1;
        this.NE2 = NE2;
        this.NE3 = NE3;
        this.NR = NR;
    }//Fin del constructor: Clase(int Id, String Nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR).

    public int getId() {return this.Id;}//Fin del método: getId.
    public int getNA1() {return this.NA1;}//Fin del método: getNA1.
    public int getNA2() {return this.NA2;}//Fin del método: getNA2.
    public int getNA3() {return this.NA3;}//Fin del método: getNA3.
    public int getNE1() {return this.NE1;}//Fin del método: getNE1.
    public int getNE2() {return this.NE2;}//Fin del método: getNE2.
    public int getNE3() {return this.NE3;}//Fin del método: getNE3.
    public int getNR() {return this.NR;}//Fin del método: geNR.
    public String getNombre() {return this.Nombre;}////Fin del método: getNombre.
    public int getUnidadesValorativas() {return this.UnidadesValorativas;}//Fin del método: getUnidadesValorativas.

    public void setId(int Id) {this.Id = Id;}//Fin del método: setId.
    public void setNA1(int NA1) {this.NA1 = NA1;}//Fin del método: setNA1.
    public void setNA2(int NA2) {this.NA2 = NA2;}//Fin del método: setNA2.
    public void setNA3(int NA3) { this.NA3 = NA3;}//Fin del método: setNA3.
    public void setNE1(int NE1) {this.NE1 = NE1;}//Fin del método: setNE1.
    public void setNE2(int NE2) {this.NE2 = NE2;}//Fin del método: setNE2.
    public void setNE3(int NE3){this.NE3 = NE3;}//Fin del método: setNE3.
    public void setNR(int NR) {this.NR = NR;}//Fin del método: setNR.
    public void setNombre(String Nombre) {this.Nombre = Nombre;}//Fin del método: setNombre.
    public void setUnidadesValorativas(int UnidadesValorativas) {this.UnidadesValorativas = UnidadesValorativas;}//Fin del método: setUnidadesValorativas.

    @Override
    public String toString() {
        return "Clase{" +
                "Id=" + Id +
                ", NA1=" + NA1 +
                ", NA2=" + NA2 +
                ", NA3=" + NA3 +
                ", NE1=" + NE1 +
                ", NE2=" + NE2 +
                ", NE3=" + NE3 +
                ", NR=" + NR +
                ", Nombre='" + Nombre + '\'' +
                ", UnidadesValorativas=" + UnidadesValorativas +
                '}';
    }//Fin del método: toString.

    @Override
    public double CalcularNotaFinal() {  //*****************************************FALTA!
        return 0;
    }//Fin del método: CalcularNotaFinal.

}//Fin de la clase: Clase.
