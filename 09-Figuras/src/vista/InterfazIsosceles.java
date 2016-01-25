package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.TIsosceles;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class InterfazIsosceles extends JFrame implements ActionListener {

	private JLabel lbn1 = new JLabel("Ingresa el tamaño de la base");
	private JTextField txtBase = new JTextField();
	private JLabel lbn2 = new JLabel("Ingresa el tamaño de la altura");
	private JTextField txtAltura = new JTextField();
	private JButton btnPerimetro = new JButton("Sacar Perimetro");
	private JButton btnArea = new JButton("Sacar area");
	private JLabel lbnResultado = new JLabel("Resultado");
	
	private Container cont = getContentPane();
	
	
	InterfazIsosceles(){
		super.setTitle("Isosceles");
		super.setSize(400,300);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	public void cargarControles(){
		cont.setLayout(null);
		lbn1.setBounds(10,10,300,30);
		txtBase.setBounds(180,10,100,30);
		lbn2.setBounds(10,50,300,30);
		txtAltura.setBounds(180,50,100,30);
		btnPerimetro.setBounds(10,100,160,35);
		btnArea.setBounds(10,140,160,35);
		lbnResultado.setBounds(10,180,300,30);
		
		cont.add(lbn1);
		cont.add(txtBase);
		cont.add(lbn2);
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
		TIsosceles tiso = new TIsosceles();
		float result = tiso.perimetros(0,0,0,0,Float.parseFloat(txtBase.getText()),Float.parseFloat(txtAltura.getText()),0,0,0,0);
		lbnResultado.setText(String.format("El perimetro es : %.2f",result));
		}
		if(e.getSource()==btnArea){
			TIsosceles tiso =  new TIsosceles();
			float result = tiso.areas(0,0,0,Float.parseFloat(txtBase.getText()),Float.parseFloat(txtAltura.getText()),0);
			lbnResultado.setText(String.format("El area es : %.2f",result));
			
		}
		
	}
}
