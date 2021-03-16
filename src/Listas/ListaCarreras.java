package Listas;

import Clases.Carrera;
import java.util.ArrayList;

public class ListaCarreras {
    private ArrayList<Carrera> ListaCarreras;
    public ListaCarreras(){
        this.ListaCarreras = new ArrayList<>();
    }//Fin del constructor.
    public void AddCarrera(Carrera Carrera){this.ListaCarreras.add(Carrera);}//Fin del método: ListaCarreras.
    public void ImprimirLista(){
        for (int i = 0; i < this.ListaCarreras.size(); i++) {
            String Carrera = "***********************************************"+
                    "\nId: "+this.ListaCarreras.get(i).getId()+
                    "\nNombre: "+this.ListaCarreras.get(i).getNombre()+"\n";
            System.out.println(Carrera);
        }
    }//Fin del método: ImprimirLista.
    public String TamañoLista(){
        if(this.ListaCarreras.size() > 0){return " ["+this.ListaCarreras.size()+"].";}
        return ".";
    }//Fin del método: TamañoLista.
}//Fin de la clase: ListaCarrera.
