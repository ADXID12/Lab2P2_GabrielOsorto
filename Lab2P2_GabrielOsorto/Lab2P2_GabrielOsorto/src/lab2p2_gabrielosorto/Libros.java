package lab2p2_gabrielosorto;

import java.util.*;

public class Libros {

    String TituloLibro;
    String AutorLibro;
    String GeneroLibro;
    int AñoPubliLibro;
    Boolean DispoLibro;

    public Libros(String TituloLibro, String AutorLibro, String GeneroLibro, int AñoPubliLibro, Boolean DispoLibro) {
        this.AutorLibro = AutorLibro;
        this.TituloLibro = TituloLibro;
        this.GeneroLibro = GeneroLibro;
        this.AñoPubliLibro = AñoPubliLibro;
        this.DispoLibro = DispoLibro;
    }

    public String getTituloLibro() {
        return TituloLibro;
    }

    public void setTituloLibro(String TituloLibro) {
        this.TituloLibro = TituloLibro;
    }

    public String getAutorLibro() {
        return AutorLibro;
    }

    public void setAutorLibro(String AutorLibro) {
        this.AutorLibro = AutorLibro;
    }

    public String getGeneroLibro() {
        return GeneroLibro;
    }

    public void setGeneroLibro(String GeneroLibro) {
        this.GeneroLibro = GeneroLibro;
    }

    public int getAñoPubliLibro() {
        return AñoPubliLibro;
    }

    public void setAñoPubliLibro(int AñoPubliLibro) {
        this.AñoPubliLibro = AñoPubliLibro;
    }

    public Boolean getDispoLibro() {
        return DispoLibro;
    }

    public void setDispoLibro(Boolean DispoLibro) {
        this.DispoLibro = DispoLibro;
    }

    @Override
    public String toString() {
        return "Libros{" + "TituloLibro=" + TituloLibro + ", AutorLibro=" + AutorLibro + ", GeneroLibro=" + GeneroLibro + ", A\u00f1oPubliLibro=" + AñoPubliLibro + ", DispoLibro=" + DispoLibro + '}';
    }

}
