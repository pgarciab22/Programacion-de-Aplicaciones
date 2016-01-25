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
public class InterfazRectangulo extends JFrame implements ActionListener{

	private JLabel lbl1 = new JLabel("Ingresa el valor de la base");
	private JTextField txtN1 = new JTextField();
	private JLabel lbl2 = new JLabel("Ingresa el valor de la altura");
	private JTextField txtN2 = new JTextField();
	private JButton btN1 = new JButton("Sacar area");
	private JLabel lbl3 = new  JLabel("Resultado");
	
	 private Container o = getContentPane();
	 private Areas b = new Areas();
	 
	 public InterfazRectangulo(){
		 
	super.setTitle("Rectangulo");
	super.setSize(400,300);
	super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	cargarControles();
		 	 
	 }
	
	private void cargarControles() {
		
		o.setLayout(null);
		lbl1.setBounds(10,10,300,30);
		txtN1.setBounds(180,10,100,30);
		lbl2.setBounds(10,50,300,30);
		txtN2.setBounds(180,50,100,30);
		btN1.setBounds(10,100,160,35);
		lbl3.setBounds(10,140,300,30);
		
		o.add(lbl1);
		o.add(txtN1);
		o.add(lbl2);
		o.add(txtN2);
		o.add(btN1);
		o.add(lbl3);	
		btN1.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		
		 float f = b.rectangulo(Float.parseFloat(txtN1.getText()), Float.parseFloat(txtN2.getText()));
		 //JOptionPane.showMessageDialog(null, f);
		 lbl3.setText(String.format("Resultado: = %.3f", f));		
		
			
	}
	

}
