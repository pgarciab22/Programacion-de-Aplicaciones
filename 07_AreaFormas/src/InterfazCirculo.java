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
public class InterfazCirculo extends JFrame implements ActionListener {

	private JLabel lblN1 = new JLabel("Ingresa el radio del circulo");
	private JTextField txtN1 = new JTextField();
	private JButton btN1 = new JButton("Calcular Area");
	private JLabel lblN2 = new JLabel("Resultado");
	
	private Container o = getContentPane();
	private Areas b = new Areas ();
	
	public InterfazCirculo(){
		
		super.setTitle("Circulo");
		super.setSize(300,300);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();		
	}
	
	private void cargarControles() {
		
		o.setLayout(null);
		lblN1.setBounds(10,10, 200, 35);
		txtN1.setBounds(10,50,150,35);
		btN1.setBounds(10,100,130, 35);
		lblN2.setBounds(10,160, 200, 35);
		
		o.add(lblN1);
		o.add(txtN1);
		o.add(btN1);
		o.add(lblN2);	
		
		btN1.addActionListener(this);	
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		
		 double f = b.circulo(Double.parseDouble(txtN1.getText()));
		 //JOptionPane.showMessageDialog(null, f);
		 lblN2.setText(String.format("Resultado: = %.3f", f));	
			
	}
	

}
