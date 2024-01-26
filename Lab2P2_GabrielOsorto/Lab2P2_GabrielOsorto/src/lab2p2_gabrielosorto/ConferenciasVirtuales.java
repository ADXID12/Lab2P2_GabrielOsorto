package lab2p2_gabrielosorto;

import java.util.*;

public class ConferenciasVirtuales {

    String Titulo;
    String Conferencista;
    Date Fecha;
    int Duracion;
    String EnlaceAcceso;

    public ConferenciasVirtuales(String Titulo, String Conferencia, Date Fecha, int Duracion, String EnlaceAcceso) {
        this.Titulo = Titulo;
        this.Conferencista = Conferencia;
        this.Fecha = Fecha;
        this.Duracion = Duracion;
        this.EnlaceAcceso = EnlaceAcceso;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getConferencista() {
        return Conferencista;
    }

    public void setConferencista(String Conferencista) {
        this.Conferencista = Conferencista;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getEnlaceAcceso() {
        return EnlaceAcceso;
    }

    public void setEnlaceAcceso(String EnlaceAcceso) {
        this.EnlaceAcceso = EnlaceAcceso;
    }

    @Override
    public String toString() {
        return "ConferenciasVirtuales{" + "Titulo=" + Titulo + ", Conferencista=" + Conferencista + ", Fecha=" + Fecha + ", Duracion=" + Duracion + ", EnlaceAcceso=" + EnlaceAcceso + '}';
    }

}
