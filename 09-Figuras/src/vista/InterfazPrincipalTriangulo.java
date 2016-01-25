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
public class InterfazPrincipalTriangulo extends JFrame implements ActionListener {

private JLabel lbn1 = new JLabel("ELIGE UNA OPCIÓN");
	
	
	private JButton btnEqui = new JButton("Equilatero");
	private JButton btnEscal = new JButton("Escaleno");
	private JButton btnIsose = new JButton("Isoseles");
	
	private Container cont = getContentPane();
	
	public InterfazPrincipalTriangulo(){
		super.setTitle("MENÚ TRIANGULOS");
		super.setSize(260,280);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}
	
	private void cargarControles(){
		cont.setLayout(null);
		lbn1.setBounds(10,10,300,30);
		btnEqui.setBounds(10,50,120,35);
		btnEscal.setBounds(10,90,120,35);
		btnIsose.setBounds(10,130,120,35);
		
		cont.add(lbn1);
		cont.add(btnEqui);
		cont.add(btnEscal);
		cont.add(btnIsose);
		
		btnEqui.addActionListener(this);
		btnEscal.addActionListener(this);
		btnIsose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnEqui){
			InterfazEsquilatero a = new InterfazEsquilatero();
			a.setVisible(true);
		}
		if(e.getSource()==btnEscal){
			InterfazEscaleno esc = new InterfazEscaleno();
			esc.setVisible(true);
		}
		if(e.getSource()==btnIsose){
			InterfazIsosceles isos = new InterfazIsosceles();
			isos.setVisible(true);
		}
		
	}
}
