package app;

import controller.TelaInicioCon;
import view.PainelTelaInicio;
import view.TelaInicio;

public class App {

	public static void main(String[] args) {
		TelaInicio telaInicio = new TelaInicio(new PainelTelaInicio());
		new TelaInicioCon(telaInicio);
	}
	
}
