package lab2p2_gabrielosorto;

import java.util.*;

public class CursosenLinea {

    String TituloCurso;
    String Instructor;
    int DuracionSemanas;
    String PlataformaEnseñanza;

    public CursosenLinea(String TituloCurso, String Instructor, int DuracionSemanas, String PlataformaEnseñanza) {
        this.TituloCurso = TituloCurso;
        this.Instructor = Instructor;
        this.DuracionSemanas = DuracionSemanas;
        this.PlataformaEnseñanza = PlataformaEnseñanza;
    }

    public String getTituloCurso() {
        return TituloCurso;
    }

    public void setTituloCurso(String TituloCurso) {
        this.TituloCurso = TituloCurso;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String Instructor) {
        this.Instructor = Instructor;
    }

    public int getDuracionSemanas() {
        return DuracionSemanas;
    }

    public void setDuracionSemanas(int DuracionSemanas) {
        this.DuracionSemanas = DuracionSemanas;
    }

    public String getPlataformaEnseñanza() {
        return PlataformaEnseñanza;
    }

    public void setPlataformaEnseñanza(String PlataformaEnseñanza) {
        this.PlataformaEnseñanza = PlataformaEnseñanza;
    }

    @Override
    public String toString() {
        return "CursosenLinea{" + "TituloCurso=" + TituloCurso + ", Instructor=" + Instructor + ", DuracionSemanas=" + DuracionSemanas + ", PlataformaEnse\u00f1anza=" + PlataformaEnseñanza + '}';
    }

}
