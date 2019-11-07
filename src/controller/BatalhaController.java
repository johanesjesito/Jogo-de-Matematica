package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import model.BatalhaModel;
import model.Caculacao;
import model.JogoModel;
import view.BatalhaView;
import view.JogoView;

public class BatalhaController extends WindowAdapter {

	BatalhaView batalhaView;
	BatalhaModel batalhaModel;

	public BatalhaController(BatalhaView batalhaView, BatalhaModel batalhaModel) {
		this.batalhaView = batalhaView;
		this.batalhaModel = batalhaModel;
	}

	public void TecladoBatalha() {
		batalhaView.getRespostaField().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {


				switch (JogoView.fase) {
				case 1:
					if(batalhaView.getRespostaField().getText().equals(Caculacao.getResultado()+"")){
						batalhaModel.setPontos(batalhaModel.getPontos()+Caculacao.getResultado());
						batalhaView.getSangue().setValue(batalhaView.getSangue().getValue()-Caculacao.getResultado());
						if(batalhaView.getSangue().getValue()<=0) {
							JogoView.pontosTotal+=batalhaModel.getPontos();
							JogoView.pontos+=batalhaModel.getPontos();
							batalhaView.dispose();
							BatalhaView.setAtivo(false);
							BatalhaView.setInstance(null);
							BatalhaModel.getSom().getSom().stop();
							JogoModel.getSom().getSom().loop();
							
							switch (JogoView.fase) {
							case 1:
								JogoModel.setTempo(JogoModel.getTempo()+60);
								break;
							case 2:
								JogoModel.setTempo(JogoModel.getTempo()+180);
								break;
							case 3:
								JogoModel.setTempo(JogoModel.getTempo()+120);
								break;


							default:
								break;
							}
							
							if(BatalhaModel.pokemonNumero2 == 1) {
								JogoView.pokemon1++;
							}
							else if(BatalhaModel.pokemonNumero2 == 2) {
								JogoView.pokemon2++;
							}
							else if(BatalhaModel.pokemonNumero2 == 3) {
								JogoView.pokemon3++;
							}
							else if(BatalhaModel.pokemonNumero2 == 4) {
								JogoView.pokemon4++;
							}
							
							if(JogoView.pontos>=1500 && JogoView.fase==1) {
								JogoView.fase++;
								JogoView.jogoPanel.fase2();
								JogoView.jogoPanel.personagens();
								JogoView.jogoPanel.setCamerax(712);
								JogoView.jogoPanel.setCameray(460);
								JogoModel.setTempo(600);
							}
						}

						Caculacao.calcular();				
					}

					break;

				case 2:
					if(batalhaView.getRespostaField().getText().equals(Caculacao.getResultado()+"")){
						batalhaModel.setPontos(batalhaModel.getPontos()+Caculacao.getResultado());
						batalhaView.getSangue().setValue(batalhaView.getSangue().getValue()-Caculacao.getResultado());
						if(batalhaView.getSangue().getValue()<=0) {
							JogoView.pontosTotal+=batalhaModel.getPontos();
							JogoView.pontos+=batalhaModel.getPontos();
							batalhaView.dispose();
							BatalhaView.setAtivo(false);
							BatalhaView.setInstance(null);
							BatalhaModel.getSom().getSom().stop();
							JogoModel.getSom().getSom().loop();
							switch (JogoView.fase) {
							case 1:
								JogoModel.setTempo(JogoModel.getTempo()+60);
								break;
							case 2:
								JogoModel.setTempo(JogoModel.getTempo()+180);
								break;
							case 3:
								JogoModel.setTempo(JogoModel.getTempo()+120);
								break;


							default:
								break;
							}
							if(BatalhaModel.pokemonNumero2 == 1) {
								JogoView.pokemon1++;
							}
							else if(BatalhaModel.pokemonNumero2 == 2) {
								JogoView.pokemon2++;
							}
							else if(BatalhaModel.pokemonNumero2 == 3) {
								JogoView.pokemon3++;
							}
							else if(BatalhaModel.pokemonNumero2 == 4) {
								JogoView.pokemon4++;
							}
							
							if(JogoView.pontos>=3000 && JogoView.fase==2) {
								JogoView.fase++;
								JogoView.jogoPanel.fase3();
								JogoView.jogoPanel.personagens();
								JogoView.jogoPanel.setCamerax(712);
								JogoView.jogoPanel.setCameray(460);
								JogoModel.setTempo(600);
							}
						}

						Caculacao.calcular2();				
					}

					break;

				case 3:
					if(batalhaView.getRespostaField().getText().equals(Caculacao.getResultado()+"")){
						batalhaModel.setPontos(batalhaModel.getPontos()+Caculacao.getResultado());
						batalhaView.getSangue().setValue(batalhaView.getSangue().getValue()-Caculacao.getResultado());
						if(batalhaView.getSangue().getValue()<=0) {
							JogoView.pontosTotal+=batalhaModel.getPontos();
							JogoView.pontos+=batalhaModel.getPontos();
							batalhaView.dispose();
							BatalhaView.setAtivo(false);
							BatalhaView.setInstance(null);
							BatalhaModel.getSom().getSom().stop();
							JogoModel.getSom().getSom().loop();
							switch (JogoView.fase) {
							case 1:
								JogoModel.setTempo(JogoModel.getTempo()+60);
								break;
							case 2:
								JogoModel.setTempo(JogoModel.getTempo()+180);
								break;
							case 3:
								JogoModel.setTempo(JogoModel.getTempo()+120);
								break;


							default:
								break;
							}
							if(BatalhaModel.pokemonNumero2 == 1) {
								JogoView.pokemon1++;
							}
							else if(BatalhaModel.pokemonNumero2 == 2) {
								JogoView.pokemon2++;
							}
							else if(BatalhaModel.pokemonNumero2 == 3) {
								JogoView.pokemon3++;
							}
							else if(BatalhaModel.pokemonNumero2 == 4) {
								JogoView.pokemon4++;
							}
							if(JogoView.pontos>=33000 && JogoView.fase==3) {
								JogoView.fase-=2;
								JogoView.jogoPanel.fase1();
								JogoView.jogoPanel.personagens();
								JogoView.jogoPanel.setCamerax(712);
								JogoView.jogoPanel.setCameray(460);
								JogoModel.setTempo(1200);
								if(JogoView.fase==1) {
									JogoView.pontos=0;
								}
							}
						}
						Caculacao.calcular3();				

					}
					break;
				}



				batalhaView.getRespostaField().setText("");
			}

		});
	}

	public void windowClosing(WindowEvent e) {
		batalhaView.dispose();
		BatalhaView.setAtivo(false);
		BatalhaView.setInstance(null);
		BatalhaModel.getSom().getSom().stop();
		JogoModel.getSom().getSom().loop();
	}

}
