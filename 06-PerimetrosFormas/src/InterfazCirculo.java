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
public class InterfazCirculo extends JFrame implements ActionListener{
	
	private JLabel lbn1 = new JLabel("Ingrese el radio del circulo");
	private JTextField txtN1= new JTextField();
	private JButton btN1 = new JButton("Perimetro");
	private JLabel lbnResultado = new JLabel();
	
	private Container cont = getContentPane();
	private Perimetros d = new Perimetros();
	
	public InterfazCirculo(){
		super.setTitle("Circulo");
		super.setSize(320,320);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	private void cargarControles(){
		cont.setLayout(null);
	
		lbn1.setBounds(10,30,300,30);
		txtN1.setBounds(10,63,100,30);
		btN1.setBounds(10,99,120,35);
		lbnResultado.setBounds(10,140,200,30);
		
		cont.add(lbn1);
		cont.add(txtN1);
		cont.add(btN1);
		cont.add(lbnResultado);
		btN1.addActionListener(this);
		
	}

	@Override

	public void actionPerformed(ActionEvent arg0) {
		
		double f = d.circulo(Double.parseDouble(txtN1.getText()));
		lbnResultado.setText(String.format("Resultado: =%.1f",f));
		
	}
}
