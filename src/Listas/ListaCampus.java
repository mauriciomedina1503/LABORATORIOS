package Listas;

import Clases.Campus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ListaCampus {
    private ArrayList<Campus> ListaCampus;
    public ListaCampus(){
        this.ListaCampus = new ArrayList<>();
    }//Fin del constructor.
    public void AddCampus(Campus Campus){this.ListaCampus.add(Campus);}//Fin del método: ListaCampus.
    public void ImprimirLista(){
        for (int i = 0; i < this.ListaCampus.size(); i++) {
            String Campus = "***********************************************"+
                    "\nCuenta: "+this.ListaCampus.get(i).getId()+
                    "\nId: "+this.ListaCampus.get(i).getNombre()+
                    "\nNombre: "+this.ListaCampus.get(i).getDireccion()+
                    "\nFecha Inicio: "+(new SimpleDateFormat("yyyy-MM-dd").format(this.ListaCampus.get(i).getFechaInicio()))+"\n";
            System.out.println(Campus);
        }
    }//Fin del método: ImprimirLista.
    public String TamañoLista(){
        if(this.ListaCampus.size() > 0){return " ["+this.ListaCampus.size()+"].";}
        return ".";
    }//Fin del método: TamañoLista.
}//Fin de la clase: ListaCampus.
