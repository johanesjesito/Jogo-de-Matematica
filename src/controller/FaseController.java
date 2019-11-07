package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.JogoModel;
import view.FaseView;
import view.JogoPanel;
import view.JogoView;
import view.TelaInicio;

public class FaseController {
	
	TelaInicio telaInicio;
	FaseView faseView;

	public FaseController(FaseView faseView, TelaInicio telaInicio) {
		this.telaInicio = telaInicio;
		this.faseView = faseView;
		
		faseView.getJogar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Stub de método gerado automaticamente
				if(FaseView.getFase1().isSelected()) {
					if (TelaInicio.getNomeJogador().getText().equalsIgnoreCase("pikachu")) {
						faseView.setVisible(false);
						TelaInicio.getSom().getSom().stop();
						JogoPanel.setEscolherPersonagem(6);
						JogoView jogoView = new JogoView();
						JogoModel jogoModel = new JogoModel(JogoView.jogoPanel, jogoView);
						JogoController jogoController = new JogoController(jogoView, JogoView.jogoPanel, jogoModel, telaInicio);
						jogoView.addKeyListener(jogoController);
						jogoView.getJogoPanel().setCamerax(712);
						jogoView.getJogoPanel().setCameray(460);
						JogoView.fase = 1;
						JogoView.pontos = 0;
						JogoView.pontosTotal = 0;
						JogoView.pokemon1 = 0;
						JogoView.pokemon2 = 0;
						JogoView.pokemon3 = 0;
						JogoView.pokemon4 = 0;
						JogoModel.setTempo(600);
						jogoModel.run();
					}

					else {

						if (telaInicio.getPerso1().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(1);
						} else if (telaInicio.getPerso2().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(2);
						} else if (telaInicio.getPerso3().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(5);
						} else if (telaInicio.getPerso4().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(3);
						} else if (telaInicio.getPerso5().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(4);
						}
						faseView.setVisible(false);
						TelaInicio.getSom().getSom().stop();
						JogoView jogoView = new JogoView();
						JogoModel jogoModel = new JogoModel(JogoView.jogoPanel, jogoView);
						JogoController jogoController = new JogoController(jogoView, JogoView.jogoPanel, jogoModel, telaInicio);
						jogoView.addKeyListener(jogoController);
						jogoView.getJogoPanel().setCamerax(712);
						jogoView.getJogoPanel().setCameray(460);
						JogoView.fase = 1;
						JogoView.pontos = 0;
						JogoView.pontosTotal = 0;
						JogoView.pokemon1 = 0;
						JogoView.pokemon2 = 0;
						JogoView.pokemon3 = 0;
						JogoView.pokemon4 = 0;
						JogoModel.setTempo(600);
						jogoModel.run();
					}

				}
				
				if(FaseView.getFase2().isSelected()) {
					if (TelaInicio.getNomeJogador().getText().equalsIgnoreCase("pikachu")) {
						faseView.setVisible(false);
						TelaInicio.getSom().getSom().stop();
						JogoPanel.setEscolherPersonagem(6);
						JogoView jogoView = new JogoView();
						JogoModel jogoModel = new JogoModel(JogoView.jogoPanel, jogoView);
						JogoController jogoController = new JogoController(jogoView, JogoView.jogoPanel, jogoModel, telaInicio);
						jogoView.addKeyListener(jogoController);
						jogoView.getJogoPanel().setCamerax(712);
						jogoView.getJogoPanel().setCameray(460);
						JogoView.fase = 2;
						JogoView.pontosTotal = 0;
						JogoView.pontos = 0;
						JogoView.pokemon1 = 0;
						JogoView.pokemon2 = 0;
						JogoView.pokemon3 = 0;
						JogoView.pokemon4 = 0;
						JogoModel.setTempo(600);
						jogoModel.run();
					}

					else {

						if (telaInicio.getPerso1().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(1);
						} else if (telaInicio.getPerso2().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(2);
						} else if (telaInicio.getPerso3().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(5);
						} else if (telaInicio.getPerso4().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(3);
						} else if (telaInicio.getPerso5().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(4);
						}
						faseView.setVisible(false);
						TelaInicio.getSom().getSom().stop();
						JogoView jogoView = new JogoView();
						JogoModel jogoModel = new JogoModel(JogoView.jogoPanel, jogoView);
						JogoController jogoController = new JogoController(jogoView, JogoView.jogoPanel, jogoModel, telaInicio);
						jogoView.addKeyListener(jogoController);
						jogoView.getJogoPanel().setCamerax(712);
						jogoView.getJogoPanel().setCameray(460);
						JogoView.fase = 2;
						JogoView.pontosTotal = 0;
						JogoView.pontos = 0;
						JogoView.pokemon1 = 0;
						JogoView.pokemon2 = 0;
						JogoView.pokemon3 = 0;
						JogoView.pokemon4 = 0;
						JogoModel.setTempo(600);
						jogoModel.run();
					}

				}
				
				if(FaseView.getFase3().isSelected()) {
					if (TelaInicio.getNomeJogador().getText().equalsIgnoreCase("pikachu")) {
						faseView.setVisible(false);
						TelaInicio.getSom().getSom().stop();
						JogoPanel.setEscolherPersonagem(6);
						JogoView jogoView = new JogoView();
						JogoModel jogoModel = new JogoModel(JogoView.jogoPanel, jogoView);
						JogoController jogoController = new JogoController(jogoView, JogoView.jogoPanel, jogoModel, telaInicio);
						jogoView.addKeyListener(jogoController);
						jogoView.getJogoPanel().setCamerax(712);
						jogoView.getJogoPanel().setCameray(460);
						JogoView.fase = 3;
						JogoView.pontosTotal = 0;
						JogoView.pontos = 0;
						JogoView.pokemon1 = 0;
						JogoView.pokemon2 = 0;
						JogoView.pokemon3 = 0;
						JogoView.pokemon4 = 0;
						JogoModel.setTempo(600);
						jogoModel.run();
					}

					else {

						if (telaInicio.getPerso1().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(1);
						} else if (telaInicio.getPerso2().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(2);
						} else if (telaInicio.getPerso3().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(5);
						} else if (telaInicio.getPerso4().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(3);
						} else if (telaInicio.getPerso5().isSelected() == true) {
							JogoPanel.setEscolherPersonagem(4);
						}
						faseView.setVisible(false);
						TelaInicio.getSom().getSom().stop();
						JogoView jogoView = new JogoView();
						JogoModel jogoModel = new JogoModel(JogoView.jogoPanel, jogoView);
						JogoController jogoController = new JogoController(jogoView, JogoView.jogoPanel, jogoModel, telaInicio);
						jogoView.addKeyListener(jogoController);
						jogoView.getJogoPanel().setCamerax(712);
						jogoView.getJogoPanel().setCameray(460);
						JogoView.fase = 3;
						JogoView.pontosTotal = 0;
						JogoView.pontos = 0;
						JogoView.pokemon1 = 0;
						JogoView.pokemon2 = 0;
						JogoView.pokemon3 = 0;
						JogoView.pokemon4 = 0;
						JogoModel.setTempo(1200);
						jogoModel.run();
					}

				}
			}
		});
		
		faseView.getVoltar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Stub de método gerado automaticamente
				faseView.dispose();
				telaInicio.setVisible(true);
			}
		});
		
	}	

}
