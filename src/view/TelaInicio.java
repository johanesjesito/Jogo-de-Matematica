package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Som;

public class TelaInicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PainelTelaInicio telaInicio;
	
	private static Som som = new Som("Intro.wav");
	
	private	JButton iniciar, ajuda, creditos, rank, sair;
	private JLabel labelJogador;
	private static JTextField nomeJogador;
	private JRadioButton perso1, perso2, perso3, perso4, perso5;
	private ButtonGroup group;
	
	public TelaInicio(PainelTelaInicio telaInicio) {
		super("Pokemon");
		this.telaInicio = telaInicio;

		iniciar = new JButton("Jogar");
		ajuda = new JButton("Ajuda");
		creditos = new JButton("Créditos");
		rank = new JButton("Rank");
		sair = new JButton("Sair");
		labelJogador = new JLabel("Jogador:");
		nomeJogador = new JTextField(100);
		perso1 = new JRadioButton();
		perso2 = new JRadioButton();
		perso3 = new JRadioButton();
		perso4 = new JRadioButton();
		perso5 = new JRadioButton();

		group = new ButtonGroup();
		group.add(perso1);
		group.add(perso2);
		group.add(perso3);
		group.add(perso4);
		group.add(perso5);

		labelJogador.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 20));
		labelJogador.setForeground(Color.WHITE);
		labelJogador.setBounds(60, 70, 100, 20);

		nomeJogador.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
		nomeJogador.setBounds(59, 100, 80, 20);

		botoesEfeite(iniciar);
		botoesEfeite(ajuda);
		botoesEfeite(creditos);
		botoesEfeite(rank);
		botoesEfeite(sair);
		
		perso1.setContentAreaFilled(false);
		perso2.setContentAreaFilled(false);
		perso3.setContentAreaFilled(false);
		perso4.setContentAreaFilled(false);
		perso5.setContentAreaFilled(false);

		perso1.setSelected(true);

		setSize(774, 513);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);

		add(labelJogador);
		add(nomeJogador);
		add(iniciar).setBounds(624, 100, 90, 30);
		add(ajuda).setBounds(624, 150, 90, 30);
		add(creditos).setBounds(624, 200, 90, 30);
		add(rank).setBounds(624, 250, 90, 30);
		add(sair).setBounds(624, 300, 90, 30);
		add(perso1).setBounds(80, 160, 20, 20);
		add(perso2).setBounds(80, 200, 20, 20);
		add(perso3).setBounds(80, 240, 20, 20);
		add(perso4).setBounds(80, 280, 20, 20);
		add(perso5).setBounds(80, 320, 20, 20);

		add(telaInicio);
		telaInicio.setBounds(0, 0, getWidth(), getHeight());
		telaInicio.setVisible(true);

		som.getSom().loop();
		setVisible(true);

	}
	
	public void botoesEfeite(JButton button){
		button.setContentAreaFilled(false);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("Arial", Font.BOLD, 15));
		button.setForeground(Color.WHITE);
		button.setBorderPainted(false);
		button.setBorder(BorderFactory.createEtchedBorder(1));
	}

	public static JTextField getNomeJogador() {
		return nomeJogador;
	}

	public PainelTelaInicio getTelaInicio() {
		return telaInicio;
	}

	public JButton getIniciar() {
		return iniciar;
	}

	public JButton getAjuda() {
		return ajuda;
	}

	public JButton getCreditos() {
		return creditos;
	}

	public JButton getSair() {
		return sair;
	}

	public static Som getSom() {
		return som;
	}

	public JRadioButton getPerso1() {
		return perso1;
	}

	public JRadioButton getPerso2() {
		return perso2;
	}

	public JRadioButton getPerso3() {
		return perso3;
	}

	public JRadioButton getPerso4() {
		return perso4;
	}

	public JRadioButton getPerso5() {
		return perso5;
	}

	public JButton getRank() {
		return rank;
	}
	
}
