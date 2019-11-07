package model;

import java.io.IOException;

import view.BatalhaView;
import view.JogoView;

public class BatalhaModel {

	private Sprite pokemon;
	BatalhaView batalhaView;
	Thread thread;

	private static Som som = new Som("Batalha.wav");

	public static int pokemonNumero, pokemonNumero2;

	private Integer tempo;
	long tempoAnterior = System.currentTimeMillis();
	private int fps=20;

	private int pontos = 0;

	public BatalhaModel(BatalhaView batalhaView) {
		this.batalhaView = batalhaView;
	}

	public void pokemon() {
		try {

			switch (JogoView.fase) {
			case 1:
				switch (pokemonNumero) {
				case 1:
					pokemon = new Sprite("pokemon2.png", 0, 104, 97, 6, 3, 140, 85);
					pokemonNumero2 = 1;
					break;
				case 2:
					pokemon = new Sprite("pokemon4.png", 0, 108, 81, 7, 2, 140, 100);
					pokemonNumero2 = 2;
					break;
				case 3:
					pokemon = new Sprite("pokemon6.png", 0, 74, 73, 5, 3, 155, 100);
					pokemonNumero2 = 3;
					break;
				case 4:
					pokemon = new Sprite("pokemon8.png", 0, 73, 138, 11, 1, 155, 50);
					pokemonNumero2 = 4;
					break;
				}
				break;
			case 2:
				switch (pokemonNumero) {
				case 1:
					pokemon = new Sprite("pokemon22.png", 0, 104, 97, 6, 3, 140, 85);
					pokemonNumero2 = 1;
					break;
				case 2:
					pokemon = new Sprite("pokemon44.png", 0, 108, 81, 7, 2, 140, 100);
					pokemonNumero2 = 2;
					break;
				case 3:
					pokemon = new Sprite("pokemon66.png", 0, 74, 73, 5, 3, 155, 100);
					pokemonNumero2 = 3;
					break;
				case 4:
					pokemon = new Sprite("pokemon88.png", 0, 73, 138, 11, 1, 155, 50);
					pokemonNumero2 = 4;
					break;
				}
				break;
			case 3:
				switch (pokemonNumero) {
				case 1:
					pokemon = new Sprite("pokemon222.png", 0, 104, 97, 6, 3, 140, 85);
					pokemonNumero2 = 1;
					break;
				case 2:
					pokemon = new Sprite("pokemon444.png", 0, 108, 81, 7, 2, 140, 100);
					pokemonNumero2 = 2;
					break;
				case 3:
					pokemon = new Sprite("pokemon666.png", 0, 74, 73, 5, 3, 155, 100);
					pokemonNumero2 = 3;
					break;
				case 4:
					pokemon = new Sprite("pokemon888.png", 0, 73, 138, 11, 1, 155, 50);
					pokemonNumero2 = 4;
					break;
				}
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi possível carregar a Sprite");
		}

	}

	public void Animacao(){
		thread =  new Thread(new Runnable(){
			@Override
			public void run() {

				switch (JogoView.fase) {
				case 1:
					tempo = 60;
					break;
				case 2:
					tempo = 180;
					break;
				case 3:
					tempo = 120;
					break;

				default:
					break;
				}

				switch (pokemonNumero) {
				case 1:{

					while (BatalhaView.isAtivo()) {
						if(tempo == 0) {
							pontos=0;
							batalhaView.dispose();
							BatalhaView.setAtivo(false);
							BatalhaView.setInstance(null);
							som.getSom().stop();
							JogoModel.getSom().getSom().play();
							JogoModel.getSom().getSom().loop();
						}
						if(tempoAnterior < System.currentTimeMillis()) {
							tempoAnterior +=1000;
							tempo--;
						}
						switch (pokemon.aparencia) {
						case 17:
							pokemon.aparencia = 0;	
							break;
						case 0:
							pokemon.aparencia = 3;
							break;
						case 3:
							pokemon.aparencia = 6;
							break;
						case 6:
							pokemon.aparencia = 9;
							break;
						case 9:
							pokemon.aparencia = 12;
							break;
						case 12:
							pokemon.aparencia = 15;
							break;
						case 15:
							pokemon.aparencia = 1;
							break;
						case 1:
							pokemon.aparencia = 4;
							break;
						case 4:
							pokemon.aparencia = 7;
							break;
						case 7:
							pokemon.aparencia = 10;
							break;
						case 10:
							pokemon.aparencia = 13;
							break;
						case 13:
							pokemon.aparencia = 16;
							break;
						case 16:
							pokemon.aparencia = 2;
							break;
						case 2:
							pokemon.aparencia = 5;
							break;
						case 5:
							pokemon.aparencia = 8;
							break;
						case 8:
							pokemon.aparencia = 11;
							break;
						case 11:
							pokemon.aparencia = 14;
							break;
						case 14:
							pokemon.aparencia = 17;
							break;
						}
						try {
							batalhaView.repaint();
							Thread.sleep(1000 / fps);
						} catch (InterruptedException i) {
							i.printStackTrace();
						}

					}
					break;	
				}
				case 2:{

					while (BatalhaView.isAtivo()) {
						if(tempo == 0)  {
							batalhaView.dispose();
							BatalhaView.setAtivo(false);
							BatalhaView.setInstance(null);
							som.getSom().stop();
							JogoModel.getSom().getSom().play();
							JogoModel.getSom().getSom().loop();
						}
						if(tempoAnterior < System.currentTimeMillis()) {
							tempoAnterior +=1000;
							tempo--;
						}						
						switch (pokemon.aparencia) {
						case 13:
							pokemon.aparencia = 0;	
							break;
						case 0:
							pokemon.aparencia = 2;
							break;
						case 2:
							pokemon.aparencia = 4;
							break;
						case 4:
							pokemon.aparencia = 6;
							break;
						case 6:
							pokemon.aparencia = 8;
							break;
						case 8:
							pokemon.aparencia = 10;
							break;
						case 10:
							pokemon.aparencia = 12;
							break;
						case 12:
							pokemon.aparencia = 1;
							break;
						case 1:
							pokemon.aparencia = 3;
							break;
						case 3:
							pokemon.aparencia = 5;
							break;
						case 5:
							pokemon.aparencia = 7;
							break;
						case 7:
							pokemon.aparencia = 9;
							break;
						case 9:
							pokemon.aparencia = 11;
							break;
						case 11:
							pokemon.aparencia = 13;
							break;
						}
						try {
							batalhaView.repaint();
							Thread.sleep(1000 / fps);
						} catch (InterruptedException i) {
							i.printStackTrace();
						}

					}
					break;	
				}	
				case 3:{

					while (BatalhaView.isAtivo()) {
						if(tempo == 0)  {
							batalhaView.dispose();
							BatalhaView.setAtivo(false);
							BatalhaView.setInstance(null);
							som.getSom().stop();
							JogoModel.getSom().getSom().play();
							JogoModel.getSom().getSom().loop();
						}
						if(tempoAnterior < System.currentTimeMillis()) {
							tempoAnterior +=1000;
							tempo--;
						}	
						switch (pokemon.aparencia) {
						case 14:
							pokemon.aparencia = 0;
							break;
						case 0:
							pokemon.aparencia = 3;
							break;
						case 3:
							pokemon.aparencia = 6;
							break;
						case 6:
							pokemon.aparencia = 9;
							break;
						case 9:
							pokemon.aparencia = 12;
							break;
						case 12:
							pokemon.aparencia = 1;
							break;
						case 1:
							pokemon.aparencia = 4;
							break;
						case 4:
							pokemon.aparencia = 7;
							break;
						case 7:
							pokemon.aparencia = 10;
							break;
						case 10:
							pokemon.aparencia = 13;
							break;
						case 13:
							pokemon.aparencia = 2;
							break;
						case 2:
							pokemon.aparencia = 5;
							break;
						case 5:
							pokemon.aparencia = 8;
							break;
						case 8:
							pokemon.aparencia = 11;
							break;
						case 11:
							pokemon.aparencia = 14;
							break;
						}
						try {
							batalhaView.repaint();
							Thread.sleep(1000 / fps);
						} catch (InterruptedException i) {
							i.printStackTrace();
						}

					}
					break;	
				}
				case 4:{

					while (BatalhaView.isAtivo()) {
						if(tempo == 0)  {
							batalhaView.dispose();
							BatalhaView.setAtivo(false);
							BatalhaView.setInstance(null);
							som.getSom().stop();
							JogoModel.getSom().getSom().play();
							JogoModel.getSom().getSom().loop();
						}
						if(tempoAnterior < System.currentTimeMillis()) {
							tempoAnterior +=1000;
							tempo--;
						}
						switch (pokemon.aparencia) {
						case 10:
							pokemon.aparencia = 0;
							break;
						case 0:
							pokemon.aparencia = 1;
							break;
						case 1:
							pokemon.aparencia = 2;
							break;
						case 2:
							pokemon.aparencia = 3;
							break;
						case 3:
							pokemon.aparencia = 4;
							break;
						case 4:
							pokemon.aparencia = 5;
							break;
						case 5:
							pokemon.aparencia = 6;
							break;
						case 6:
							pokemon.aparencia = 7;
							break;
						case 7:
							pokemon.aparencia = 8;
							break;
						case 8:
							pokemon.aparencia = 9;
							break;
						case 9:
							pokemon.aparencia = 10;

							break;
						}
						try {
							batalhaView.repaint();
							Thread.sleep(1000 / fps);
						} catch (InterruptedException i) {
							i.printStackTrace();
						}

					}

				}
				break;	
				}
			}

		});
		thread.start();
	}

	public Sprite getPokemon() {
		return pokemon;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Integer getTempo() {
		return tempo;
	}

	public static Som getSom() {
		return som;
	}

}
