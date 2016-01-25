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
public class InterfazRectangulo extends JFrame implements ActionListener {

	private JLabel lbn1 = new JLabel("Ingresa el tamaño de la base");
	private JTextField txtBase = new JTextField();
	private JLabel lbn2 = new JLabel("Ingresa el tamaño de la altura");
	private JTextField txtAltura = new JTextField();
	private JButton btnResultado = new JButton("Sacar Perimetro");
	private JLabel lbnResultado = new JLabel("Resultado");
	
	private Container cont = getContentPane();
	private Perimetros p = new Perimetros();
	
	public InterfazRectangulo(){
		super.setTitle("RECTANGULO");
		super.setSize(400,300);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	private void cargarControles(){
		cont.setLayout(null);
		
		lbn1.setBounds(10,10,300,30);
		txtBase.setBounds(180,10,100,30);
		lbn2.setBounds(10,50,300,30);
		txtAltura.setBounds(180,50,100,30);
		btnResultado.setBounds(10,100,160,35);
		lbnResultado.setBounds(10,140,300,30);
		
		cont.add(lbn1);
		cont.add(txtBase);
		cont.add(lbn2);
		cont.add(txtAltura);
		cont.add(btnResultado);
		cont.add(lbnResultado);
		btnResultado.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	  float rerec = p.rectangulo(Float.parseFloat(txtBase.getText()),Float.parseFloat(txtAltura.getText()));
	  lbnResultado.setText(String.format("Resultado: = %.3f",rerec));
	}
}
