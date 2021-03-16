package Clases;

public class Idioma extends General{
    private int NotaLaboratorio;
    public Idioma(){}
    public Idioma(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, int NotaLaboratorio) {
        super(TodasCarreras, Id, Nombre, UnidadesValorativas, NA1, NA2, NA3, NE1, NE2, NE3, NR);
        this.NotaLaboratorio = NotaLaboratorio;
    }//Fin del constructor: Idioma(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR, int NotaLaboratorio.

    @Override
    public double CalcularNotaFinal() {
        return super.CalcularNotaFinal();
    }//Fin del método: CalcularNotaFinal.

    public int getNotaLaboratorio() {return this.NotaLaboratorio;}//Fin del método: getNotaLaboratorio.
    public void setNotaLaboratorio(int NotaLaboratorio) {this.NotaLaboratorio = NotaLaboratorio;}//Fin del método: setNotaLaboratorio.

    @Override
    public String toString() {
        return "Idioma{" +
                "NotaLaboratorio=" + NotaLaboratorio +
                '}';
    }//Fin del método: toString.
}//Fin de la clase: Idioma.
