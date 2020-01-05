/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahebrascerrojos;

/**
 *
 * @author alejandronieto
 */
public class MainCerrojos {
    
    private static int tamanioBuffer = 0;
    private static int numHebrasProductoras = 0;
    private static int terminanHebrasProductoras = 0;
    private static int numHebrasConsumidoras = 0;
    private static int terminanHebrasConsumidoras = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        tamanioBuffer = Integer.parseInt(args[0]);
        numHebrasProductoras = Integer.parseInt(args[1]);
        terminanHebrasProductoras = Integer.parseInt(args[2]);
        numHebrasConsumidoras = Integer.parseInt(args[3]);
        terminanHebrasConsumidoras = Integer.parseInt(args[4]);
        
        HebraProductora[] hebrasProductoras = new HebraProductora[numHebrasProductoras];
        HebraConsumidora[] hebrasConsumidoras = new HebraConsumidora[numHebrasConsumidoras];
        
        Buffer myBuffer = new Buffer(tamanioBuffer);
        
        
        myBuffer.printBuffer();
        
        for(int i = 0; i < numHebrasProductoras; i++){
            hebrasProductoras[i] = new HebraProductora( String.valueOf(i), terminanHebrasProductoras, myBuffer);
            hebrasProductoras[i].mythread.start();
        }
        
        for(int i = 0; i < numHebrasConsumidoras; i++){
            hebrasConsumidoras[i] = new HebraConsumidora( String.valueOf(i), terminanHebrasConsumidoras, myBuffer);
            hebrasConsumidoras[i].mythread.start();
        }
        
    }
    
}
