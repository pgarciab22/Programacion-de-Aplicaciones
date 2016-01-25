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
 * @author Patricia Garc�a Baeza
 *
 */
public class InterfazEscaleno extends JFrame implements ActionListener {

	private JLabel lbn1 = new JLabel("Ingresa el tama�o del 1er. lado");
	private JTextField txtlado1 = new JTextField();
	private JLabel lbn2 = new JLabel("Ingresa el tama�o del 2do. lado");
	private JTextField txtlado2 = new JTextField();
	private JLabel lbn3 = new JLabel("Ingresa el tama�o del 3er. lado");
	private JTextField txtlado3 = new JTextField();
	
	private JButton btnResultado = new JButton("Sacar Perimetro");
	private JLabel lbnResultado = new JLabel("Resultado");
	
	private Container cont = getContentPane();
	private Perimetros p = new Perimetros();
	
	public InterfazEscaleno(){
		super.setTitle("ESCALENO");
		super.setSize(400,300);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	private void cargarControles(){
		cont.setLayout(null);
		
		lbn1.setBounds(10,10,300,30);
		txtlado1.setBounds(195,10,100,30);
		lbn2.setBounds(10,50,300,30);
		txtlado2.setBounds(195,50,100,30);
		lbn3.setBounds(10,100,300,30);
		txtlado3.setBounds(195,100,100,30);
		btnResultado.setBounds(10,140,160,35);
		lbnResultado.setBounds(10,180,300,30);
		
		cont.add(lbn1);
		cont.add(txtlado1);
		cont.add(lbn2);
		cont.add(txtlado2);
		cont.add(lbn3);
		cont.add(txtlado3);
		cont.add(btnResultado);
		cont.add(lbnResultado);
		btnResultado.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		float reesca = p.escaleno(Float.parseFloat(txtlado1.getText()),Float.parseFloat(txtlado2.getText()),Float.parseFloat(txtlado3.getText()));
		lbnResultado.setText(String.format("Resultado: = %.3f",reesca));
		
	}
}
