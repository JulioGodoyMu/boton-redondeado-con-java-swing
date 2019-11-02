package cl.juliogodoymunoz.Polimorfismo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;

public class Listener extends JFrame implements Boton{
    BotonRedondo boton,boton2;
    public Listener(){
    setBounds(0,0,1000,700);
    setLayout(null);
    	
    	
    boton=new BotonRedondo("Boton1");
    boton.setBounds(0,300,300,100);
    boton.addBotonEscucha(this);
    boton.setColor(Color.YELLOW);
    add(boton);
    boton2=new BotonRedondo("boton2");
    boton2.setBounds(0,0,100,30);
    boton2.addBotonEscucha(this);
    add(boton2);
    getContentPane().setBackground(Color.white);
    setVisible(true);
    }
	
	
	
	public void addBotonEscuchador(BotonRedondo e) {
		if(boton==e) {
		System.out.println("apreto el boton 1");	
		}else if(e==boton2) {
			System.out.println("apreto el boton 2");
		}
		
	}



	

}
