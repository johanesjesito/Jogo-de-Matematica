package view;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagem {
			
	public static void exibir(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
	
	public static int confirmacao(String text1, String text2) {
		return JOptionPane.showConfirmDialog(null, text1, text2, JOptionPane.YES_OPTION);
	}

	public void imagem(String texto ,String imagem) {
		
			try {
				ImageIcon imagem2 = new ImageIcon(ImageIO.read(getClass().getClassLoader().getResourceAsStream(imagem)));
				JOptionPane.showMessageDialog(
				          null,
				          null,
				          texto, JOptionPane.INFORMATION_MESSAGE,
				           imagem2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
