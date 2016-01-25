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
	
	
	private JButton btnCua = new JButton("Cuadrado");
	private JButton btnRect = new JButton("Rectangulo");
	private JButton btnTria = new JButton("Triangulo");
	private JButton btnCirc = new JButton("Circulo");
	
	private Container cont = getContentPane();
	
	public InterfazPrincipal(){
		super.setTitle("PERIMETRO DE FIGURAS GEOMETRICAS");
		super.setSize(320,350);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	
	private void cargarControles(){
		cont.setLayout(null);
		 lbn1.setBounds(10,10,300,30);
		 btnCua.setBounds(10,100,100,35);
		 btnRect.setBounds(70,150,100,35);
		 btnTria.setBounds(120,200,100,35);
		 btnCirc.setBounds(190,250,100,35);
		 
		 cont.add(lbn1);
		 cont.add(btnCua);
		 cont.add(btnRect);
		 cont.add(btnTria);
		 cont.add(btnCirc);
		 
		 btnCua.addActionListener(this);
		 btnRect.addActionListener(this);
		 btnTria.addActionListener(this);
		 btnCirc.addActionListener(this);
		 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btnCua){
			InterfazCuadrado vtncua = new InterfazCuadrado();
			vtncua.setVisible(true);
		}
		if(e.getSource()== btnRect){
			InterfazRectangulo vtnrec = new InterfazRectangulo();
			vtnrec.setVisible(true);
		}
		if(e.getSource()==btnTria){
			InterfazPrincipalTriangulo vtntri = new InterfazPrincipalTriangulo();
			vtntri.setVisible(true);
		}
		if (e.getSource()==btnCirc){
			InterfazCirculo vtnCirc = new InterfazCirculo();
			vtnCirc.setVisible(true);
		}
		
	}
	
	
	
}
