package Clases;

import Interfaces.IHistorial;

import java.util.ArrayList;

public class Historial implements IHistorial {
    private Alumno Alumno;
    private Campus Campus;
    private Carrera Carrera;
    private ArrayList<Clase> Clases;
    private Periodo Periodo;

    public Historial(){}
    public Historial(Alumno Alumno, Campus Campus, Carrera Carrera, Periodo Periodo, ArrayList<Clase> Clases) {
        this.Alumno = Alumno;
        this.Campus = Campus;
        this.Carrera = Carrera;
        this.Clases = Clases;
        this.Periodo = Periodo;
    }//Fin del constructor: (Alumno Alumno, Campus Campus, Carrera Carrera, Periodo Periodo, ArrayList<Clase> Clases)

    @Override
    public double CalcularPromedio() {
        return 0;
    }//Fin del método: Calcular Promedio.

    public Alumno getAlumno() {return this.Alumno;}//Fin del método: getAlumno.
    public Campus getCampus() {return this.Campus;}//Fin del método: getCampus.
    public Carrera getCarrera() {return this.Carrera;}//Fin del método: getCarrera.
    public ArrayList<Clase> getClases() {return this.Clases;}//Fin del método: getClases.
    public Periodo getPeriodo() {return this.Periodo;}//Fin del método: getPeriodo.

    public void setAlumno(Alumno Alumno) {this.Alumno = Alumno;}//Fin del método: setAlumno.
    public void setCampus(Campus Campus) {this.Campus = Campus;}//Fin del método: setCampus.
    public void setCarrera(Carrera Carrera) {this.Carrera = Carrera;}//Fin del método: setCarrera.
    public void setClases(ArrayList<Clase> Clases) {this.Clases = Clases;}//Fin del método: setClases.
    public void setPeriodo(Periodo Periodo) {this.Periodo = Periodo;}//Fin del método: setPeriodo.

    @Override
    public String toString() {
        return "Historial{" +
                "Alumno=" + Alumno +
                ", Campus=" + Campus +
                ", Carrera=" + Carrera +
                ", Clases=" + Clases +
                ", Periodo=" + Periodo +
                '}';
    }//Fin del método: toString.
}//Fin de la clase: Historial.
