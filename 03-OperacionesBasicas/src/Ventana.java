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
public class Ventana extends JFrame implements ActionListener{ 
	/**
	 * Clase en donde se establecen las caracteristicas de la interfaz
	 */
	
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbn1 = new JLabel("Numero 1");
	private JLabel lbn2 = new JLabel("Numero 2");
	private JLabel lbnResultado = new JLabel("Resultado"); 
	
	private JButton btnCalcular = new JButton("Calcular");
	private Container c = getContentPane();
	
	private Operaciones op = new Operaciones();

	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(320,480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		cargarControles(); //manda a llamar el metodo cargar controles
	}
/**
 *  Método en donde se cargan y ubican los controles en la interfaz
 */
	private void cargarControles() {  //cargar todo los controles
		// TODO Auto-generated method stub
		c.setLayout(null); //null para decidir como poner tus controles
		
		lbn1.setBounds(10, 10,300,30);
		txtN1.setBounds(10, 40,280, 30);
		
		lbn2.setBounds(10, 80, 300, 30);
		txtN2.setBounds(10, 110,280, 30);
		
		btnCalcular.setBounds(10, 150,280, 35);
		
		lbnResultado.setBounds(10, 190, 300, 30);
		
		c.add(lbn1);
		c.add(txtN1);
		c.add(lbn2);
		c.add(txtN2);
		c.add(btnCalcular);
		c.add(lbnResultado);
		btnCalcular.addActionListener(this);
		
	}
/**
 * Método en donde se mandan los resultados a la interfaz
 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int r = op.sumar(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
		lbnResultado.setText(String.format("%s + %s = %d",
				txtN1.getText(),
				txtN2.getText(),
				r));		
		// %s string
		// %d decimal
	}

}
