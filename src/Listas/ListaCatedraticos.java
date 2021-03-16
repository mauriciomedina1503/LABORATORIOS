package Listas;

import Clases.Alumno;
import Clases.Catedratico;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ListaCatedraticos {
    private ArrayList<Catedratico> ListaCatedraticos;
    public ListaCatedraticos(){
        this.ListaCatedraticos = new ArrayList<>();
    }//Fin del constructor.
    public void AddCatedratico(Catedratico Catedratico){this.ListaCatedraticos.add(Catedratico);}//Fin del método: ListaCatedraticos.
    public void ImprimirLista(){
        for (int i = 0; i < this.ListaCatedraticos.size(); i++) {
            String Alumno = "***********************************************"+
                    "\nCódigo: "+this.ListaCatedraticos.get(i).getCodigo()+
                    "\nId: "+this.ListaCatedraticos.get(i).getId()+
                    "\nNombre: "+this.ListaCatedraticos.get(i).getNombre()+
                    "\nFecha Nacimiento: "+(new SimpleDateFormat("yyyy-MM-dd").format(this.ListaCatedraticos.get(i).getFechaNacimiento()))+"\n";
            System.out.println(Alumno);
        }
    }//Fin del método: ImprimirLista.
    public String TamañoLista(){
        if(this.ListaCatedraticos.size() > 0){return " ["+this.ListaCatedraticos.size()+"].";}
        return ".";
    }//Fin del método: TamañoLista.
}//Fin de la clase: ListaCatedraticos.
