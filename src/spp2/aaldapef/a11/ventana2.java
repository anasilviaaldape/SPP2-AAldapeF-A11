/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.a11;
import java.awt.*;
/**
 *
 * @author Aldape
 */
public class ventana2 extends Frame {
    //Atributos (botones)
    private final  Button btnNorte, btnSur, btnEste, btnOeste, btnCentro;
    
    //CONSTRUCTOR
    @SuppressWarnings ("OverridableMethodCallInConstructor")
    public ventana2(){
        super ("Ventana 2");
        setLayout (new BorderLayout());
        
        btnNorte= new Button ("Norte");
        add (btnNorte, BorderLayout.NORTH); 
        
        btnSur= new Button ("Sur");
        add (btnSur, BorderLayout.SOUTH);
        
        btnEste= new Button ("Este");
        add (btnEste, BorderLayout.EAST);
        
        btnOeste= new Button ("Oeste");
        add (btnOeste, BorderLayout.WEST);
        
        btnCentro= new Button ("Centro");
        add (btnCentro, BorderLayout.CENTER);
        
        setSize (800,600);
        setVisible (true);
    }
}
