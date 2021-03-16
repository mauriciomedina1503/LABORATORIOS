package Clases;

public class Ingenieria extends General{
    private int NotaProyecto;
    public Ingenieria(){}
    public Ingenieria(boolean TodasCarreras, int Id, String nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, int NotaProyecto) {
        super(TodasCarreras, Id, nombre, UnidadesValorativas, NA1, NA2, NA3, NE1, NE2, NE3, NR);
        this.NotaProyecto = NotaProyecto;
    }//Fin del constructor: Ingenieria(boolean TodasCarreras, int Id, String nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, int notaProyecto)

    @Override
    public double CalcularNotaFinal() {
        return super.CalcularNotaFinal();
    }//Fin del método: CalcularNotaFinal.

    public int getNotaProyecto() {return this.NotaProyecto;}//Fin del método: getNotaProyecto.
    public void setNotaProyecto(int NotaProyecto) {this.NotaProyecto = NotaProyecto;}//Fin del método: setNotaProyecto.

    @Override
    public String toString() {
        return "Ingenieria{" +
                "NotaProyecto=" + NotaProyecto +
                '}';
    }//Fin del método: toString.

}//Fin de la clase: Ingenieria.
