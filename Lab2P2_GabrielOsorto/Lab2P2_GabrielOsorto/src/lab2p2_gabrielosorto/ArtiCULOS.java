package lab2p2_gabrielosorto;

import java.util.*;

public class ArtiCULOS {

    String TituloArti;
    String AutorArti;
    String TemaArti;
    int FechaPubliArti;
    Boolean OnlineAccess;

    public ArtiCULOS(String TituloArti, String AutorArti, String TemaArti, int FechaPubliArti, Boolean OnlineAccess) {
        this.TituloArti = TituloArti;
        this.AutorArti = AutorArti;
        this.TemaArti = TemaArti;
        this.FechaPubliArti = FechaPubliArti;
        this.OnlineAccess = OnlineAccess;
    }

    public String getTituloArti() {
        return TituloArti;
    }

    public void setTituloArti(String TituloArti) {
        this.TituloArti = TituloArti;
    }

    public String getAutorArti() {
        return AutorArti;
    }

    public void setAutorArti(String AutorArti) {
        this.AutorArti = AutorArti;
    }

    public String getTemaArti() {
        return TemaArti;
    }

    public void setTemaArti(String TemaArti) {
        this.TemaArti = TemaArti;
    }

    public int getFechaPubliArti() {
        return FechaPubliArti;
    }

    public void setFechaPubliArti(int FechaPubliArti) {
        this.FechaPubliArti = FechaPubliArti;
    }

    public Boolean getOnlineAccess() {
        return OnlineAccess;
    }

    public void setOnlineAccess(Boolean OnlineAccess) {
        this.OnlineAccess = OnlineAccess;
    }

    @Override
    public String toString() {
        return "ArtiCULOS{" + "TituloArti=" + TituloArti + ", AutorArti=" + AutorArti + ", TemaArti=" + TemaArti + ", FechaPubliArti=" + FechaPubliArti + ", OnlineAccess=" + OnlineAccess + '}';
    }

}
