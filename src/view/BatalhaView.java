package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import controller.BatalhaController;
import model.BatalhaModel;
import model.Caculacao;

public class BatalhaView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static BatalhaView instance;
	
	public static BatalhaView getInstance() {
		if(instance == null)
			instance = new BatalhaView();
		return instance;
	}
	
	BatalhaModel batalhaModel = new BatalhaModel(this);
	BatalhaController batalhaController = new BatalhaController(this, batalhaModel);
	BatalhaPanel batalhaPanel = new BatalhaPanel(this, batalhaModel);
	
	private static boolean ativo = true;
	
	Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
		
	private JTextField respostaField;
	private Font fontTempo, fontEquacao;
	private JProgressBar sangue;
		
	private ImageIcon paletadefundo;

	private BatalhaView() {
		super("Batalha");

		setSize(400, 500);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		addWindowListener(batalhaController);
		setUndecorated(true);

		fontTempo = new Font("verdana", Font.BOLD, 12);
		fontEquacao = new Font("verdana", Font.BOLD, 32);

		switch (JogoView.fase) {
		case 1:
			Caculacao.calcular();
			break;
		case 2:
			Caculacao.calcular2();
			break;
		case 3:
			Caculacao.calcular3();
			break;

		default:
			break;
		}

		batalhaModel.pokemon();

		try {
			paletadefundo = new ImageIcon(ImageIO.read(getClass().getClassLoader().getResourceAsStream("batalha.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		respostaField = new JTextField(10);
		sangue = new JProgressBar();

		add(respostaField);
		respostaField.setFont(new Font("verdana", Font.BOLD, 32));
		respostaField.setBounds(getWidth() / 2 - 56, 400, 100, 42);
		batalhaPanel.setIgnoreRepaint(true);

		add(sangue);
		switch (JogoView.fase) {
		case 1:
			sangue.setMinimum(0);
			sangue.setMaximum(130);
			sangue.setValue(130);
			break;
		case 2:
			sangue.setMinimum(0);
			sangue.setMaximum(160);
			sangue.setValue(160);
			break;
		case 3:
			sangue.setMinimum(0);
			sangue.setMaximum(3000);
			sangue.setValue(3000);
			break;

		}

		sangue.setBounds((getWidth() / 2) - 56, 200, 100, 20);
		sangue.setForeground(Color.RED);
		sangue.setBackground(Color.DARK_GRAY);

		add(batalhaPanel);
		batalhaPanel.setBounds(0, 0, getWidth(), getHeight());
		setVisible(true);

		BatalhaModel.getSom().getSom().loop();

		batalhaController.TecladoBatalha();
		batalhaModel.Animacao();

	}

	public JTextField getRespostaField() {
		return respostaField;
	}

	public Font getFontTempo() {
		return fontTempo;
	}

	public Font getFontEquacao() {
		return fontEquacao;
	}

	public JProgressBar getSangue() {
		return sangue;
	}

	public static void setInstance(BatalhaView instance) {
		BatalhaView.instance = instance;
	}

	public static void setAtivo(boolean ativo) {
		BatalhaView.ativo = ativo;
	}

	public static boolean isAtivo() {
		return ativo;
	}

	public ImageIcon getPaletadefundo() {
		return paletadefundo;
	}

}
