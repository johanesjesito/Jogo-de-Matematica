package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;

import model.Backup;
import model.JogoModel;
import model.Rank;
import view.InvetarioPanel;
import view.JogoPanel;
import view.JogoView;
import view.TelaInicio;

public class JogoController extends KeyAdapter{
		
	JogoView jogoView;
	JogoPanel jogoPanel;
	JogoModel jogoModel;
	private static TelaInicio telaInicio;
    HashMap<Integer, Boolean> keyPool = new HashMap<Integer, Boolean>();

	public JogoController(JogoView jogoView, JogoPanel jogoPanel, JogoModel jogomodel, TelaInicio telaInicio) {
		this.jogoView = jogoView;
		this.jogoPanel = jogoPanel;
		this.jogoModel = jogomodel;
		JogoController.telaInicio = telaInicio;
	}
	
	public void onUpdate() {
			if (keyPool.get(KeyEvent.VK_UP) != null) {
				if (TelaInicio.getNomeJogador().getText().equalsIgnoreCase("pikachu")) {
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada2().collision, 0, -6)) {
						jogoPanel.getPersonagem().posY += 6;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada3().collision, 0, -6)) {
						jogoPanel.getPersonagem().posY += 6;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada4().collision, 0, -6)) {
						jogoPanel.getPersonagem().posY += 6;
					}
					jogoPanel.getPersonagem().posY -= 6;
				} else {
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada2().collision, 0, -3)) {
						jogoPanel.getPersonagem().posY += 3;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada3().collision, 0, -3)) {
						jogoPanel.getPersonagem().posY += 3;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada4().collision, 0, -3)) {
						jogoPanel.getPersonagem().posY += 3;
					}
					jogoPanel.getPersonagem().posY -= 3;
				}
				switch (jogoModel.getUp()) {
				case 0:
					jogoPanel.getPersonagem().aparencia = 0;
					break;
				case 3:
					jogoPanel.getPersonagem().aparencia = 4;
					break;
				case 6:
					jogoPanel.getPersonagem().aparencia = 0;
					break;
				case 9:
					jogoPanel.getPersonagem().aparencia = 8;
					break;
				}
				if (jogoModel.getUp() == 12)
					jogoModel.setUp(0);
				else
					jogoModel.setUp(jogoModel.getUp() + 1);
			}
			if (keyPool.get(KeyEvent.VK_DOWN) != null) {
				if (TelaInicio.getNomeJogador().getText().equalsIgnoreCase("pikachu")) {
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada2().collision, 0, +6)) {
						jogoPanel.getPersonagem().posY -= 6;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada3().collision, 0, +6)) {
						jogoPanel.getPersonagem().posY -= 6;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada4().collision, 0, +6)) {
						jogoPanel.getPersonagem().posY -= 6;
					}
					jogoPanel.getPersonagem().posY += 6;
				} else {
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada2().collision, 0, +3)) {
						jogoPanel.getPersonagem().posY -= 3;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada3().collision, 0, +3)) {
						jogoPanel.getPersonagem().posY -= 3;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada4().collision, 0, +3)) {
						jogoPanel.getPersonagem().posY -= 3;
					}
					jogoPanel.getPersonagem().posY += 3;
				}
				switch (jogoModel.getDown()) {
				case 0:
					jogoPanel.getPersonagem().aparencia = 1;
					break;
				case 3:
					jogoPanel.getPersonagem().aparencia = 5;
					break;
				case 6:
					jogoPanel.getPersonagem().aparencia = 1;
					break;
				case 9:
					jogoPanel.getPersonagem().aparencia = 9;
					break;
				}
				if (jogoModel.getDown() == 12)
					jogoModel.setDown(0);
				else
					jogoModel.setDown(jogoModel.getDown() + 1);
			}
			if (keyPool.get(KeyEvent.VK_LEFT) != null) {

				if (TelaInicio.getNomeJogador().getText().equalsIgnoreCase("pikachu")) {
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada2().collision, -6, 0)) {
						jogoPanel.getPersonagem().posX += 6;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada3().collision, -6, 0)) {
						jogoPanel.getPersonagem().posX += 6;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada4().collision, -6, 0)) {
						jogoPanel.getPersonagem().posX += 6;
					}
					jogoPanel.getPersonagem().posX -= 6;
				} else {
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada2().collision, -3, 0)) {
						jogoPanel.getPersonagem().posX += 3;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada3().collision, -3, 0)) {
						jogoPanel.getPersonagem().posX += 3;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada4().collision, -3, 0)) {
						jogoPanel.getPersonagem().posX += 3;
					}

					jogoPanel.getPersonagem().posX -= 3;
				}
				switch (jogoModel.getLeft()) {

				case 0:
					jogoPanel.getPersonagem().aparencia = 2;
					break;
				case 3:
					jogoPanel.getPersonagem().aparencia = 6;
					break;
				case 6:
					jogoPanel.getPersonagem().aparencia = 2;
					break;
				case 9:
					jogoPanel.getPersonagem().aparencia = 10;
					break;
				}
				if (jogoModel.getLeft() == 12)
					jogoModel.setLeft(0);
				else
					jogoModel.setLeft(jogoModel.getLeft() + 1);
			}
			if (keyPool.get(KeyEvent.VK_RIGHT) != null) {
				if (TelaInicio.getNomeJogador().getText().equalsIgnoreCase("pikachu")) {
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada2().collision, +6, 0)) {
						jogoPanel.getPersonagem().posX -= 6;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada3().collision, +6, 0)) {
						jogoPanel.getPersonagem().posX -= 6;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada4().collision, +6, 0)) {
						jogoPanel.getPersonagem().posX -= 6;
					}
					jogoPanel.getPersonagem().posX += 6;
				} else {
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada2().collision, +3, 0)) {
						jogoPanel.getPersonagem().posX -= 3;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada3().collision, +3, 0)) {
						jogoPanel.getPersonagem().posX -= 3;
					}
					if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada4().collision, +3, 0)) {
						jogoPanel.getPersonagem().posX -= 3;
					}
					jogoPanel.getPersonagem().posX += 3;
				}
				switch (jogoModel.getRight()) {
				case 0:
					jogoPanel.getPersonagem().aparencia = 3;
					break;
				case 3:
					jogoPanel.getPersonagem().aparencia = 7;
					break;
				case 6:
					jogoPanel.getPersonagem().aparencia = 3;
					break;
				case 9:
					jogoPanel.getPersonagem().aparencia = 11;
					break;
				}
				if (jogoModel.getRight() == 12)
					jogoModel.setRight(0);
				else
					jogoModel.setRight(jogoModel.getRight() + 1);

			}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		keyPool.put(e.getKeyCode(), true);
		onUpdate();
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			jogoView.dispose();
			JogoModel.getSom().getSom().stop();
			telaInicio.setVisible(true);
			TelaInicio.getSom().getSom().loop();
			JogoView.jogoPanel.personagens();
			try {
			    Rank rank = new Rank(TelaInicio.getNomeJogador().getText(), JogoView.pontosTotal);
				jogoModel.setRank(rank); 
				Backup.salvarPontuacao(jogoModel.getRank());
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		keyPool.remove(e.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent e) {

		if (e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {
			
			if(InvetarioPanel.isInventario()==false) {
				InvetarioPanel.setInventario(true);
			}			
			
			else {
				InvetarioPanel.setInventario(false);
			}
		}
	}

	public static TelaInicio getTelaInicio() {
		return telaInicio;
	}

}
