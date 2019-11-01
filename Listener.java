package cl.juliogodoymunoz.Polimorfismo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;

public class Listener extends JFrame implements Boton{

    public Listener(){
    setBounds(0,0,1000,700);
    setLayout(null);
    	
    	
    BotonRedondo boton=new BotonRedondo("Boton");
    boton.setBounds(200,300,200,70);
    boton.addBotonEscucha(this);
    boton.setColor(Color.YELLOW);
    add(boton);
    getContentPane().setBackground(Color.white);
    setVisible(true);
    }
	
	
	
	public void addBotonEscuchador() {
		
		System.out.println("clickeo el mouse");
		
	}



	

}
