/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_static_3;

/**
 *
 * @author hp
 */
public class EVA1_21_STATIC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(prueba.valor);
        
        prueba.valor++;
        System.out.println(prueba.valor);//si se mpdifica
        
        
        
//        System.out.println(PruebaObjetos.);
        
        PruebaObjetos obj=new PruebaObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        System.out.println(obj.valor);
    }
    
}


class prueba{
    public static int valor=100;
}

class PruebaObjetos{
    public int valor=200;
}


