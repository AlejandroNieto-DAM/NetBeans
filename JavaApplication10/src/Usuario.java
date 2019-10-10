/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class Usuario {
    
    private String login;
    private String nombreUsuario;
    private String apellido1;
    private String apellido2;
    private String passwd;
    private String estado;
    
    
    Usuario(){
        login = "";
        nombreUsuario = "";
        apellido1 = "";
        apellido2 = "";
        passwd = "";
        estado = "";
    }

    public String getLogin() {
        return login;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getPasswd() {
        return passwd;
    }
    
    public String getEstadoUsuario(){
        return estado;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public void setEstadoUsuario(String estado){
        this.estado = estado;
    }
    
    public void printUsuario(){
        
        System.out.println("Login --> " + this.getLogin() + 
                            "\nNombre --> " + this.getNombreUsuario() + 
                            "\nPrimer Apellido --> " + this.getApellido1() + 
                            "\nSegundo Apellido --> " + this.getApellido2() + 
                            "\nEstado --> " + this.getEstadoUsuario());
        
    }
    
    
}
