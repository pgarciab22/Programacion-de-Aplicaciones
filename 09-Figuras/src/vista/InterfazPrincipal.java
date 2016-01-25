package vista;
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
public class InterfazPrincipal extends JFrame implements ActionListener{
	
	private JLabel lbn1 = new JLabel("Elige una opcion");
	
	private JButton btnCua = new JButton("Cuadrado");
	private JButton btnRec = new JButton("Rectangulo");
	private JButton btnTriangulo = new JButton("Triangulo");
	private JButton btnCirc = new JButton("Circulo");
	
	private Container cont =getContentPane();
	
	public InterfazPrincipal(){
		super.setTitle("FIGURAS");
		super.setSize(260,280);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	private void cargarControles(){
		cont.setLayout(null);
		lbn1.setBounds(10,10,300,30);
		btnCua.setBounds(10,50,120,35);
		btnRec.setBounds(10,90,120,35);
		btnTriangulo.setBounds(10,130,120,35);
		btnCirc.setBounds(10,170,120,35);
		
		cont.add(lbn1);
		cont.add(btnCua);
		cont.add(btnRec);
		cont.add(btnTriangulo);
		cont.add(btnCirc);
		
		
		btnCua.addActionListener(this);
		btnRec.addActionListener(this);
		btnTriangulo.addActionListener(this);
		btnCirc.addActionListener(this);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()== btnCua){
			InterfazCuadrado vtncua = new InterfazCuadrado();
			vtncua.setVisible(true);
		}
		
		if(e.getSource()==btnRec){
			InterfazRectangulo vtnRec = new InterfazRectangulo();
			vtnRec.setVisible(true);
		}
		
		if(e.getSource()==btnCirc){
			InterfazCirculo vtnCir =  new InterfazCirculo();
			vtnCir.setVisible(true);
		}
		
		if ( e.getSource()==btnTriangulo){
			InterfazPrincipalTriangulo vtnPT = new InterfazPrincipalTriangulo();
			vtnPT.setVisible(true);
		}
		
	}
	

}
