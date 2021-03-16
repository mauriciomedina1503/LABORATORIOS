package Listas;

import Clases.Alumno;
import Clases.Periodo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ListaPeriodos {
    private ArrayList<Periodo> ListaPeriodos;
    public ListaPeriodos(){
        this.ListaPeriodos = new ArrayList<>();
    }//Fin del constructor.
    public void AddPeriodo(Periodo Periodo){this.ListaPeriodos.add(Periodo);}//Fin del método: ListaPeriodos.
    public void ImprimirLista(){
        for (int i = 0; i < this.ListaPeriodos.size(); i++) {
            String Alumno = "***********************************************"+
                    "\nId: "+this.ListaPeriodos.get(i).getId()+
                    "\nDescripción: "+this.ListaPeriodos.get(i).getDescripcion()+
                    "\nFecha Inicio: "+(new SimpleDateFormat("yyyy-MM-dd").format(this.ListaPeriodos.get(i).getFechaInicio()))+
                    "\nFecha Fin: "+(new SimpleDateFormat("yyyy-MM-dd").format(this.ListaPeriodos.get(i).getFechaFin()))+"\n";
            System.out.println(Alumno);
        }
    }//Fin del método: ImprimirLista.
    public String TamañoLista(){
        if(this.ListaPeriodos.size() > 0){return " ["+this.ListaPeriodos.size()+"].";}
        return ".";
    }//Fin del método: TamañoLista.
}//Fin de la clase: ListaPeriodos.
