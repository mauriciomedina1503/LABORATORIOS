package Listas;

import Clases.Alumno;
import Clases.Carrera;
import Clases.Clase;
import Clases.Historial;
import java.util.ArrayList;

public class ListaHistoriales {
    private ArrayList<Historial> ListaHistoriales;
    public ListaHistoriales(){
        this.ListaHistoriales = new ArrayList<>();
    }//Fin del constructor.
    public void AddHistorial(Historial Historial){this.ListaHistoriales.add(Historial);}//Fin del método: ListaHistoriales.
    public boolean listaVacia(){return this.ListaHistoriales.isEmpty();}//Fin del método: listaVacia.
    public void mostrarAlumnos(){
        String listaAlumnos = "";
        for(int a = 0; a < this.ListaHistoriales.size(); a++){
            listaAlumnos+="\nId: "+ListaHistoriales.get(a).getAlumno().getId()+
            "\nNombre: "+ListaHistoriales.get(a).getAlumno().getNombre()+"\n";
        }
        System.out.println(listaAlumnos);
    }//Fin del método: mostrarAlumnos.
    public void buscarAlumno(int Id){
        String mensaje = "El usuario no existe!";
        for(int a = 0; a < this.ListaHistoriales.size(); a++){
            if(this.ListaHistoriales.get(a).getAlumno().getId() == Id){
                mensaje = "";
                    String clases = "";
                for (Clase clase: this.ListaHistoriales.get(a).getClases()) {
                        clases+=clase.getNombre()+"\n";
                    }
                    Alumno _tempAlumno = this.ListaHistoriales.get(a).getAlumno();
                    Carrera _carrera = this.ListaHistoriales.get(a).getCarrera();
                    System.out.println("\n======================================="+
                            "\nId: "+_tempAlumno.getId()+
                            "\nNombre: "+_tempAlumno.getNombre()+
                            "\nCarrera: "+_carrera.getNombre()+
                            "\n---------------Clases---------------"+
                            "\n"+clases+"\n=======================================\n");
            }
        }//Fin del for.
        if(!mensaje.equals("")){System.err.println("El usuario no existe!");}
    }//Fin del método: buscarAlumno.
    public String TamañoLista(){
        if(this.ListaHistoriales.size() > 0){return " ["+this.ListaHistoriales.size()+"].";}
        return ".";
    }//Fin del método: TamañoLista.
}//Fin de la clase: ListaHistoriales.
