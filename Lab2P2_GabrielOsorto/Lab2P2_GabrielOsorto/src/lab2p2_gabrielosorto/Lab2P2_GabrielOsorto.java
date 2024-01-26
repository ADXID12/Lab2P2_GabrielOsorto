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
                                switch (opMaestro) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        break;

                                }
                            }
                            break;
                        //FIN CASE PROFESOR
                        case "bibliotecario":
                            System.out.println("Ya ya mijo ya");
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
        System.out.println("Que tipo de recurso desea agregar?");
    }//fin metodo AgregarRecursos
}//fin de la clase

