package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PainelFaseView extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BufferedImage img;
	Graphics2D g;

	public PainelFaseView() {
		img = new BufferedImage(774, 513, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) img.getGraphics();

		try {
			img = ImageIO.read(getClass().getClassLoader().getResourceAsStream("TelaInicio.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setBackground(Color.orange);

		setVisible(false);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(img, getX(), getY(), null);

		g.setColor(new Color(0, 162, 232, 210));
		g.fillRect(300, 50, 420, 375);
		
		g.setColor(new Color(255, 127, 39, 210));
		g.fillRect(50, 50, 200, 375);


		g.setColor(new Color(0, 162, 232));
		g.fillRoundRect(104, 250, 90, 30, 20, 20);
		g.fillRoundRect(104, 350, 90, 30, 20, 20);

		g.setColor(Color.BLACK);

		g.drawRoundRect(104, 250, 90, 30, 20, 20);
		g.drawRoundRect(105, 250, 90, 30, 20, 20);

		g.drawRoundRect(104, 350, 90, 30, 20, 20);
		g.drawRoundRect(105, 350, 90, 30, 20, 20);

		g.setColor(Color.black);
		g.drawRect(0, 0, 773, 512);
	}

}
