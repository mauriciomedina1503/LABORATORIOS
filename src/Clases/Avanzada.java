package Clases;

public class Avanzada extends Clase{
    private int ValorVinculacion;
    public Avanzada(){}
    public Avanzada(int Id, String Nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, int ValorVinculacion) {
        super(Id, Nombre, UnidadesValorativas, NA1, NA2, NA3, NE1, NE2, NE3, NR);
        this.ValorVinculacion = ValorVinculacion;
    }//Fin del constructor: Avanzada(int Id, String Nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, int ValorVinculacion).

    @Override
    public double CalcularNotaFinal() {
        return super.CalcularNotaFinal();
    }//Fin del método: CalcularNotaFinal.

    public int getValorVinculacion() {return this.ValorVinculacion;}//Fin del método: getValorVinculacion.
    public void setValorVinculacion(int ValorVinculacion) {this.ValorVinculacion = ValorVinculacion;}//Fin del método: setValorVinculacion.

    @Override
    public String toString() {
        return "Avanzada{" +
                "ValorVinculacion=" + ValorVinculacion +
                '}';
    }//Fin del método: toString.
}//Fin de la clase: Avanzada.
