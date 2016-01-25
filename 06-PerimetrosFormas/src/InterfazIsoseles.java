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
public class InterfazIsoseles extends JFrame implements ActionListener {

	private JLabel lbn1 = new JLabel("Ingresa el tamaño de la base");
	private JTextField txtBase = new JTextField();
	private JLabel lbn2 = new JLabel("Ingresa el tamaño del lado");
	private JTextField txtlado1 = new JTextField();
	private JButton btnResultado = new JButton("Sacar Perimetro");
	private JLabel lbnResultado = new JLabel("Resultado");
	
	private Container cont = getContentPane();
	private Perimetros p = new Perimetros();
	
	InterfazIsoseles(){
		super.setTitle("RECTANGULO");
		super.setSize(400,300);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	public void cargarControles(){
		cont.setLayout(null);
		lbn1.setBounds(10,10,300,30);
		txtBase.setBounds(180,10,100,30);
		lbn2.setBounds(10,50,300,30);
		txtlado1.setBounds(180,50,100,30);
		btnResultado.setBounds(10,100,160,35);
		lbnResultado.setBounds(10,140,300,30);
		
		cont.add(lbn1);
		cont.add(txtBase);
		cont.add(lbn2);
		cont.add(txtlado1);
		cont.add(btnResultado);
		cont.add(lbnResultado);
		btnResultado.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		float reiso = p.isoseles(Float.parseFloat(txtBase.getText()), Float.parseFloat(txtlado1.getText()));
		lbnResultado.setText(String.format("Resultado: = %.3f",reiso));
		
	}
}
