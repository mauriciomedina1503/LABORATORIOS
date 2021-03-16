package Listas;

import Clases.Alumno;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ListaAlumnos {
    private ArrayList<Alumno> ListaAlumnos;
    public ListaAlumnos(){
        this.ListaAlumnos = new ArrayList<>();
    }//Fin del constructor.
    public void AddAlumno(Alumno Alumno){this.ListaAlumnos.add(Alumno);}//Fin del método: ListaALumnos.
    public void ImprimirLista(){
        for (int i = 0; i < this.ListaAlumnos.size(); i++) {
            String Alumno = "***********************************************"+
                            "\nCuenta: "+this.ListaAlumnos.get(i).getCuenta()+
                            "\nId: "+this.ListaAlumnos.get(i).getId()+
                            "\nNombre: "+this.ListaAlumnos.get(i).getNombre()+
                            "\nFecha Nacimiento: "+(new SimpleDateFormat("yyyy-MM-dd").format(this.ListaAlumnos.get(i).getFechaNacimiento()))+"\n";
            System.out.println(Alumno);
        }
    }//Fin del método: ImprimirLista.
    public String TamañoLista(){
        if(this.ListaAlumnos.size() > 0){return " ["+this.ListaAlumnos.size()+"].";}
        return ".";
    }//Fin del método: TamañoLista.
}//Fin de la clase: ListaAlumnos.
