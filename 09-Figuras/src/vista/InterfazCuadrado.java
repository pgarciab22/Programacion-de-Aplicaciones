package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Cuadrado;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class InterfazCuadrado extends JFrame implements ActionListener {
	 
	private JLabel lbn1 = new JLabel("Ingresa el tamaño del lado de tu cuadrado");
	private JTextField txtN1 = new JTextField();
	private JButton btnPerimetro = new JButton("Perimetro");
	private JButton btnArea = new JButton("Area");
	private JLabel lbnResultado = new JLabel("Resultado");
	
	private Container cont = getContentPane();

	
	public InterfazCuadrado(){
		super.setTitle("CUADRADO");
		super.setSize(320,320);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	private void cargarControles(){
		cont.setLayout(null);
		
		lbn1.setBounds(10,10,300,30);
		txtN1.setBounds(10,40,280,30);
		btnPerimetro.setBounds(10,100,160,35);
		btnArea.setBounds(10,150,160,35);
		lbnResultado.setBounds(10,180,300,30);
		
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
			Cuadrado cua = new Cuadrado();
			float result= cua.perimetros(Float.parseFloat(txtN1.getText()),0, 0, 0, 0, 0,0,0,0,0);
			lbnResultado.setText(String.format("El Perimetro es:  %.2f",result));
				
	}
		
		if(e.getSource()==btnArea){
		
			Cuadrado cua = new Cuadrado();
			float result = cua.areas(Float.parseFloat(txtN1.getText()), 0, 0, 0, 0, 0);
			lbnResultado.setText(String.format("El area es: %.2f",result));
			
		}

	}

	
}


