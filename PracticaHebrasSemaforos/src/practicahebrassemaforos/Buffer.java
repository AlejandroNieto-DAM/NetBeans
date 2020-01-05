/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahebrassemaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author alejandronieto
 */
public class Buffer {
    
    int[] buffer;
    
    final Semaphore mutex;
    final Semaphore lleno;
    final Semaphore vacio;
    
    int entrada;
    int salida;
    
    int tamanioBuffer;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    
    Buffer(int tamanio){
        buffer = new int[tamanio];
        for(int i = 0; i < tamanio; i++){
            buffer[i] = 0;
        }
        mutex = new Semaphore(1);
        lleno = new Semaphore(0);
        vacio = new Semaphore(tamanio);
        entrada = 0;
        salida = 0;
        
        tamanioBuffer = tamanio;
    }
    
    public void consumir(String id){
        
        try{
            lleno.acquire();
        } catch (InterruptedException e) {}
        
        try{
            mutex.acquire();
        } catch (InterruptedException e) {}
            
        buffer[salida] = 0;
        System.out.println("La hebra consumidora " + id + " ha consumido en la posicion: " + salida);
        printBufferConsumidora(salida);
        salida = (salida + 1) % tamanioBuffer;
        
        mutex.release();
        vacio.release();
        
        
    }
    
    public void producir(String id){
        
        try{
            vacio.acquire();
        } catch (InterruptedException e) {}
        
        try{
            mutex.acquire();
        } catch (InterruptedException e) {}
            
        buffer[entrada] = 1;
        System.out.println("La hebra productora " + id + " ha producido en la posicion: " + entrada);
        printBufferProductora(entrada);
        entrada = (entrada + 1) % tamanioBuffer;
        
        mutex.release();
        lleno.release();
       
    }
    
    
   public void printBufferProductora(int pos){
        
       System.out.println( "**** PRINT DEL BUFFER ****");
        for(int i = 0;  i < tamanioBuffer; i++){
            if(i == pos){
                System.out.print(ANSI_RED + buffer[i] + ANSI_RESET + " ");
            } else {
                System.out.print(buffer[i] + " ");
            }

        }
        
        System.out.println("");
    
    }
   
   public void printBufferConsumidora(int pos){
        
       System.out.println( "**** PRINT DEL BUFFER ****");
        for(int i = 0;  i < tamanioBuffer; i++){
            if(i == pos){
                System.out.print(ANSI_GREEN + buffer[i] + ANSI_RESET + " ");
            } else {
                System.out.print(buffer[i] + " ");
            }

        }
        
        System.out.println("");
    
    }
   
    public void printBuffer(){
        for(int i = 0;  i < tamanioBuffer; i++){
            System.out.print(buffer[i] + " ");  
        }
        
        System.out.println("");
    }
    
}
