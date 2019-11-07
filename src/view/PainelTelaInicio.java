package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Sprite;

public class PainelTelaInicio extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	BufferedImage img;
	Graphics2D g;
	Sprite personagem1, personagem2, personagem3, personagem4, personagem5;
	Sprite pokemon1, pokemon2, pokemon3;
	
	public PainelTelaInicio() {
		img = new BufferedImage(774, 513, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) img.getGraphics();

		try {
			img = ImageIO.read(getClass().getClassLoader().getResourceAsStream("TelaInicio.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			personagem1 = new Sprite("Chars.png", 0, 32, 32, 3, 2, 100, 150);
			personagem2 = new Sprite("Chars.png", 1, 32, 32, 3, 2, 100, 190);
			personagem3 = new Sprite("Chars.png", 2, 32, 32, 3, 2, 100, 230);
			personagem4 = new Sprite("Chars.png", 3, 32, 32, 3, 2, 100, 270);
			personagem5 = new Sprite("Chars.png", 4, 32, 32, 3, 2, 100, 310);

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
		g.fillRect(0, 0, 200, 513);
		
		g.setColor(new Color(255, 127, 39, 210));
		g.fillRect(574, 0, 200, 513);
		
		g.setColor(new Color(0, 162, 232));
		g.fillRoundRect(624, 100, 90, 30, 20, 20);
		g.fillRoundRect(624, 150, 90, 30, 20, 20);
		g.fillRoundRect(624, 200, 90, 30, 20, 20);
		g.fillRoundRect(624, 250, 90, 30, 20, 20);
		g.fillRoundRect(624, 300, 90, 30, 20, 20);		
		
		g.setColor(Color.BLACK);
		g.drawRoundRect(624, 100, 90, 30, 20, 20);
		g.drawRoundRect(625, 100, 90, 30, 20, 20);
		
		g.drawRoundRect(624, 150, 90, 30, 20, 20);
		g.drawRoundRect(625, 150, 90, 30, 20, 20);
		
		g.drawRoundRect(624, 200, 90, 30, 20, 20);
		g.drawRoundRect(625, 200, 90, 30, 20, 20);

		g.drawRoundRect(624, 250, 90, 30, 20, 20);
		g.drawRoundRect(625, 250, 90, 30, 20, 20);
		
		g.drawRoundRect(624, 300, 90, 30, 20, 20);
		g.drawRoundRect(625, 300, 90, 30, 20, 20);
				
		g.drawImage(personagem1.sprites[personagem1.aparencia], personagem1.posX, personagem1.posY, null);
		g.drawImage(personagem2.sprites[personagem2.aparencia], personagem2.posX, personagem2.posY, null);
		g.drawImage(personagem3.sprites[personagem3.aparencia], personagem3.posX, personagem3.posY, null);
		g.drawImage(personagem4.sprites[personagem4.aparencia], personagem4.posX, personagem4.posY, null);
		g.drawImage(personagem5.sprites[personagem5.aparencia], personagem5.posX, personagem5.posY, null);
		
		g.setColor(Color.black);
		g.drawRect(0, 0, 773, 512);
		} 

}
