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
                                System.out.println("Menu Bibliotecario");
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
                                        ModificarRecurso(libros, articulos, cursos, conferencias);
                                        System.out.println("");
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
    }
    //fin metodo Listar Recursos

    public static void AgregarRecursos(ArrayList<Libros> librosArray, ArrayList<ArtiCULOS> articulosArray, ArrayList<CursosenLinea> cursosArray, ArrayList<ConferenciasVirtuales> conferenciasArray) {
        System.out.println("Agregar Recursos:");
        System.out.println("===Tipos de Recursos===");
        System.out.println("1.Libros");
        System.out.println("2.Articulos");
        System.out.println("3.Cursos");
        System.out.println("4. Conferencias");
        System.out.print("Que tipo de recurso desea agregar?");
        int tipoAgregar = sc.nextInt();
        System.out.println("");
        switch (tipoAgregar) {
            case 1:
                boolean LibroDisponibleAgregado = true;
                System.out.print("Ingrese el nombre del Libro:");
                String TituloLibroAgredado = lt.nextLine();
                System.out.print("Ingrese el nombre del autor:");
                String AutorTituloAgregado = lt.nextLine();
                System.out.print("Ingrese el genero del libro:");
                String GeneroLibroAgregado = lt.nextLine();
                System.out.print("Ingrese el año de publicacion:");
                int AñoPublicacioLibroAgregado = sc.nextInt();
                System.out.print("El libro esta disponible?:");
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
                System.out.print("Ingrese el nombre del Articulo:");
                String TituloArticuloAgredado = lt.nextLine();
                System.out.print("Ingrese el nombre del autor:");
                String AutorArticuloAgregado = lt.nextLine();
                System.out.print("Ingrese el tema del articulo:");
                String TemaArticuloAgregado = lt.nextLine();
                System.out.print("Ingrese el año de publicacion:");
                int AñoPublicacioArticuloAgregado = sc.nextInt();
                System.out.print("El libro esta disponible(si/no)?:");
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
    }
    //fin metodo AgregarRecursos

    public static void EliminarRecurso(ArrayList<Libros> librosArray, ArrayList<ArtiCULOS> articulosArray, ArrayList<CursosenLinea> cursosArray, ArrayList<ConferenciasVirtuales> conferenciasArray) {
        System.out.println("Eliminar Recursos");
        System.out.println("===Tipos de Recursos===");
        System.out.println("1.Libros");
        System.out.println("2.Articulos");
        System.out.println("3.Cursos");
        System.out.println("4. Conferencias");
        System.out.print("Que tipo de recurso desea eliminar?:");
        int opEliminar = sc.nextInt();
        System.out.println("");
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
                System.out.println("");
                break;
            //fin case 1

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
                System.out.println("");
                break;
            //Fin case 2

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
                System.out.println("");
                break;
            //fin case 3

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
                System.out.println("");
                break;
            //Fin case 4

            default:
                System.out.println("Opcion no valida o no disponible");
                System.out.println("");
                break;
            //Fin case default
        }//fin switch eliminar recurso
    }
    //fin metodo eliminar recurso

    public static void ModificarRecurso(ArrayList<Libros> librosArray, ArrayList<ArtiCULOS> articulosArray, ArrayList<CursosenLinea> cursosArray, ArrayList<ConferenciasVirtuales> conferenciasArray) {
        int opCambiar = 0;
        System.out.println("Modificar Recurso");
        System.out.println("===Tipos de Recursos===");
        System.out.println("1.Libros");
        System.out.println("2.Articulos");
        System.out.println("3.Cursos");
        System.out.println("4. Conferencias");
        System.out.print("Que tipo de recurso desea modificar?:");
        int opModificar = sc.nextInt();
        switch (opModificar) {
            case 1:
                if (!librosArray.isEmpty()) {
                    for (int i = 0; i < librosArray.size(); i++) {
                        Libros Books = librosArray.get(i);
                        System.out.println(Books);
                    }
                    System.out.print("Ingrese la opcion que desea modificar:");
                    opCambiar = sc.nextInt();
                    if (opCambiar >= 1 && opCambiar <= librosArray.size()) {
                        Libros LibroModificado = librosArray.get(opCambiar - 1);
                        System.out.print("Ingrese el nuevo nombre:");
                        String nuevoNombre = lt.nextLine();
                        LibroModificado.setTituloLibro(nuevoNombre);
                        System.out.print("Ingrese el nombre del autor del nuevo libro:");
                        String nuevoAutor = lt.nextLine();
                        LibroModificado.setAutorLibro(nuevoAutor);
                        System.out.print("Ingrese el genero del nuevo libro:");
                        String generoNuevo = lt.nextLine();
                        LibroModificado.setGeneroLibro(generoNuevo);
                        System.out.print("Ingrese el año de creacion del nuevo Libro:");
                        int nuevoAño = sc.nextInt();
                        LibroModificado.setAñoPubliLibro(nuevoAño);
                        System.out.println("Ingrese si el libro esta disponible:");
                        String disponibleNuevo = lt.nextLine();
                        if (disponibleNuevo.equalsIgnoreCase("si")) {
                            boolean NuevoDispo = true;
                            LibroModificado.setDispoLibro(NuevoDispo);
                        } else if (disponibleNuevo.equalsIgnoreCase("no")) {
                            boolean NuevoDispo = false;
                            LibroModificado.setDispoLibro(NuevoDispo);
                        }
                        System.out.println("Libro modificado exitosamente");
                    } else {
                        System.out.println("Libro no existente");
                    }
                } else {
                    System.out.println("no hay libro que modificar");
                }
                System.out.println("");
                //Fin case 1
                break;

            case 2:
                if (!cursosArray.isEmpty()) {
                    for (int i = 0; i < articulosArray.size(); i++) {
                        ArtiCULOS arti = articulosArray.get(i);
                        System.out.println(arti);
                    }
                    System.out.print("Ingrese la opcion que desea modificar:");
                    opCambiar = sc.nextInt();
                    if (opCambiar >= 1 && opCambiar <= articulosArray.size()) {
                        ArtiCULOS arti = articulosArray.get(opCambiar - 1);
                        System.out.print("Ingrese el nuevo nombre:");
                        String nuevoNombre = lt.nextLine();
                        arti.setTituloArti(nuevoNombre);
                        System.out.print("Ingrese el nombre del autor del nuevo articulo:");
                        String nuevoAutor = lt.nextLine();
                        arti.setAutorArti(nuevoAutor);
                        System.out.print("Ingrese el tema del nuevo articulo:");
                        String generoNuevo = lt.nextLine();
                        arti.setTemaArti(generoNuevo);
                        System.out.print("Ingrese el año de creacion del nuevo articulo:");
                        int nuevoAño = sc.nextInt();
                        arti.setFechaPubliArti(nuevoAño);
                        System.out.println("Ingrese si el nuevo articulo esta disponible:");
                        String disponibleNuevo = lt.nextLine();
                        if (disponibleNuevo.equalsIgnoreCase("si")) {
                            boolean NuevoDispo = true;
                            arti.setOnlineAccess(NuevoDispo);
                        } else if (disponibleNuevo.equalsIgnoreCase("no")) {
                            boolean NuevoDispo = false;
                            arti.setOnlineAccess(NuevoDispo);
                        }
                        System.out.println("articulo modificado exitosamente");
                    } else {
                        System.out.println("articulo no existente");
                    }

                } else {
                    System.out.println("no hay articulos que modificar");
                }
                System.out.println("");
                //fin case 2
                break;

            case 3:
                if (!cursosArray.isEmpty()) {
                    for (int i = 0; i < cursosArray.size(); i++) {
                        CursosenLinea cursoslista = cursosArray.get(i);
                        System.out.println(cursoslista);
                    }
                    System.out.print("Ingrese la opcion que desea modificar:");
                    opCambiar = sc.nextInt();
                    if (opCambiar >= 1 && opCambiar <= cursosArray.size()) {
                        CursosenLinea nuevocurso = cursosArray.get(opCambiar - 1);

                        System.out.print("Ingrese el titulo del nuevo curso:");
                        String nombreCursoAgregado = lt.nextLine();
                        nuevocurso.setTituloCurso(nombreCursoAgregado);
                        System.out.print("Ingrese el nombre del Instructor del nuevo curso:");
                        String NombreNuevoInstruAgregado = lt.nextLine();
                        nuevocurso.setInstructor(NombreNuevoInstruAgregado);
                        System.out.print("Ingrese la cantidad de semanas que durará el nuevo curso:");
                        int NuevaDuracionSemanas = sc.nextInt();
                        nuevocurso.setDuracionSemanas(NuevaDuracionSemanas);
                        System.out.print("Ingrese el nombre de la plataforma donde se recibira el curso:");
                        String NombrePlataformanuevoCurso = lt.nextLine();
                        nuevocurso.setPlataformaEnseñanza(NombrePlataformanuevoCurso);
                        System.out.println("curso modificado correctamente");
                    } else {
                        System.out.println("curso no existente");
                    }
                } else {
                    System.out.println("no hay cursos que modificar");
                }
                System.out.println("");
                //fin case 3
                break;

            case 4:
                if (!conferenciasArray.isEmpty()) {
                    for (int i = 0; i < conferenciasArray.size(); i++) {
                        ConferenciasVirtuales confe = conferenciasArray.get(i);
                        System.out.println(confe);
                    }
                    if (opCambiar >= 1 && opCambiar <= conferenciasArray.size()) {
                        ConferenciasVirtuales nuevaconfe = conferenciasArray.get(opCambiar - 1);
                        System.out.print("Ingrese el nombre de la conferencia nueva:");
                        String TituloNuevaConferenciaAgregada = lt.nextLine();
                        nuevaconfe.setTitulo(TituloNuevaConferenciaAgregada);
                        System.out.print("Ingrese el nombre del nuevo conferencista:");
                        String NombreNuevoConferencista = lt.nextLine();
                        nuevaconfe.setConferencista(NombreNuevoConferencista);
                        System.out.println("Ingrese la fecha de la nueva conferencia(dd/mm/yyyy):");
                        String FechaNuevaConferenciaAgregada = lt.nextLine();
                        nuevaconfe.setFecha(FechaNuevaConferenciaAgregada);
                        System.out.print("Ingrese la duracion de la nueva conferenia(ejemplo=2hrs/1hr):");
                        String DuracionNuevaConferenciaAgregada = lt.nextLine();
                        nuevaconfe.setDuracion(DuracionNuevaConferenciaAgregada);
                        System.out.print("Ingrese el nuevo link de acceso:");
                        String LinkAccesoConferenciaNueva = lt.nextLine();
                        nuevaconfe.setEnlaceAcceso(LinkAccesoConferenciaNueva);
                        System.out.println("Conferencia agregada con exito");
                    } else {
                        System.out.println("conferencia no disponible");
                    }

                } else {
                    System.out.println("no hay onferencia que modificar");
                }
                System.out.println("");
                //Fin case 4
                break;

            default:
                System.out.println("Opcion no disponible");
                System.out.println("");

                break;

        }//fin switch case modificar elemento
    }
    //fin metodo Modificar recuerso
}//fin de la clase

