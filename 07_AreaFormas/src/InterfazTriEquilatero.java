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
public class InterfazTriEquilatero extends JFrame implements ActionListener {

	private JLabel lblN1 = new JLabel("Ingresa el lado de tu triangulo");
	private JTextField txtN1 = new JTextField();
	private JButton btN1 = new JButton("Sacar Area");
	private JLabel lblN2 = new JLabel("Resultado");
	
	private Container o = getContentPane();
	private Areas b = new Areas();	
	
	public InterfazTriEquilatero(){
		
	super.setTitle("Triangulo Equilatero");
	super.setSize(320,320);
	super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	cargarControles();	
	
	}

	
	private void cargarControles() {
		
		o.setLayout(null);
		lblN1.setBounds(10,10,300,30);
		txtN1.setBounds(10,40,280,30);
		btN1.setBounds(10,100,160,35);
		lblN2.setBounds(10,150,300,30);
		
		o.add(lblN1);
		o.add(txtN1);
		o.add(btN1);
		o.add(lblN2);
		
		btN1.addActionListener(this);
			
	}

	
	public void actionPerformed(ActionEvent e) {
		
	 float f = b.trianguloequi(Float.parseFloat(txtN1.getText()));
	 lblN2.setText(String.format("Resultado: = %.3f", f));	
		
	}

	
}
