package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import model.JogoModel;

public class JogoView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();

	InvetarioPanel invetarioPanel = new InvetarioPanel();
	public static JogoPanel jogoPanel = new JogoPanel();
				
	public static int pontos, pontosTotal;
	public static int fase;
	public static int pokemon1, pokemon2, pokemon3, pokemon4;

	public JogoView() {
		super("Safari");

		setSize(600, 500);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(invetarioPanel);
		add(jogoPanel);

		jogoPanel.personagens();
		
		if(FaseView.getFase1().isSelected()) {
			jogoPanel.fase1();
		}
		else if(FaseView.getFase2().isSelected()) {
			jogoPanel.fase2();
		}
		else {
			jogoPanel.fase3();
		}

		jogoPanel.setBounds(0, 0, getWidth(), getHeight());

		invetarioPanel.setBounds(400, 0, 600, 500);
		invetarioPanel.setVisible(true);

		JogoModel.getSom().getSom().loop();

		setVisible(true);

	}
	
	public JogoPanel getJogoPanel() {
		return jogoPanel;
	}

	public InvetarioPanel getInvetarioPanel() {
		return invetarioPanel;
	}

}
