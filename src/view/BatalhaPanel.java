package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import model.BatalhaModel;
import model.Caculacao;

public class BatalhaPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	BatalhaView batalhaView;
	BatalhaModel batalhaModel;
		
	public BatalhaPanel(BatalhaView batalhaView, BatalhaModel batalhaModel) {
		this.batalhaView = batalhaView;
		this.batalhaModel = batalhaModel;
	}

	public void paint(Graphics g) {
		BufferedImage fundo = new BufferedImage(batalhaView.getWidth(), batalhaView.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
		Graphics backEnd = fundo.getGraphics();
		if (backEnd != null) {
			backEnd.drawImage(batalhaView.getPaletadefundo().getImage(), 0, 0, batalhaView);
			backEnd.drawImage(batalhaModel.getPokemon().sprites[batalhaModel.getPokemon().aparencia], batalhaModel.getPokemon().posX, batalhaModel.getPokemon().posY, null);
			g.drawImage(fundo, 0, 0, null);
			g.setFont(batalhaView.getFontTempo());
			g.drawString("Tempo: " + Integer.toString(batalhaModel.getTempo()), 320, 20);
			g.setFont(batalhaView.getFontEquacao());
			g.drawString(Caculacao.getEquacao(), 150, 300);
			
			g.setColor(Color.black);
			g.drawRect(0, 0, 399, 499);
		}
	}

}
