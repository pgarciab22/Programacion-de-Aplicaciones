package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.tools.JavaFileManager;

import modelo.Circulo;
import modelo.Cuadrado;
/**
 * 
 * @author Patricia Garcia
 *
 */
public class InterfazCirculo extends JFrame implements ActionListener{

	private JLabel lbn1 = new JLabel("Ingrese el radio o el diametro del circulo");
	private JTextField txtN1= new JTextField();
	private JButton btnPerimetro = new JButton("Perimetro");
	private JButton btnArea = new JButton("Area");
	private JLabel lbnResultado = new JLabel();
	
	private Container cont = getContentPane();
	
	public InterfazCirculo(){
		super.setTitle("Circulo");
		super.setSize(320,320);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	private void cargarControles(){
		cont.setLayout(null);
	
		lbn1.setBounds(10,30,300,30);
		txtN1.setBounds(10,63,100,30);
		btnPerimetro.setBounds(10,99,120,35);
		btnArea.setBounds(10,140,120,35);
		lbnResultado.setBounds(10,170,200,30);
		
		cont.add(lbn1);
		cont.add(txtN1);
		cont.add(btnPerimetro);
		cont.add(btnArea);
		cont.add(lbnResultado);
		btnPerimetro.addActionListener(this);
		btnArea.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnPerimetro) {
			Circulo cir = new Circulo();
			float result= cir.perimetros(0,0,0,0,0,0,0,0,Float.parseFloat(txtN1.getText()),0);
			lbnResultado.setText(String.format("El Perimetro es:  %.2f",result));
		
	}
		
	if (e.getSource()==btnArea){
		Circulo cir = new Circulo();
		float resul = cir.areas(0,0,0,0,0,Float.parseFloat(txtN1.getText()));
		lbnResultado.setText(String.format("El area es: %.2f",resul));
	}
	
	}

}
