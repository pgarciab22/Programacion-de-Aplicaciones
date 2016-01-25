package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.CORBA.TCKind;

import modelo.Cuadrado;
import modelo.Tequilatero;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class InterfazEsquilatero extends JFrame implements ActionListener {
	
	private JLabel lbn1 = new JLabel("Ingresa el lado de tu triangulo");
	private JTextField txtN1 = new JTextField();
	private JLabel lbnBase = new JLabel("Ingresa la base");
	private JTextField txtbase = new JTextField();
	private JLabel lbnAltura = new JLabel("Ingresa la altura");
	private JTextField txtAltura = new JTextField();
	private JButton btnPerimetro = new JButton("Sacar Perimetro");
	private JButton btnArea = new JButton("Sacar Area");
	private JLabel lbnResultado = new JLabel("Resultado");
	
	private Container cont = getContentPane();
	

	public InterfazEsquilatero(){
		
		super.setTitle("EQUILATERO");
		super.setSize(320,320);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
		
	}
	
	private void cargarControles(){
		cont.setLayout(null);
		
		lbn1.setBounds(10,10,300,30);
		txtN1.setBounds(10,40,100,30);
		lbnBase.setBounds(10,60,160,35);
		txtbase.setBounds(10,90,100,35);
		lbnAltura.setBounds(10,120,160,35);
		txtAltura.setBounds(10,150,100,35);
		btnPerimetro.setBounds(10,200,100,35);
		btnArea.setBounds(10,250,100,35);
		lbnResultado.setBounds(10,280,300,30);
		
		cont.add(lbn1);
		cont.add(txtN1);
		cont.add(lbnBase);
		cont.add(txtbase);
		cont.add(lbnAltura);
		cont.add(txtAltura);
		cont.add(btnPerimetro);
		cont.add(btnArea);
		cont.add(lbnResultado);
		btnPerimetro.addActionListener(this);
		btnArea.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnPerimetro){
		Tequilatero tequi = new Tequilatero();
		float result = tequi.perimetros(0,0,0,Float.parseFloat(txtN1.getText()),0,0,0,0,0,0);
		lbnResultado.setText(String.format("El perimetero es: %.2f",tequi));
		}
		if(e.getSource()==btnArea){
		Tequilatero tequi = new Tequilatero();
			float result = tequi.areas(0,0,0,Float.parseFloat(txtbase.getText()),Float.parseFloat(txtAltura.getText()),0);
		lbnResultado.setText(String.format("El area es: %.2f",result));
			
		}
	}

}
