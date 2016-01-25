import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class InterfazTriIsosceles extends JFrame implements ActionListener {

	private JLabel lblN1 = new JLabel("Ingresa el tamaño de el lado de tu triangulo");
	private JTextField txtN1 = new JTextField();
	private JLabel lblN3 = new JLabel("Ingresa el tamaño de la base");
	private JTextField txtN3 = new JTextField();
	private JButton btN1 = new JButton("Sacar Area");
	private JLabel lblN4 = new JLabel("Resultado");
	
	private Container o = getContentPane();
	private Areas b = new Areas();	
	
	public InterfazTriIsosceles(){
		
	super.setTitle("Triangulo Isósecles");
	super.setSize(280,550);
	super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	cargarControles();	
	
	}

	
	private void cargarControles() {
		o.setLayout(null);
		lblN1.setBounds(10,10,300,30);
		txtN1.setBounds(180,10,100,30);
		lblN3.setBounds(10,50,300,30);
		txtN3.setBounds(180,50,100,30);
		btN1.setBounds(10,100,160,35);
		lblN4.setBounds(10,140,300,30);
		
		o.add(lblN1);
		o.add(txtN1);
		o.add(lblN3);
		o.add(txtN3);
		o.add(btN1);
		o.add(lblN4);
		
		btN1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		float f = b.trianguloiso(Float.parseFloat(txtN1.getText()), Float.parseFloat(txtN3.getText()));
		 //JOptionPane.showMessageDialog(null, f);
		 lblN4.setText(String.format("Resultado: = %.3f", f));		
		
		
	}
	

}
