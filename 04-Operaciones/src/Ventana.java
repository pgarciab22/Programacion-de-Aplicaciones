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
public class Ventana extends JFrame implements ActionListener{
	
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbn1 = new JLabel("Numero 1");
	private JLabel lbn2 = new JLabel("Numero 2");
	private JLabel lbnResultado = new JLabel("Resultado");
	
	private JButton btnSuma = new JButton("+");
	private JButton btnResta = new JButton("-");
	private JButton btnMulti = new JButton("*");
	private JButton btnDivir = new JButton("/");
	
	private Container c = getContentPane();
	
	private Operaciones op = new Operaciones();
	
	public Ventana(){
		super.setTitle("OPERACIONES");
		super.setSize(320,480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();	
	}
	
	private void cargarControles(){
		c.setLayout(null);
		
		lbn1.setBounds(10,10,300,30);
		txtN1.setBounds(10,40,280,30);
		
		lbn2.setBounds(10,80,300,30);
		txtN2.setBounds(10,110,280,30);
		
		btnSuma.setBounds(10,150,60,35);
		btnResta.setBounds(80,150,60,35);
		btnMulti.setBounds(150,150,60,35);
		btnDivir.setBounds(220,150,60,35);
		
		lbnResultado.setBounds(10,200,300,30);
		
		btnSuma.addActionListener(this);
		btnResta.addActionListener(this);
		btnMulti.addActionListener(this);
		btnDivir.addActionListener(this);
		
		c.add(lbn1);
		c.add(txtN1);
		c.add(lbn2);
		c.add(txtN2);
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMulti);
		c.add(btnDivir);
		c.add(lbnResultado);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSuma){
			int resum = op.sumar(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
			lbnResultado.setText(String.format("%s + %s = %d", 
					txtN1.getText(),
					txtN2.getText(),
					resum));
		}
		
		if (e.getSource()==btnResta) {
			int rerest = op.restar(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
			lbnResultado.setText(String.format("%s - %s = %d",
					txtN1.getText(),
					txtN2.getText(),
					rerest));
		}
		
		if (e.getSource()==btnMulti) {
			
			int remult = op.multiplica(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
			lbnResultado.setText(String.format("%s * %s = %d",
					txtN1.getText(),
					txtN2.getText(),
					remult));	
		}
		
		if (e.getSource()==btnDivir) {
			int rediv = op.divide(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
			lbnResultado.setText(String.format("%s / %s = %d",
					txtN1.getText(),
					txtN2.getText(),
					rediv));	
		}		
	}	
}
