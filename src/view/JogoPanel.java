package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JPanel;

import model.Camada;
import model.Sprite;

public class JogoPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Camada camada1, camada2, camada3, camada4, camada5, camada6, camada7;

	private Sprite personagem;
	private static int escolherPersonagem;
	private BufferedImage tela;
	
	JogoView jogoView;
	private int camerax,cameray;
	
	public void personagens() {

		try {

			switch (escolherPersonagem) {
			case 1:
				personagem = new Sprite("spriteneguin.png", 1, 32, 32, 3, 4, 950, 700);
				break;
			case 2:
				personagem = new Sprite("spriteneguinha.png", 1, 32, 32, 3, 4, 950, 700);
				break;
			case 3:
				personagem = new Sprite("palhaco.png", 1, 32, 32, 3, 4, 950, 700);
				break;
			case 4:
				personagem = new Sprite("guarda.png", 1, 32, 32, 3, 4, 950, 700);
				break;
			case 5:
				personagem = new Sprite("Ryu.png", 1, 32, 32, 3, 4, 950, 700);
				break;
			case 6:
				personagem = new Sprite("Pikachu.png", 1, 32, 32, 3, 4, 950, 700);
				break;

			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi possível carregar a Sprite");
		}

	}
	
	public void fase1() {
		camada1 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada1.txt");
		camada2 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada2.txt");
		camada3 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada3.txt");
		camada4 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada4.txt");
		camada5 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada5.txt");
		camada6 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada6.txt");
		camada7 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada7.txt");

		camada1.montarMapa(1312, 960);
		camada2.montarMapa(1312, 960);
		camada3.montarMapa(1312, 960);
		camada4.montarMapa(1312, 960);
		camada5.montarMapa(1312, 960);
		camada6.montarMapa(1312, 960);
		camada7.montarMapa(1312, 960);

	}
	
	public void fase2() {

		camada1 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada8.txt");
		camada2 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada9.txt");
		camada3 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada10.txt");
		camada4 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada11.txt");
		camada5 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada12.txt");
		camada6 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada13.txt");
		camada7 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada14.txt");

		camada1.montarMapa(1312, 960);
		camada2.montarMapa(1312, 960);
		camada3.montarMapa(1312, 960);
		camada4.montarMapa(1312, 960);
		camada5.montarMapa(1312, 960);
		camada6.montarMapa(1312, 960);
		camada7.montarMapa(1312, 960);

	}
	
	public void fase3() {
		camada1 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada15.txt");
		camada2 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada16.txt");
		camada3 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada17.txt");
		camada4 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada18.txt");
		camada5 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada19.txt");
		camada6 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada20.txt");
		camada7 = new Camada(60, 82, 16, 16, "tileset-alistair.png", "camada21.txt");

		camada1.montarMapa(1312, 960);
		camada2.montarMapa(1312, 960);
		camada3.montarMapa(1312, 960);
		camada4.montarMapa(1312, 960);
		camada5.montarMapa(1312, 960);
		camada6.montarMapa(1312, 960);
		camada7.montarMapa(1312, 960);

	}

	@Override
	public void paint(Graphics g) {
		if (personagem.posX > (300 - personagem.width))
			if (personagem.posX < tela.getWidth() - 300 - personagem.width)
				camerax = personagem.posX - 300 + personagem.width;
		if (personagem.posY > (250 - personagem.height))
			if (personagem.posY < tela.getHeight() - 250 - personagem.height)
				cameray = personagem.posY - 250 + personagem.height;

		tela.getGraphics().drawImage(camada1.camada, 0, 0, this);
		tela.getGraphics().drawImage(camada2.camada, 0, 0, this);
		tela.getGraphics().drawImage(camada3.camada, 0, 0, this);
		tela.getGraphics().drawImage(camada4.camada, 0, 0, this);
		tela.getGraphics().drawImage(camada5.camada, 0, 0, this);

		tela.getGraphics().drawImage(personagem.sprites[personagem.aparencia], personagem.posX, personagem.posY, null);

		tela.getGraphics().drawImage(camada6.camada, 0, 0, this);
		tela.getGraphics().drawImage(camada7.camada, 0, 0, this);

		g.drawImage(tela, -camerax, -cameray, null);

		g.setColor(Color.black);
		g.drawRect(0, 0, 599, 499);

	}
	
	public void setTela(BufferedImage tela) {
		this.tela = tela;
	}

	public Camada getCamada1() {
		return camada1;
	}

	public Camada getCamada2() {
		return camada2;
	}

	public Camada getCamada3() {
		return camada3;
	}

	public Camada getCamada4() {
		return camada4;
	}

	public Camada getCamada5() {
		return camada5;
	}

	public Camada getCamada6() {
		return camada6;
	}

	public Camada getCamada7() {
		return camada7;
	}

	public Sprite getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Sprite personagem) {
		this.personagem = personagem;
	}

	public void setCamerax(int camerax) {
		this.camerax = camerax;
	}

	public void setCameray(int cameray) {
		this.cameray = cameray;
	}

	public static void setEscolherPersonagem(int escolherPersonagem) {
		JogoPanel.escolherPersonagem = escolherPersonagem;
	}

}
