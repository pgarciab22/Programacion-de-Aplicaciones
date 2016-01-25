import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * 
 * @author Patricia García Baeza
 *
 */
public class InterfazMenuTriangulos extends JFrame implements ActionListener {
	private JLabel lbnElige = new JLabel("Elige una opción");
	private JButton btN1= new JButton("Equilatero");
	private JButton btN2 = new JButton("Escaleno");
	private JButton btN3 = new JButton("Isosceles");
	
	private Container o = getContentPane();
	private Areas b = new Areas ();
	
	public InterfazMenuTriangulos(){
	super.setTitle("Triangulos");	
	super.setSize(260,280);
	super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	cargarControles();	
	}
	
	private void cargarControles() {
		o.setLayout(null);
	lbnElige.setBounds(10,10,300,30);
	btN1.setBounds(10,50,120,35);	
	btN2.setBounds(10,90,120,35);
	btN3.setBounds(10,130,120,35);
	
		o.add(lbnElige);
		o.add(btN1);
		o.add(btN2);
		o.add(btN3);
		
		btN1.addActionListener(this);
		btN2.addActionListener(this);
		btN3.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btN2){
			InterfazTriEscaleno a = new InterfazTriEscaleno();
			a.setVisible(true);
		}
		
	if(e.getSource()==btN1){
		InterfazTriEquilatero b = new InterfazTriEquilatero();
		b.setVisible(true);	
		
	}
		
	if(e.getSource()==btN3){
		InterfazTriIsosceles c = new InterfazTriIsosceles();
		c.setVisible(true);		
	}
		}	
			
}

