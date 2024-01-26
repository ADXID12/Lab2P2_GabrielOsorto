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
                            ListarRecursos(libros, articulos, cursos, conferencias);
                            break;
                        case "profesor":
                            System.out.println("La concha de tu madre bob esponja");
                            break;
                        case "bibliotecario":
                            System.out.println("Ya ya mijo ya");
                            break;
                    }
                } else {
                    System.out.println("Contraseña Incorrecta :(");
                }
            } else {
                System.out.println("Usuario Inexistente :(");
            }
        }
    }

    public static void ListarRecursos(ArrayList<Libros> libros, ArrayList<ArtiCULOS> articulos, ArrayList<CursosenLinea> cursos, ArrayList<ConferenciasVirtuales> conferencias) {
        for (int i = 0; i < libros.size(); i++) {
            Libros Books = libros.get(i);
            System.out.print(Books);
            
        }
    }
}
