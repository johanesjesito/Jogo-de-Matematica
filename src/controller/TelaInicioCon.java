package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Backup;
import view.AjudaView;
import view.FaseView;
import view.Mensagem;
import view.PainelFaseView;
import view.TelaInicio;

public class TelaInicioCon {
	
	Mensagem mensagem = new Mensagem();
	TelaInicio telaInicio;
	
	public TelaInicioCon(TelaInicio telaInicio) {

		this.telaInicio = telaInicio;

		telaInicio.getIniciar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (TelaInicio.getNomeJogador().getText().equals(""))
					Mensagem.exibir("Preencha o nome");
				else {
					FaseView faseView = new FaseView(new PainelFaseView());
					new FaseController(faseView, telaInicio);
					telaInicio.setVisible(false);
				}
					
			}
		});

		telaInicio.getAjuda().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				AjudaView ajudaView = new AjudaView();
				new AjudaController(ajudaView, telaInicio).contoller();
				
				telaInicio.setVisible(false);
				TelaInicio.getSom().getSom().stop();
			}
		});

		telaInicio.getCreditos().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mensagem.imagem("Creditos", "Creditos.png");

			}
		});

		telaInicio.getRank().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Mensagem.exibir("Ultima Pontuação:\n"+"Nome: "+Backup.ler().getNome()+"\nPontuação: "+Backup.ler().getPotuacao());

			}
		});

		telaInicio.getSair().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Mensagem.confirmacao("Deseja sair?", "Sair") == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

	}

}
