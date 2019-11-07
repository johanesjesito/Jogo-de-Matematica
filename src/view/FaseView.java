package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class FaseView extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private	static JRadioButton fase1, fase2, fase3;
	private JButton jogar, voltar;
	private JLabel fase1Label, fase2Label, fase3Label;
	PainelFaseView faseView;
	ButtonGroup buttonGroup;

	public FaseView(PainelFaseView faseView) {
		this.faseView = faseView;
		
		fase1Label = new JLabel("Quatro Operações(+,-,x,/)");
		fase2Label = new JLabel("Raiz Quadrada(√4 = 2)");
		fase3Label = new JLabel("expoente(2(base) ^ 3(expoente) = 8)");
		
		fase1 = new JRadioButton("Fase 1");
		fase2 = new JRadioButton("Fase 2");
		fase3 = new JRadioButton("Fase 3");
		jogar = new JButton("Jogar");
		voltar = new JButton("Voltar");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(fase1);
		buttonGroup.add(fase2);
		buttonGroup.add(fase3);
		
		fase1Label.setFont(new Font("Arial", Font.BOLD, 14));
		fase1Label.setForeground(Color.BLACK);
		fase1Label.setBounds(310, 100, 190, 30);
		
		fase2Label.setFont(new Font("Arial", Font.BOLD, 14));
		fase2Label.setForeground(Color.BLACK);
		fase2Label.setBounds(310, 150, 190, 30);
		
		fase3Label.setFont(new Font("Arial", Font.BOLD, 14));
		fase3Label.setForeground(Color.BLACK);
		fase3Label.setBounds(310, 200, 290, 30);
		
		fase1.setFont(new Font("Arial", Font.BOLD, 14));
		fase1.setForeground(Color.BLACK);
		fase1.setBounds(104, 100, 90, 30);
		fase2.setFont(new Font("Arial", Font.BOLD, 14));
		fase2.setForeground(Color.BLACK);
		fase2.setBounds(104, 150, 90, 30);
		fase3.setFont(new Font("Arial", Font.BOLD, 14));
		fase3.setForeground(Color.BLACK);
		fase3.setBounds(104, 200, 90, 30);
		
		fase1.setContentAreaFilled(false);
		fase2.setContentAreaFilled(false);
		fase3.setContentAreaFilled(false);
		
		fase1.setSelected(true);
		
		jogar.setBounds(104, 250, 90, 30);
		voltar.setBounds(104, 350, 90, 30);
		
		botoesEfeite(jogar);
		botoesEfeite(voltar);
		
		setSize(774, 513);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);

		add(fase1Label);
		add(fase2Label);
		add(fase3Label);
		add(fase1);
		add(fase2);
		add(fase3);
		add(jogar);
		add(voltar);
		
		add(faseView);
		faseView.setBounds(0, 0, getWidth(), getHeight());
		faseView.setVisible(true);
		
		setVisible(true);
	}
	
	public void botoesEfeite(JButton button){
		button.setContentAreaFilled(false);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("Arial", Font.BOLD, 15));
		button.setForeground(Color.BLACK);
		button.setBorderPainted(false);
		button.setBorder(BorderFactory.createEtchedBorder(1));
	}

	public static JRadioButton getFase1() {
		return fase1;
	}

	public static JRadioButton getFase2() {
		return fase2;
	}

	public static JRadioButton getFase3() {
		return fase3;
	}

	public JButton getJogar() {
		return jogar;
	}

	public JButton getVoltar() {
		return voltar;
	}

}
