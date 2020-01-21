/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahebrascerrojos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandronieto
 */
public class HebraConsumidora implements Runnable {
    
    public Thread mythread;
    int termina;
    Buffer buffer;
    String id;
    
    HebraConsumidora(String id, int termina, Buffer buffer){
        
        this.id = id;
        this.termina = termina;
        this.buffer = buffer;
        mythread = new Thread(this, this.id);
    }

    @Override
    public void run() {
        if(termina == 0){
            while(true){
                try {
                    buffer.consumir(id);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HebraConsumidora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } else {
            try {
                buffer.consumir(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(HebraConsumidora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
