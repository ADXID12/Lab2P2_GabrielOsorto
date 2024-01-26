package lab2p2_gabrielosorto;

import java.util.*;

public class Usuario {

    String Username;
    String Contra;
    String TipoUsuario;

    public Usuario(String Username, String Contra, String TipoUsuario) {
        this.Username = Username;
        this.Contra = Contra;
        this.TipoUsuario = TipoUsuario;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Username=" + Username + ", Contra=" + Contra + ", TipoUsuario=" + TipoUsuario + '}';
    }

}
