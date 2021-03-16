package hn.edu.ujcv.pii.p1;

import Clases.*;
import Listas.ListaAlumnos;
import Listas.ListaCampus;
import Listas.ListaCarreras;
import Listas.ListaCatedraticos;
import Listas.ListaClases;
import Listas.ListaHistoriales;
import Listas.ListaPeriodos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    private static void agregarAlumno(ListaAlumnos _listaAlumnos,ListaCampus _listaCampus,ListaCarreras _listaCarreras,ListaCatedraticos _listaCatedraticos,ListaClases _listaClases,ListaPeriodos _listaPeriodos, ListaHistoriales _listaHistoriales, Scanner entrada){
        System.out.println("\n\n>> Alumno <<\n\n");
        //Alumno(long Cuenta, long Id, String Nombre, Date FechaNacimiento)
        System.out.println("\nIngrese número de cuenta: ");
        long Cuenta = entrada.nextLong();
        System.out.println("\nIngrese Id: ");
        long Id = entrada.nextLong();
        System.out.println("\nIngrese nombre: ");
        String Nombre = entrada.next();

        System.out.println("\nIngrese Fecha de Nacimiento (Año-Mes-Día): ");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento;
        Alumno _tempAlumno = null;
        try {
            fechaNacimiento = formatoFecha.parse(entrada.next());
            _tempAlumno = new Alumno(Cuenta, Id, Nombre, fechaNacimiento);
            _listaAlumnos.AddAlumno(_tempAlumno);
            _listaAlumnos.ImprimirLista();
            agregarCatedratico(_listaCatedraticos,entrada);//--?
            //Se agregan las referencias al objeto de la clase: ListaHistoriales.
            //Historial(Alumno Alumno, Campus Campus, Carrera Carrera, Periodo Periodo, ArrayList<Clase> Clases)
            _listaHistoriales.AddHistorial(new Historial(_tempAlumno, agregarCampus(_listaCampus,entrada), agregarCarrera(_listaCarreras,entrada), agregarPeriodo(_listaPeriodos,entrada), agregarClases(_listaClases,entrada)));
        } catch (ParseException | InputMismatchException e) {
            System.err.println("Ingrese el formato valido!");
            entrada = new Scanner(System.in);
        }
    }//Fin del método: Agregar Alumno.
    //****************************************************
    private static Campus agregarCampus(ListaCampus _listaCampus, Scanner entrada){
        Campus _tempCampus = null;
        while(true) {
            try {
                System.out.println("\n>> Campus <<\n");
                //Campus(int Id, String Nombre, String Direccion, Date FechaInicio)
                System.out.println("\nIngrese Id: ");
                int Id = entrada.nextInt();
                System.out.println("\nIngrese nombre: ");
                String Nombre = entrada.next();
                System.out.println("\nIngrese Dirección: ");
                String Direccion = entrada.next();
                System.out.println("\nIngrese Fecha de Inicio (Año-Mes-Día): ");
                SimpleDateFormat formatoFechaInicio = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaInicio;
                fechaInicio = formatoFechaInicio.parse(entrada.next());
                _tempCampus = new Campus(Id, Nombre, Direccion, fechaInicio);
                _listaCampus.AddCampus(_tempCampus);
                _listaCampus.ImprimirLista();
                return _tempCampus;
            } catch (ParseException | InputMismatchException e) {
                System.err.println("Ingrese el formato valido!");
                entrada = new Scanner(System.in);
            }
        }//Fin del while.
    }//Fin del método: Agregar Campus.
    //****************************************************
    private static Carrera agregarCarrera(ListaCarreras _listaCarreras,Scanner entrada){
        while(true){
            try {
                System.out.println("\n>> Carrera <<\n");
                //Carrera(int Id, String Nombre)
                System.out.println("\nIngrese Id: ");
                int Id = entrada.nextInt();
                System.out.println("\nIngrese nombre: ");
                String Nombre = entrada.next();
                Carrera _tempCarrera = new Carrera(Id, Nombre);
                _listaCarreras.AddCarrera(_tempCarrera);
                _listaCarreras.ImprimirLista();
                return _tempCarrera;
            } catch (InputMismatchException e) {
                System.err.println("Ingrese el formato correcto!");
                entrada = new Scanner(System.in);
            }
        }//Fin del while.
    }//Fin del método: Agregar Carrera.
    //****************************************************
    private static Catedratico agregarCatedratico(ListaCatedraticos _listaCatedraticos,Scanner entrada){
        Catedratico _tempCatedratico = null;
        while(true) {
            try {
                System.out.println("\n>> Catedrático <<\n");
                //Catedratico(int Codigo, long Id, String Nombre, Date FechaNacimiento)
                System.out.println("\nIngrese Código: ");
                int Codigo = entrada.nextInt();
                System.out.println("\nIngrese Id: ");
                long Id = entrada.nextLong();
                System.out.println("\nIngrese nombre: ");
                String Nombre = entrada.next();

                System.out.println("\nIngrese Fecha de Nacimiento (Año-Mes-Día): ");
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaNacimiento;
                fechaNacimiento = formatoFecha.parse(entrada.next());
                _tempCatedratico = new Catedratico(Codigo, Id, Nombre, fechaNacimiento);
                _listaCatedraticos.AddCatedratico(_tempCatedratico);
                _listaCatedraticos.ImprimirLista();
                return _tempCatedratico;
            } catch (ParseException | InputMismatchException e) {
                System.err.println("Ingrese el formato valido!");
                entrada = new Scanner(System.in);
            }
        }//Fin del while.
    }//Fin del método: Agregar Catedrático.
    //****************************************************
    private static Periodo agregarPeriodo(ListaPeriodos _listaPeriodos,Scanner entrada){
        Periodo _temporalPeriodo = null;
        while(true) {
            try {
                System.out.println("\n>> Periodo <<\n");
                //Periodo(int Id, String Descripcion, Date FechaInicio, Date FechaFin)
                System.out.println("\nIngrese Id: ");
                int Id = entrada.nextInt();
                System.out.println("\nIngrese Descripción: ");
                String Descripcion = entrada.next();

                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaInicio;
                Date fechaFin;

                System.out.println("\nIngrese Fecha Inicio (Año-Mes-Día): ");
                fechaInicio = formatoFecha.parse(entrada.next());
                System.out.println("\nIngrese Fecha Fin (Año-Mes-Día): ");
                fechaFin = formatoFecha.parse(entrada.next());
                _temporalPeriodo = new Periodo(Id, Descripcion, fechaInicio, fechaFin);
                _listaPeriodos.AddPeriodo(_temporalPeriodo);
                _listaPeriodos.ImprimirLista();
                return _temporalPeriodo;
            } catch (ParseException | InputMismatchException e) {
                System.err.println("Ingrese el formato valido!");
                entrada = new Scanner(System.in);
            }
        }//Fin del while.
    }//Fin del método: Agregar Periodo.
    //****************************************************
    private static ArrayList<Clase> agregarClases(ListaClases _listaClases,Scanner entrada){
        //Clase(int Id, String Nombre, int UnidadesValorativas, int NA1, int NA2, int NA3, int NE1, int NE2, int NE3, int NR)
        String opcion = "si";
        do {
            try {
                System.out.println("\n>> Clases <<\n");
                System.out.println("\nIngrese Id: ");
                int Id = entrada.nextInt();
                System.out.println("\nIngrese Nombre: ");
                String Nombre = entrada.next();
                System.out.println("\nIngrese Unidades Valorativas: ");
                int UnidadesValorativas = entrada.nextInt();
                System.out.println("\nIngrese NA1: ");
                int NA1 = entrada.nextInt();
                System.out.println("\nIngrese NA2: ");
                int NA2 = entrada.nextInt();
                System.out.println("\nIngrese NA3: ");
                int NA3 = entrada.nextInt();
                System.out.println("\nIngrese NE1: ");
                int NE1 = entrada.nextInt();
                System.out.println("\nIngrese NE2: ");
                int NE2 = entrada.nextInt();
                System.out.println("\nIngrese NE3: ");
                int NE3 = entrada.nextInt();
                System.out.println("\nIngrese NR: ");
                int NR = entrada.nextInt();

                _listaClases.AddClase(new Clase(Id, Nombre, UnidadesValorativas, NA1, NA2, NA3, NE1, NE2, NE3, NR));

                System.out.println("¿Desea ingresar otra clase? Escriba: 'si': ");
                opcion = entrada.next();
                if (!opcion.equals("si")) {
                    return _listaClases.getListaClases();
                }
            }catch (InputMismatchException e){System.err.println("Ingrese el formato valido!");
            entrada = new Scanner(System.in);
            }
        }while(opcion.equals("si"));
        return null;
    }//Fin del método: Agregar Clases.
    //****************************************************

    public static void main(String[] args) {

        ListaAlumnos _listaAlumnos = new ListaAlumnos();
        ListaCampus _listaCampus = new ListaCampus();
        ListaCarreras _listaCarreras = new ListaCarreras();
        ListaCatedraticos _listaCatedraticos = new ListaCatedraticos();
        ListaClases _listaClases = new ListaClases();
        ListaPeriodos _listaPeriodos = new ListaPeriodos();
        ListaHistoriales _listaHistoriales = new ListaHistoriales();

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do{
            try{
                System.out.println("\n**************Menú**************\n");
                System.out.println("1 - Agregar Alumno"+_listaAlumnos.TamañoLista());
                System.out.println("2 - Historial.");
                System.out.println("3 - Salir.\n\n");
                System.out.println(">>> Ingrese opción: ");
                opcion = entrada.nextInt();

                switch (opcion){
                    case 1:
                        agregarAlumno(_listaAlumnos,_listaCampus,_listaCarreras,_listaCatedraticos,_listaClases,_listaPeriodos, _listaHistoriales, entrada);
                        break;
                    case 2:
                        if(!_listaHistoriales.listaVacia()){
                            _listaHistoriales.mostrarAlumnos();
                            System.out.println("Ingrese Id de alumno: ");
                            _listaHistoriales.buscarAlumno(entrada.nextInt());
                        }else{System.err.println("No se han ingresado alumnos!");}
                        break;
                    default: System.err.println("Ingrese un número de la lista!");
                }

            }catch(InputMismatchException e){
                entrada = new Scanner(System.in);
                System.err.println("Debe ingresar Números!");}
        }while(opcion != 3);

    }//Fin del método: main().
}//Fin de la clase Main.
