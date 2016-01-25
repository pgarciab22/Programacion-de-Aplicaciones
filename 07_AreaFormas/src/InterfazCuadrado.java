import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class InterfazCuadrado extends JFrame implements ActionListener {
	private JLabel lbl1 = new JLabel("Ingresa número");
	private JTextField txtN1 = new JTextField();
	private JButton btNCalcular = new JButton("Sacar area");
	private JLabel lbl2 = new JLabel("Resultado");
	
	private Container o = getContentPane();
	private Areas b = new Areas (); 
	
	
	public InterfazCuadrado(){
	
	super.setTitle("CUADRADO");
	super.setSize(320,320);
	super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	cargarControles();	
		
	}
	

	private void cargarControles() {
		o.setLayout(null);
		lbl1.setBounds(10,10,300,30);
		txtN1.setBounds(10,40,280,30);
		btNCalcular.setBounds(10,100,160,35);
		lbl2.setBounds(10,150,300,30);
		
		o.add(lbl1);
		o.add(txtN1);
		o.add(btNCalcular);
		o.add(lbl2);
		
		btNCalcular.addActionListener(this);
			
	}


	public void actionPerformed(ActionEvent e) {
		
	 float f = b.cuadrado(Float.parseFloat(txtN1.getText()));
	 //JOptionPane.showMessageDialog(null, f);
	 lbl2.setText(String.format("Resultado: = %.3f", f));	
			}
	

}
