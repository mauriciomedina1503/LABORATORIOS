package Clases;

public class General extends Clase{
    private boolean TodasCarreras;
    public General(){}
    public General(boolean TodasCarreras, int Id, String nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR){
        super(Id, nombre, UnidadesValorativas, NA1, NA2, NA3, NE1, NE2, NE3, NR);
        this.TodasCarreras = TodasCarreras;
    }//Fin del constructor: General(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR).

    public boolean isTodasCarreras(){return this.TodasCarreras;}//Fin del método: isTodasCarreras.
    public void setTodasCarreras(boolean TodasCarreras){this.TodasCarreras = TodasCarreras;}//Fin del método: setTodasCarreras.

    @Override
    public String toString() {
        return "General{" +
                "TodasCarreras=" + TodasCarreras +
                '}';
    }//Fin del método: toString.
}//Fin de la clase: General.