/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.eazuara.a07;

/**
 *
 * @author Esteban
 */
public class FPEAzuaraA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un arreglo entero
       int[][]mat=new int [10][10];
        System.out.println(mat.length);
        mat=llenartabla(mat);
    
       
    }
    
    public static int[][]llenartabla(int[][]a){
        
        for(int i=0;i<=10; i++){
            for(int j=0; j<=10; j++){
                System.out.println("Introduce la posicion["+i+"] ["+j+"]"+"\n"+ i*j);
               
                
            }
        }
           return a;
                  
        }
       
    
    
    
    public static void mostrarVector(int [] []v){
        for(int i=0; i<=v.length; ++i){
            System.out.println("["+v[i]+"]");
    }
    
}
}



