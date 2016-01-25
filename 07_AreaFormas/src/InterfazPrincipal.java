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
public class InterfazPrincipal extends JFrame implements ActionListener {

	private JLabel lbn1 = new JLabel("ELIGE UNA OPCIÓN");
	private JButton btN1 = new JButton("Cuadrado");
	private JButton btN2 = new JButton("Rectangulo");
	private JButton btN3 = new JButton("Triangulo");
	private JButton btN4 = new JButton("Circulo");
	
	private Container o = getContentPane(); 
	
	

	public InterfazPrincipal(){
		
	super.setTitle("AREAS DE FIGURAS GEOMETRICAS");
	super.setSize(500,280);
	super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	cargarContorles(); 
	}
	
	private void cargarContorles() {
		
	o.setLayout(null);
	lbn1.setBounds(10,40,300,30);
	btN1.setBounds(10,100,100, 35);
	btN2.setBounds(120,100,100,35);
	btN3.setBounds(240,100,100, 35);
	btN4.setBounds(360,100,100, 35);
	
	o.add(lbn1);
	o.add(btN1);
	o.add(btN2);
	o.add(btN3);
	o.add(btN4);
	
	btN1.addActionListener(this);
	btN2.addActionListener(this);
	btN3.addActionListener(this);
	btN4.addActionListener(this);	
	
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btN1){
			InterfazCuadrado vcua = new InterfazCuadrado();
			vcua.setVisible(true);		
		}
		
		if(e.getSource()==btN4){
		InterfazCirculo vnc= new InterfazCirculo();
		vnc.setVisible(true); 
		}
		
		
		if(e.getSource()==btN2){
			InterfazRectangulo vtn = new InterfazRectangulo();
			vtn.setVisible(true);		
		}
		
		if(e.getSource()==btN3){
			InterfazMenuTriangulos vtt = new InterfazMenuTriangulos();
			vtt.setVisible(true);		
		}
		
		
	}
	
	
}
