package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.swing.Timer;

import controller.JogoController;
import view.BatalhaView;
import view.JogoPanel;
import view.JogoView;
import view.TelaInicio;

public class JogoModel implements Runnable{
	
	JogoPanel jogoPanel;
	JogoView jogoView;
	Rank rank;
	
	private static Som som = new Som("Mapa.wav");
	
	private int up, down, left, right;
	private int fps=60;
	private static Integer tempo;
	long tempoAnterior = System.currentTimeMillis();
	
	Random random = new Random();
	
	public JogoModel(JogoPanel jogoPanel, JogoView jogoView) {
		this.jogoPanel = jogoPanel;
		this.jogoView = jogoView;
		
	}
	
	public void funcoes(double fps) {

		if (tempo == 0) {
			jogoView.dispose();
			JogoModel.getSom().getSom().stop();
			JogoController.getTelaInicio().setVisible(true);
			TelaInicio.getSom().getSom().loop();
			JogoView.jogoPanel.personagens();
			try {
				rank = new Rank(TelaInicio.getNomeJogador().getText(), JogoView.pontosTotal);
				Backup.salvarPontuacao(rank);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			if (jogoPanel.getPersonagem().collision(jogoPanel.getCamada5().collision, 0, 0)) {

				switch (random.nextInt(400)) {
				case 1:
					BatalhaModel.pokemonNumero = 1;
					BatalhaView.setAtivo(true);
					BatalhaView.getInstance();
					som.getSom().stop();
					break;
				case 2:
					BatalhaModel.pokemonNumero = 2;
					BatalhaView.setAtivo(true);
					BatalhaView.getInstance();
					som.getSom().stop();
					break;
				case 3:
					BatalhaModel.pokemonNumero = 3;
					BatalhaView.setAtivo(true);
					BatalhaView.getInstance();
					som.getSom().stop();
					break;
				case 4:
					BatalhaModel.pokemonNumero = 4;
					BatalhaView.setAtivo(true);
					BatalhaView.getInstance();
					som.getSom().stop();
					break;
				}
			}
		}

	}
	
	@Override
	public void run() {
		
		jogoPanel.setTela(new BufferedImage(1312, 960, BufferedImage.TYPE_4BYTE_ABGR));		
		Timer t = new Timer(fps, new ActionListener() {
			public long t0;
			public void actionPerformed(ActionEvent evt) {
				long t1 = System.currentTimeMillis();
				if(t0 == 0)
					t0 = t1;
				if(t1 > t0) {
					double fps2 = (t1 - t0) / 1000.0;
					t0 = t1;
					jogoView.repaint((long) fps2);
					funcoes(fps2);		
					if(tempoAnterior < System.currentTimeMillis()) {
						tempoAnterior +=1000;
						tempo--;
					}
				}
			}
		});
		t.start();

	}
	
	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public static Som getSom() {
		return som;
	}

	public static Integer getTempo() {
		return tempo;
	}

	public static void setTempo(Integer tempo) {
		JogoModel.tempo = tempo;
	}
	
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
}
