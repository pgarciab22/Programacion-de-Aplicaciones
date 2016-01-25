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
public class InterfazEsquilatero extends JFrame implements ActionListener {
	
	private JLabel lbn1 = new JLabel("Ingresa el tamaño de tu triangulo");
	private JTextField txtN1 = new JTextField();
	private JButton btnResultado = new JButton("Sacar Perimetro");
	private JLabel lbnResultado = new JLabel("Resultado");
	
	private Container cont = getContentPane();
	private Perimetros p = new Perimetros();

	public InterfazEsquilatero(){
		
		super.setTitle("EQUILATERO");
		super.setSize(320,320);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
		
	}
	
	private void cargarControles(){
		cont.setLayout(null);
		
		lbn1.setBounds(10,10,300,30);
		txtN1.setBounds(10,40,280,30);
		btnResultado.setBounds(10,100,160,35);
		lbnResultado.setBounds(10,150,300,30);
		
		cont.add(lbn1);
		cont.add(txtN1);
		cont.add(btnResultado);
		cont.add(lbnResultado);
		btnResultado.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		float reequi = p.equilatero(Float.parseFloat(txtN1.getText()));
		lbnResultado.setText(String.format("Resultado: = %.3f",reequi));
	}
	
}
