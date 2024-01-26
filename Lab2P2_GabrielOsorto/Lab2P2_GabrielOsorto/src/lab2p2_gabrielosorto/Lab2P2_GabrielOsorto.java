package lab2p2_gabrielosorto;

import java.util.*;

public class Lab2P2_GabrielOsorto {

    static ArrayList<Usuario> usuarios = new ArrayList();
    static ArrayList<Libros> libros = new ArrayList();
    static ArrayList<ArtiCULOS> articulos = new ArrayList();
    static ArrayList<CursosenLinea> cursos = new ArrayList();
    static ArrayList<ConferenciasVirtuales> conferencias = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static Scanner lt = new Scanner(System.in);

    public static void main(String[] args) {
        //crear usuarios predeterminados para ingresar 
        String Username = "Carlos";
        String Contra = "Queonda";
        String TipoUsuario = "estudiante";
        Usuario user1 = new Usuario(Username, Contra, TipoUsuario);

        usuarios.add(user1);
        Username = "Luis";
        Contra = "lamamadelamama";
        TipoUsuario = "profesor";
        Usuario user2 = new Usuario(Username, Contra, TipoUsuario);
        usuarios.add(user2);

        Username = "Pedro";
        Contra = "holaPedro";
        TipoUsuario = "bibliotecario";
        Usuario user3 = new Usuario(Username, Contra, TipoUsuario);
        usuarios.add(user3);
        //fin creacion usuarios

        System.out.println("Ingresar Cuenta");
        System.out.print("Ingrese su nombre de Usuario:");
        String user = lt.nextLine();
        for (int i = 0; i < usuarios.size(); i++) {
            if (user.equalsIgnoreCase(usuarios.get(i).getUsername())) {
                System.out.print("Ingrese su contraseña:");
                String contraseña = lt.nextLine();
                if (contraseña.equals(usuarios.get(i).getContra())) {
                    String TypeUser = usuarios.get(i).getTipoUsuario();
                    switch (TypeUser) {
                        case "estudiante":
                            boolean seguirEstudiante = true;
                            while (seguirEstudiante == true) {
                                System.out.println("Menu Estudiantes:");
                                System.out.println("1. Listar recursos");
                                System.out.println("2. Salir");
                                System.out.print("Que desea hacer:");
                                int opEstudiante = sc.nextInt();
                                System.out.println("");
                                switch (opEstudiante) {
                                    case 1:
                                        System.out.println("Lista de recursos");
                                        ListarRecursos(libros, articulos, cursos, conferencias);
                                        break;
                                    case 2:
                                        System.out.println("Saliendo....");
                                        seguirEstudiante = false;
                                        break;
                                    default:
                                        System.out.println("OPCION INEXISTENTE");
                                        break;
                                }//fin switch case menu estudiante
                            }//fin while menu estudiante
                            break;
                        //FIN CASE ESTUDIANTE

                        case "profesor":
                            boolean seguirProfe = true;
                            while (seguirProfe == true) {
                                System.out.println("Menu Profesor");
                                System.out.println("1. Listar recursos");
                                System.out.println("2. Agregar Recursos");
                                System.out.println("3. Salir");
                                System.out.print("Que desea hacer?:");
                                int opMaestro = sc.nextInt();
                                System.out.println("");
                                switch (opMaestro) {
                                    case 1:
                                        System.out.println("Lista de recursos");
                                        ListarRecursos(libros, articulos, cursos, conferencias);
                                        System.out.println("");
                                        break;
                                    case 2:
                                        System.out.println("Agregar recursos");
                                        AgregarRecursos(libros, articulos, cursos, conferencias);
                                        System.out.println("");
                                        break;
                                    case 3:
                                        System.out.println("Saliendo.....");
                                        seguirProfe = false;
                                        System.out.println("");
                                        break;
                                    default:
                                        System.out.println("OPCION NO DISPONIBLE");
                                        System.out.println("");
                                        break;

                                }
                            }
                            break;
                        //FIN CASE PROFESOR
                        case "bibliotecario":
                            boolean seguirBiblio = true;
                            while (seguirBiblio == true) {
                                System.out.println("Menu Profesor");
                                System.out.println("1. Listar recursos");
                                System.out.println("2. Agregar Recursos");
                                System.out.println("3. Modificar Recursos");
                                System.out.println("4. Eliminar Recurso");
                                System.out.println("5. Salir");
                                System.out.print("Que desea hacer?:");
                                int opMaestro = sc.nextInt();
                                System.out.println("");
                                switch (opMaestro) {
                                    case 1:
                                        System.out.println("Lista de recursos");
                                        ListarRecursos(libros, articulos, cursos, conferencias);
                                        System.out.println("");
                                        break;
                                    case 2:
                                        AgregarRecursos(libros, articulos, cursos, conferencias);
                                        System.out.println("");
                                        break;
                                    case 3:
                                        System.out.println("Modificar Recursos");
                                        break;
                                    case 4:
                                        EliminarRecurso(libros, articulos, cursos, conferencias);
                                        System.out.println("");
                                        break;
                                    case 5:
                                        System.out.println("Saliendo.....");
                                        seguirBiblio = false;
                                        break;
                                    default:
                                        System.out.println("OPCION NO DISPONIBLE");
                                        break;

                                }
                            }
                            break;
                    }
                    //FIN CASE BIBLIOTECARIO
                } else {
                    System.out.println("Contraseña Incorrecta :(");
                }
            } else {
                System.out.println("Usuario Inexistente :(");
            }
        }
    }//fin del main

    public static void ListarRecursos(ArrayList<Libros> librosArray, ArrayList<ArtiCULOS> articulosArray, ArrayList<CursosenLinea> cursosArray, ArrayList<ConferenciasVirtuales> conferenciasArray) {
        for (int i = 0; i < librosArray.size(); i++) {
            Libros Books = librosArray.get(i);
            System.out.print(Books);
        }
        for (int i = 0; i < articulosArray.size(); i++) {
            ArtiCULOS arti = articulosArray.get(i);
            System.out.println(arti);
        }
        for (int i = 0; i < cursosArray.size(); i++) {
            CursosenLinea cursoslista = cursosArray.get(i);
            System.out.println(cursoslista);
        }
        for (int i = 0; i < conferenciasArray.size(); i++) {
            ConferenciasVirtuales confe = conferenciasArray.get(i);
            System.out.println(confe);
        }
    }//fin del metodo imprimir recursos

    public static void AgregarRecursos(ArrayList<Libros> librosArray, ArrayList<ArtiCULOS> articulosArray, ArrayList<CursosenLinea> cursosArray, ArrayList<ConferenciasVirtuales> conferenciasArray) {
        System.out.println("Agregar Recursos:");
        System.out.println("===Tipos de Recursos===");
        System.out.println("1.Libros");
        System.out.println("2.Articulos");
        System.out.println("3.Cursos");
        System.out.println("4. Conferencias");
        System.out.print("Que tipo de recurso desea agregar?");
        int tipoAgregar = sc.nextInt();
        switch (tipoAgregar) {
            case 1:
                boolean LibroDisponibleAgregado = true;
                System.out.print("Ingrese el nombre del Libro:");
                String TituloLibroAgredado = lt.nextLine();
                System.out.print("Ingrese el nombre del autor:");
                String AutorTituloAgregado = lt.nextLine();
                System.out.println("Ingrese el genero del libro:");
                String GeneroLibroAgregado = lt.nextLine();
                System.out.println("Ingrese el año de publicacion:");
                int AñoPublicacioLibroAgregado = sc.nextInt();
                System.out.println("El libro esta disponible?:");
                String LibroAgregadoDisponible = lt.nextLine();
                if (LibroAgregadoDisponible.equalsIgnoreCase("si")) {
                    LibroDisponibleAgregado = true;
                } else if (LibroAgregadoDisponible.equalsIgnoreCase("no")) {
                    LibroDisponibleAgregado = false;
                }
                Libros nuevoLibro = new Libros(TituloLibroAgredado, AutorTituloAgregado, GeneroLibroAgregado, AñoPublicacioLibroAgregado, LibroDisponibleAgregado);
                libros.add(nuevoLibro);
                System.out.println("");
                //fin case 1
                break;

            case 2:
                boolean ArticuloDisponibleAgregado = true;
                System.out.print("Ingrese el nombre del Libro:");
                String TituloArticuloAgredado = lt.nextLine();
                System.out.print("Ingrese el nombre del autor:");
                String AutorArticuloAgregado = lt.nextLine();
                System.out.println("Ingrese el genero del libro:");
                String TemaArticuloAgregado = lt.nextLine();
                System.out.println("Ingrese el año de publicacion:");
                int AñoPublicacioArticuloAgregado = sc.nextInt();
                System.out.println("El libro esta disponible(si/no)?:");
                String ArticuloAgregadoDisponible = lt.nextLine();
                if (ArticuloAgregadoDisponible.equalsIgnoreCase("si")) {
                    ArticuloDisponibleAgregado = true;
                } else if (ArticuloAgregadoDisponible.equalsIgnoreCase("no")) {
                    ArticuloDisponibleAgregado = false;
                }
                ArtiCULOS nuevoArticulo = new ArtiCULOS(TituloArticuloAgredado, AutorArticuloAgregado, TemaArticuloAgregado, AñoPublicacioArticuloAgregado, ArticuloDisponibleAgregado);
                articulos.add(nuevoArticulo);
                System.out.println("");
                //fin case 2
                break;
            case 3:
                System.out.print("Ingrese el titulo del curso:");
                String nombreCursoAgregado = lt.nextLine();
                System.out.print("Ingrese el nombre del Instructor:");
                String NombreInstruAgregado = lt.nextLine();
                System.out.print("Ingrese la cantidad de semanas que durará:");
                int DuracionSemanas = sc.nextInt();
                System.out.print("Ingrese el nombre de la plataforma donde se recibira el curso:");
                String NombrePlataforma = lt.nextLine();
                CursosenLinea nuevoCurso = new CursosenLinea(nombreCursoAgregado, NombreInstruAgregado, DuracionSemanas, NombrePlataforma);
                cursos.add(nuevoCurso);
                System.out.println("");
                //fin case 3
                break;

            case 4:
                System.out.print("Ingrese el nombre de la conferencia:");
                String TituloConferenciaAgregada = lt.nextLine();
                System.out.print("Ingrese el nombre del conferencista:");
                String NombreConferencista = lt.nextLine();
                System.out.println("Ingrese la fecha de la conferencia(dd/mm/yyyy):");
                String FechaConferenciaAgregada = lt.nextLine();
                System.out.print("Ingrese la duracion de la conferenia(ejemplo=2hrs/1hr):");
                String DuracionConferenciaAgregada = lt.nextLine();
                System.out.print("Ingrese el link de acceso:");
                String LinkAccesoConferencia = lt.nextLine();
                ConferenciasVirtuales conferenciasvr = new ConferenciasVirtuales(TituloConferenciaAgregada, NombreConferencista, FechaConferenciaAgregada, DuracionConferenciaAgregada, LinkAccesoConferencia);
                conferencias.add(conferenciasvr);
                System.out.println("");
                //fin case 4
                break;

            default:
                System.out.println("Opcion no valida y/o existente");
                System.out.println("");
                break;
            //Fin case default
        }
    }//fin metodo AgregarRecursos

    public static void EliminarRecurso(ArrayList<Libros> librosArray, ArrayList<ArtiCULOS> articulosArray, ArrayList<CursosenLinea> cursosArray, ArrayList<ConferenciasVirtuales> conferenciasArray) {
        System.out.println("Eliminar Recursos");
        System.out.println("===Tipos de Recursos===");
        System.out.println("1.Libros");
        System.out.println("2.Articulos");
        System.out.println("3.Cursos");
        System.out.println("4. Conferencias");
        System.out.print("Que tipo de recurso desea eliminar?:");
        int opEliminar = sc.nextInt();
        switch (opEliminar) {
            case 1:
                if (!librosArray.isEmpty()) {
                    for (int i = 0; i < librosArray.size(); i++) {
                        Libros Books = librosArray.get(i);
                        System.out.print(Books);
                    }
                    System.out.print("Que libro desea eliminar?:");
                    int eliminarOpcion = sc.nextInt();

                    if (eliminarOpcion >= 1 && eliminarOpcion <= librosArray.size()) {
                        librosArray.remove(eliminarOpcion - 1);
                        System.out.println("libro eliminada con éxito.");
                    } else {
                        System.out.println("libro no existente.");
                    }
                    System.out.println("");
                } else {
                    System.out.println("no hay libros que eliminar");
                }
                break;

            case 2:
                if (!articulosArray.isEmpty()) {
                    for (int i = 0; i < articulosArray.size(); i++) {
                        ArtiCULOS arti = articulosArray.get(i);
                        System.out.println(arti);
                    }
                    System.out.print("Que articulo desea eliminar?:");
                    int eliminarOpcion = sc.nextInt();

                    if (eliminarOpcion >= 1 && eliminarOpcion <= articulosArray.size()) {
                        articulosArray.remove(eliminarOpcion - 1);
                        System.out.println("articulo eliminada con éxito.");
                    } else {
                        System.out.println("articulo no existente.");
                    }
                    System.out.println("");
                } else {
                    System.out.println("no hay articulos que eliminar");
                }
                break;

            case 3:
                if (!cursosArray.isEmpty()) {
                    for (int i = 0; i < cursosArray.size(); i++) {
                        CursosenLinea cursoslista = cursosArray.get(i);
                        System.out.println(cursoslista);
                    }
                    System.out.print("Que curso desea eliminar?:");
                    int eliminarOpcion = sc.nextInt();

                    if (eliminarOpcion >= 1 && eliminarOpcion <= cursosArray.size()) {
                        cursosArray.remove(eliminarOpcion - 1);
                        System.out.println("curso eliminada con éxito.");
                    } else {
                        System.out.println("curso no existente.");
                    }
                    System.out.println("");
                } else {
                    System.out.println("no hay cursos que eliminar");
                }
                break;

            case 4:
                if (!conferenciasArray.isEmpty()) {
                    for (int i = 0; i < conferenciasArray.size(); i++) {
                        ConferenciasVirtuales confe = conferenciasArray.get(i);
                        System.out.println(confe);
                    }
                    System.out.print("Que conferencia desea eliminar?:");
                    int eliminarOpcion = sc.nextInt();

                    if (eliminarOpcion >= 1 && eliminarOpcion <= conferenciasArray.size()) {
                        conferenciasArray.remove(eliminarOpcion - 1);
                        System.out.println("conferencia eliminada con éxito.");
                    } else {
                        System.out.println("conferencia no existente.");
                    }
                    System.out.println("");
                } else {
                    System.out.println("no hay conferencias que eliminar");
                }
                break;

            default:
                System.out.println("Opcion no valida o no disponible");
                break;
        }//fin switch eliminar recurso
    }//fin metodo eliminar recurso
}//fin de la clase

