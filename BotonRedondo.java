package cl.juliogodoymunoz.Polimorfismo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BotonRedondo extends JPanel implements MouseListener{
    
	private Color color,aux;
    private int r;
    private JLabel texto;
    private Boton botonInterface;
   // private Container contenedor;
    //private BotonRedondo instancia;
    
	BotonRedondo(){
	color=Color.LIGHT_GRAY;
	add(texto);
	}
    
	BotonRedondo(String titulo){
		setLayout(null);
		color=Color.LIGHT_GRAY;
		
	    texto=new JLabel(titulo,SwingConstants.CENTER);
	    add(texto);
		//this.setBackground(new Color(0,0,0,255));
		this.addMouseListener(this);
		}
	
	public void setColor(Color c) {
		color=c;
	}
    public void paint(Graphics g) {
      g.setColor(color);
      r=(int)(getHeight()/2);
      g.fillRect(r,0,(int)(this.getWidth()-2*r),(int)(this.getHeight()));	
      g.fillOval(0, 0,2*r, 2*r);
      g.fillOval(getWidth()-2*r, 0, 2*r, 2*r);
      this.setOpaque(false);
      super.paint(g);
      texto.setBounds(0,0,this.getWidth(),this.getHeight());
      add(texto);
    }
    
    public void setTexto() {
    	
    }

	

	@Override
	public void mouseClicked(MouseEvent e) {
     	
		botonInterface.addBotonEscuchador(this);
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		aux=getColor();
		setColor(Color.cyan);
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		setColor(aux);
		repaint();
		
	}

	public void addBotonEscucha(Container contenedor){
		//this.contenedor=contenedor;
		//System.out.println(contenedor.getName());
		if(contenedor instanceof Boton) {
		
			botonInterface=(Boton) contenedor;
		}
	}

    public Color getColor() {
    	return color;
    }
	
	
}
