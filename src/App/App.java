/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import ProcedimientoAlmacenado1.ProcedimientoAlmacenado1;
import ProcedimientoAlmacenado2.ProcedimientoAlmacenado2;

/**
 *
 * @author BrunoDev
 */
public class App {
    
    private static void iniciar() {
        
        ProcedimientoAlmacenado1 pA1 = new ProcedimientoAlmacenado1();
        pA1.PSelectTodosLosProductos();
        
        ProcedimientoAlmacenado2 pA2 = new ProcedimientoAlmacenado2();
        pA2.SelectProductoPorId(1);
    }
    
    public static void main(String[] args) {
        iniciar();        
    }
    
}
