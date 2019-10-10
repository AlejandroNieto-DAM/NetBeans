/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristofinity;

/**
 *
 * @author alejandronieto
 */
public class Valoracion {
    
    private int idValoracion;
    private String loginUsuario;
    private float puntuacion;
    
    /*
     *@brief Constructor.
    */
    Valoracion(){
        idValoracion = 0;
        loginUsuario = "NULL";
        puntuacion = 0;
    }
    
    /*
     *@brief Cambia el anterior valor del atributo por el nuevo id
     *@param id que es el nuevo valor
     *@pre Un objeto valoracion es creado.
     *@post El valor del atributo idValoracion sera cambiado.
    */
    public void setIDValoracion(int id){
        idValoracion = id;
    }
  
    /*
     *@brief Cambia el anterior valor del atributo por el nuevo login
     *@param login que es el nuevo valor
     *@pre Un objeto valoracion es creado.
     *@post El valor del atributo loginUsuario sera cambiado.
    */
    public void setLoginUsuarioEnValoracion(String login){
        loginUsuario = login;
    }
    
    /*
     *@brief Cambia el anterior valor del atributo por el nuevo valor
     *@param valor que es el nuevo valor
     *@pre Un objeto valoracion es creado.
     *@post El valor del atributo puntuacion sera cambiado.
    */
    public void setPuntuacion(float valor){
        puntuacion = valor;
    }
    
    /*
     *@brief Devuelve el valor del atributo idValoracion
     *@pre Un objeto comentario es creado.
     *@return int idValoracion
     *@post El valor del atributo idValoracion sera impreso por pantalla.
    */
    public int getIDValoracion(){
        return idValoracion;
    }
    
    /*
     *@brief Devuelve el valor del atributo loginUsuario
     *@pre Un objeto valoracion es creado.
     *@return string loginUsuario
     *@post El valor del atributo loginUsuario sera impreso por pantalla.
    */
    public String getLoginUsuarioEnValoracion(){
        return loginUsuario;
    }
    
    /*
     *@brief Devuelve el valor del atributo puntuacion
     *@pre Un objeto valoracion es creado.
     *@return float puntuacion
     *@post El valor del atributo idValoracion sera impreso por pantalla.
    */
    public float getPuntuacion(){
        return puntuacion;
    }
    
    /*
     *@brief print de la clase valoracion
    */
    public void printValoracion(){
        
        System.out.println("ID VALORACION --> " + getIDValoracion());
        System.out.println("USUARIO --> " + getLoginUsuarioEnValoracion());
        System.out.println("PUNTUACION --> " + getPuntuacion());
    }
    
    /*
     *@brief Sobrecarga del System.out
    */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nID VALORACION --> ");
        sb.append(getIDValoracion());
        sb.append("\nUSER --> ");
        sb.append(getLoginUsuarioEnValoracion());
        sb.append("\nPUNTUACION --> ");
        sb.append(getPuntuacion());
        return sb.toString();
    }
}
