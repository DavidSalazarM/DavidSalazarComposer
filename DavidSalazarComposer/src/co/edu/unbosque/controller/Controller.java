package co.edu.unbosque.controller;
import co.edu.unbosque.model.CancionModel;
import co.edu.unbosque.view.View;

public class Controller {
	private CancionModel model = new CancionModel();
	private View view = new View();
	
	public Controller(){
		main();
	}

	private void main() {
		switch (view.menu()){
		case 0: {try {
			model.reguetonParametros(view.pedirDatoEntero(true), view.pedirDatoEntero(false));
			}catch (NumberFormatException e) {
				view.malosDatosMensaje();
			}
			break;
		}
		case 1: {
			model.guardarCancion();
			break;
		}
		case 2: {
			view.mostrarResultados(model.leerCancion());
			break;
		}
		case 3: {
			view.cierreMensaje();
			System.exit(0);
		}
		default:
			break;
		}
		main();	
	}
}
