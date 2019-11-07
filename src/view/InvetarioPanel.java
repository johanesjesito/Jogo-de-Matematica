package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import model.JogoModel;
import model.Sprite;

public class InvetarioPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static boolean inventario = false;
	
	JogoView jogoView;
	private Font fontNome, fontTempo, fontPontos;
	private static Sprite pokemon1, pokemon2, pokemon3, pokemon4;
	
	public InvetarioPanel() {
		try {
			pokemon1 = new Sprite("Pokemons.png", 3, 32, 32, 2, 2, 50, 200);
			pokemon2 = new Sprite("Pokemons.png", 2, 32, 32, 2, 2, 50, 240);
			pokemon3 = new Sprite("Pokemons.png", 0, 32, 32, 2, 2, 50, 280);
			pokemon4 = new Sprite("Pokemons.png", 1, 32, 32, 2, 2, 50, 320);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		if (inventario == true) {
			g.setColor(new Color(192,192,192,200));
			g.fillRect(0, 0, 200, 500);

			fontTempo = new Font("Tw Cen MT Condensed", Font.BOLD, 16);
			g.setFont(fontTempo);
			g.setColor(Color.BLACK);
			g.drawString("TEMPO: " + JogoModel.getTempo(), 50, 30);

			fontNome = new Font("Tw Cen MT Condensed", Font.BOLD, 24);
			g.setFont(fontNome);
			g.setColor(Color.BLACK);
			g.drawString("PLAYER: " + TelaInicio.getNomeJogador().getText(), 25, 90);
			fontNome = new Font("Tw Cen MT Condensed", Font.BOLD, 24);
			
			fontPontos = new Font("Tw Cen MT Condensed", Font.BOLD, 20);

			g.setFont(fontPontos);
			g.setColor(Color.BLACK);
			g.drawString("FASE: " + JogoView.fase, 55, 140);

			g.setFont(fontPontos);
			g.setColor(Color.BLACK);
			g.drawString("PONTOS: " + JogoView.pontosTotal, 33, 160);

			g.drawImage(pokemon1.sprites[pokemon1.aparencia], pokemon1.posX, pokemon1.posY, null);
			g.drawImage(pokemon2.sprites[pokemon2.aparencia], pokemon2.posX, pokemon2.posY, null);
			g.drawImage(pokemon3.sprites[pokemon3.aparencia], pokemon3.posX, pokemon3.posY, null);
			g.drawImage(pokemon4.sprites[pokemon4.aparencia], pokemon4.posX, pokemon4.posY, null);

			g.setFont(fontTempo);
			g.setColor(Color.BLACK);
			g.drawString("X " + JogoView.pokemon1, 90, 225);
			g.setFont(fontTempo);
			g.setColor(Color.BLACK);
			g.drawString("X " + JogoView.pokemon3, 90, 265);
			g.setFont(fontTempo);
			g.setColor(Color.BLACK);
			g.drawString("X " + JogoView.pokemon2, 90, 305);
			g.setFont(fontTempo);
			g.setColor(Color.BLACK);
			g.drawString("X " + JogoView.pokemon4, 90, 345);

			g.setColor(Color.black);
			g.drawRect(0, 0, 199, 499);
		}

	}

	public static boolean isInventario() {
		return inventario;
	}

	public static void setInventario(boolean inventario) {
		InvetarioPanel.inventario = inventario;
	}

}
