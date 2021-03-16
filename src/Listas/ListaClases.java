package Listas;


import Clases.Clase;

import java.util.ArrayList;

public class ListaClases {
    private ArrayList<Clase> ListaClases;
    public ListaClases(){
        this.ListaClases = new ArrayList<>();
    }//Fin del constructor.
    public void AddClase(Clase Clase){this.ListaClases.add(Clase);}//Fin del método: ListaClases.
    public void ImprimirLista(){
        for (int i = 0; i < this.ListaClases.size(); i++) {
            String Clase = "***********************************************"+
                    "\nId: "+this.ListaClases.get(i).getId()+
                    "\nNombre: "+this.ListaClases.get(i).getNombre()+
                    "\nUnidades Valorativas: "+this.ListaClases.get(i).getUnidadesValorativas()+
                    "\nNA1: "+this.ListaClases.get(i).getNA1()+
                    "\nNA2: "+this.ListaClases.get(i).getNA2()+
                    "\nNA3: "+this.ListaClases.get(i).getNA3()+
                    "\nNE1: "+this.ListaClases.get(i).getNE1()+
                    "\nNE2: "+this.ListaClases.get(i).getNE2()+
                    "\nNE3: "+this.ListaClases.get(i).getNE3()+
                    "\nNR: "+this.ListaClases.get(i).getNR();
            System.out.println(Clase);
        }
    }//Fin del método: ImprimirLista.
    public ArrayList<Clase> getListaClases(){return this.ListaClases;}//Fin del método: getListaClases.
    public String TamañoLista(){
        if(this.ListaClases.size() > 0){return " ["+this.ListaClases.size()+"].";}
        return ".";
    }//Fin del método: TamañoLista.
}//Fin de la clase: ListaClases.
