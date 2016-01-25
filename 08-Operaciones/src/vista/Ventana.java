
package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Division;
import modelo.Multiplicacion;
import modelo.Resta;
import modelo.Suma;

/**
 * 
 * @author Patricia García Baeza
 *
 */

public class Ventana extends JFrame implements ActionListener {

	private JLabel num1 = new JLabel("Ingresa el primer numero");
	private JTextField txtN1 = new JTextField();
	private JLabel num2 = new JLabel("Ingresa el segundo numero");
	private JTextField txtN2 = new JTextField();
	private JButton btnSum = new JButton("+");
	private JButton btnResta = new JButton("-");
	private JButton btnMulti = new JButton("*");
	private JButton btnDiv = new JButton("/");
	private JLabel lbnRes = new JLabel("Resultado");
	
	private Container cont = getContentPane();
	
	public Ventana(){
		super.setTitle("OPERACIONES");
		super.setSize(400,300);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	public void cargarControles(){
		cont.setLayout(null);
		
		num1.setBounds(10,10,300,30);
		txtN1.setBounds(180,10,100,30);
		num2.setBounds(10,50,300,30);
		txtN2.setBounds(180,50,100,30);
		btnSum.setBounds(10,90,50,30);
		btnResta.setBounds(70,90,40,30);
		btnMulti.setBounds(120,90,40,30);
		btnDiv.setBounds(170,90,40,30);
		lbnRes.setBounds(10,130,100,30);
		
		cont.add(num1);
		cont.add(txtN1);
		cont.add(num1);
		cont.add(num2);
		cont.add(txtN2);
		cont.add(btnSum);
		cont.add(btnResta);
		cont.add(btnMulti);
		cont.add(btnDiv);
		cont.add(lbnRes);
		
		btnSum.addActionListener(this);
		btnResta.addActionListener(this);
		btnMulti.addActionListener(this);
		btnDiv.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnSum){
			Suma sum = new Suma();
			int resSuma = sum.operacion(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
			lbnRes.setText(String.format("%s + %s = %d ",
					txtN1.getText(),
					txtN2.getText(),
					resSuma));
			}	
			if (e.getSource()== btnResta){
				Resta res = new Resta();
				
				int resRe = res.operacion(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
				lbnRes.setText(String.format("%s - %s = %d ",
						txtN1.getText(),
						txtN2.getText(),
						resRe));
			}
			
			if(e.getSource()== btnMulti){
				Multiplicacion multi = new Multiplicacion();
				
				int resMulti = multi.operacion(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
				lbnRes.setText(String.format("%s * %s = %d ",
						txtN1.getText(),
						txtN2.getText(),
						resMulti));
			}
			
			if(e.getSource()== btnDiv){
				Division div = new Division();
				
				int resDiv = div.operacion(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
				lbnRes.setText(String.format("%s / %s = %d ",
						txtN1.getText(),
						txtN2.getText(),
						resDiv));
			}
		}
		
	}

