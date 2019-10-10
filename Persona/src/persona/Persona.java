/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author alejandronieto
 */
public class Persona {
    
    private String sDNI;
    private String sNombre;
    private int nEdad;
    private String sSexo;
    private float fPeso;
    private int nAltura;
     
    
    Persona(){
        this.sDNI = this.generateDni();
        this.sSexo = "H";
        this.nAltura = 0;
        this.fPeso = 0;
        this.sNombre = "";
        this.nEdad = 0;
    }
    
    Persona(String nombre, int edad, String sexo){
        this.sDNI = this.generateDni();
        this.sNombre = nombre;
        this.nEdad = edad;
        this.sSexo = sexo;
        this.nAltura = 0;
        this.fPeso = 0;
    }
    
    Persona(String nombre, int edad, String sexo, float peso, int altura){
        this.sDNI = this.generateDni();
        this.sNombre = nombre;
        this.nEdad = edad;
        this.sSexo = sexo;
        this.fPeso = peso;
        this.nAltura = altura;
    }

    

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setnEdad(int nEdad) {
        this.nEdad = nEdad;
    }

    public void setcSexo(String sSexo) {
        this.sSexo = sSexo;
    }

    public void setfPeso(float fPeso) {
        this.fPeso = fPeso;
    }

    public void setnAltura(int nAltura) {
        this.nAltura = nAltura;
    }

    public String getsDNI() {
        return sDNI;
    }

    public String getsNombre() {
        return sNombre;
    }

    public int getnEdad() {
        return nEdad;
    }

    public String getsSexo() {
        return sSexo;
    }

    public float getfPeso() {
        return fPeso;
    }

    public int getnAltura() {
        return nAltura;
    }
    
    private String generateDni(){
        
        String dni = "";
        int numDni = 0;
        int resto = 0;
        
        String[] letrasDni = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        
        for(int i = 0; i < 8; i++){
         
            if(i == 0){
                numDni = numDni + (int) (Math.random()*9 + 1);
            } else {
                numDni = (numDni * 10) + (int) (Math.random()*9);
            }
    
        }

        resto = numDni % 23;
        
        dni = Integer.toString(numDni) + letrasDni[resto];
        
        
        return dni;
    }
    
    public void comprobarSexo(String sexo){
        
        if(this.getsSexo() == sexo){
            System.out.println("El sexo introducido es correcto.");
        } else {
            System.out.println("El sexo introducido es incorrecto.");
        }
    }
    
    @Override
    public String toString(){
        
        String info = "";
        
        info += "DNI --> " + this.getsDNI() +
                "\nNombre --> " + this.getsNombre() + 
                "\nEdad --> " + this.getnEdad() + 
                "\nSexo --> " + this.getsSexo() +
                "\nPeso --> " + this.getfPeso() + 
                "\nAltura --> " + this.getnAltura();
                
        
        return info;
    }
    
    public boolean esMayorDeEdad(){
        
        boolean mayorDeEdad = false;
        
        if(this.getnEdad() > 18){
            mayorDeEdad = true;
        }
        
        return mayorDeEdad;
    }
    
    public void calcularIMC(){
        
        double imc = 0;
        int number = 0;
        double altura = 0;
        
        altura = this.getnAltura() / 100;
        
        imc = this.getfPeso() / (altura * altura);
        
        if(imc < 20){   
            System.out.println("IMC --> Estas en tu peso ideal." ); 
        } else if(imc < 25 && imc > 20){
            System.out.println("IMC --> Estas por debajo de tu peso.");
        } else if(imc > 25){
            System.out.println("IMC --> Estas por encima de tu peso.");
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona a = new Persona("Antonio", 14, "M", 80, 174);
        
        System.out.println(a.toString());
        a.calcularIMC();
        
        
        
    }
    
}
