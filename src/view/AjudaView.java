package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AjudaView extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1, label2, label3, label4, label5, label6;
	private ImageIcon imagem1, imagem2, imagem3, imagem4, imagem5, imagem6;
	private JButton proximo, anterior, voltar;
	
	public AjudaView() {
		
		imagem1 = new ImageIcon(getClass().getClassLoader().getResource("ajudabotões.png"));
		imagem2 = new ImageIcon(getClass().getClassLoader().getResource("ajudaInventario.png"));
		imagem3 = new ImageIcon(getClass().getClassLoader().getResource("ajudaBatalha.png"));
		imagem4 = new ImageIcon(getClass().getClassLoader().getResource("telaLocalizaPokemon.png"));
		imagem5 = new ImageIcon(getClass().getClassLoader().getResource("tempo.png"));
		imagem6 = new ImageIcon(getClass().getClassLoader().getResource("pontos.png"));
		
		label1 = new JLabel(imagem1);
		label2 = new JLabel(imagem2);
		label3 = new JLabel(imagem3);
		label4 = new JLabel(imagem4);
		label5 = new JLabel(imagem5);
		label6 = new JLabel(imagem6);
		
		proximo = new JButton("Proximo");
		anterior = new JButton("Anterior");
		voltar = new JButton("Tela Inicial");
		
		label1.setBounds(0, 0, 600, 500);
		label2.setBounds(0, 0, 600, 500);
		label3.setBounds(0, 0, 600, 500);
		label4.setBounds(0, 0, 600, 500);
		label5.setBounds(0, 0, 600, 500);
		label6.setBounds(0, 0, 600, 500);
		
		proximo.setBounds(300, 530, 90, 30);
		anterior.setBounds(200, 530, 90, 30);
		voltar.setBounds(490, 530, 100, 30);
		
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		add(label1).setVisible(true);
		add(label2).setVisible(false);
		add(label3).setVisible(false);
		add(label4).setVisible(false);
		add(label5).setVisible(false);
		add(label6).setVisible(false);
		
		add(proximo);
		add(anterior);
		add(voltar);
		
		setVisible(true);
	}
	

	public JLabel getLabel1() {
		return label1;
	}



	public JLabel getLabel2() {
		return label2;
	}



	public JLabel getLabel3() {
		return label3;
	}



	public JLabel getLabel4() {
		return label4;
	}



	public JLabel getLabel5() {
		return label5;
	}



	public JLabel getLabel6() {
		return label6;
	}



	public JButton getProximo() {
		return proximo;
	}



	public JButton getAnterior() {
		return anterior;
	}



	public JButton getVoltar() {
		return voltar;
	}

}
