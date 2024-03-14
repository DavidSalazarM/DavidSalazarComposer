package co.edu.unbosque.view;
import javax.swing.JOptionPane;
public class View {
	private String message="";
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public int pedirDatoEntero(boolean b) {
		if (b==true){
			message = "ingrese el numero de estrofas";
		}else {
			message = "ingrese el numero de frases";
		}
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,message));
		return numero;
	}
	
	public int menu(){
	    String[] buttons = { "Parametros de su cancion", "Guardar Cancion", "Ver Cancion", "Salir"};
	    int menu = JOptionPane.showOptionDialog(null, "Elija una opcion: ", "Perreo Inteso, nose",
	        JOptionPane.WARNING_MESSAGE, 3, null, buttons, buttons[2]);
	    return menu;
	}

	public void cierreMensaje() {
		JOptionPane.showMessageDialog(null, "Adios");	
	}
	
	public void malosDatosMensaje() {
		JOptionPane.showMessageDialog(null, "ingrese numeros correptos(solo enteros)");
		
	}

}
