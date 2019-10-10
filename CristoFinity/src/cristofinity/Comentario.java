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
public class Comentario {
    
    private int idComentario;
    private String loginUsuario;
    private String descripcion;
    
    /*
     *@brief Constructor.
    */
    Comentario(){
        idComentario = 0;
        loginUsuario = "NULL";
        descripcion = "NULL";
        
    }
    
    /*
     *@brief Cambia el anterior valor del atributo por el nuevo id
     *@param id que es el nuevo valor
     *@pre Un objeto comentario es creado.
     *@post El valor del atributo idComentario sera cambiado.
    */
    public void setIDComentario(int id){
            idComentario = id;
    }
    
    /*
     *@brief Cambia el anterior valor del atributo por el nuevo login
     *@param login que es el nuevo valor
     *@pre Un objeto comentario es creado.
     *@post El valor del atributo loginUsuario sera cambiado.
    */
    public void setLoginUsuarioEnComentario(String login){
            loginUsuario = login;
    }
    
    /*
     *@brief Cambia el anterior valor del atributo por el nuevo descrip
     *@param descrip que es el nuevo valor
     *@pre Un objeto comentario es creado.
     *@post El valor del atributo descripcion sera cambiado.
    */
    public void setDescripcion(String descrip){
            descripcion = descrip;
    }
    
    /*
     *@brief Devuelve el valor del atributo idComentario
     *@pre Un objeto comentario es creado.
     *@return int idComentario
     *@post El valor del atributo idComentario sera impreso por pantalla.
    */
    public int getIDComentario(){
        return idComentario;
    }
    
    /*
     *@brief Devuelve el valor del atributo loginUsuario
     *@pre Un objeto comentario es creado.
     *@return string loginUsuario
     *@post El valor del atributo loginUsuario sera impreso por pantalla.
    */
    public String getLoginUsuarioEnComentario(){
        return loginUsuario;
    }
    
    /*
     *@brief Devuelve el valor del atributo descripcion
     *@pre Un objeto comentario es creado.
     *@return string descripcion
     *@post El valor del atributo descripcion sera impreso por pantalla.
    */
    public String getDescripcion(){
        return descripcion;
    }
    
    /*
     *@brief print de la clase comentario
    */
    public void printComentario(){
        
        System.out.println("ID COMENTARIO --> " + getIDComentario());
        System.out.println("USER --> " + getLoginUsuarioEnComentario());
        System.out.println("COMENTARIO --> " + getDescripcion());
    }
    
    /*
     *@brief Sobrecarga del System.out
    */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nID COMENTARIO --> ");
        sb.append(getIDComentario());
        sb.append("\nUSER --> ");
        sb.append(getLoginUsuarioEnComentario());
        sb.append("\nCOMENTARIO --> ");
        sb.append(getDescripcion());
        return sb.toString();
    }
    
    
}
