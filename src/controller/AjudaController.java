package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AjudaView;
import view.TelaInicio;

public class AjudaController {

	private AjudaView ajudaView;
	private TelaInicio telaInicio;

	public AjudaController(AjudaView ajudaView, TelaInicio telaInicio) {
		// TODO Stub de construtor gerado automaticamente
		this.ajudaView = ajudaView;
		this.telaInicio = telaInicio;
	}

	public void contoller() {

		ajudaView.getProximo().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Stub de método gerado automaticamente
				if(ajudaView.getLabel1().isVisible()==true) {

					ajudaView.getLabel1().setVisible(false);
					ajudaView.getLabel2().setVisible(true);

				}

				else if(ajudaView.getLabel2().isVisible()==true) {

					ajudaView.getLabel2().setVisible(false);
					ajudaView.getLabel3().setVisible(true);

				}

				else if(ajudaView.getLabel3().isVisible()==true) {

					ajudaView.getLabel3().setVisible(false);
					ajudaView.getLabel4().setVisible(true);

				}
				else if(ajudaView.getLabel4().isVisible()==true) {

					ajudaView.getLabel4().setVisible(false);
					ajudaView.getLabel5().setVisible(true);

				}
				else if(ajudaView.getLabel5().isVisible()==true) {

					ajudaView.getLabel5().setVisible(false);
					ajudaView.getLabel6().setVisible(true);

				}
				else if(ajudaView.getLabel6().isVisible()==true) {

					ajudaView.getLabel6().setVisible(false);
					ajudaView.getLabel1().setVisible(true);

				}

			}
		});
		
		ajudaView.getAnterior().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Stub de método gerado automaticamente
				if(ajudaView.getLabel1().isVisible()==true) {

					ajudaView.getLabel1().setVisible(false);
					ajudaView.getLabel6().setVisible(true);

				}

				else if(ajudaView.getLabel2().isVisible()==true) {

					ajudaView.getLabel2().setVisible(false);
					ajudaView.getLabel1().setVisible(true);

				}

				else if(ajudaView.getLabel3().isVisible()==true) {

					ajudaView.getLabel3().setVisible(false);
					ajudaView.getLabel2().setVisible(true);

				}
				else if(ajudaView.getLabel4().isVisible()==true) {

					ajudaView.getLabel4().setVisible(false);
					ajudaView.getLabel3().setVisible(true);

				}
				else if(ajudaView.getLabel5().isVisible()==true) {

					ajudaView.getLabel5().setVisible(false);
					ajudaView.getLabel4().setVisible(true);

				}
				else if(ajudaView.getLabel6().isVisible()==true) {

					ajudaView.getLabel6().setVisible(false);
					ajudaView.getLabel5().setVisible(true);

				}
				
			}
		});
		
		ajudaView.getVoltar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Stub de método gerado automaticamente
				
				telaInicio.setVisible(true);
				TelaInicio.getSom().getSom().loop();
				ajudaView.dispose();
				
				
			}
		});

	}

}
