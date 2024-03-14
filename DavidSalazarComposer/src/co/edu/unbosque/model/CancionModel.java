package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.OpcioneFiles;
import co.edu.unbosque.model.persistence.Propiedades;
import java.util.Random;


public class CancionModel {
	private Propiedades propiedades = new Propiedades();
	private OpcioneFiles files = new OpcioneFiles(); 
	private String[] sustantivos = new String[]{"mami","bebe","princesa","bandida","mardita"};
	private String[] sujetos = new String[]{"yo quiero", "yo puedo", "yo vengo a", "voy a"}; 
	private String[] verbos  = new String[] { "encenderte", "amarte", "ligar","jugar"};
	private String[] adjetivos  = new String[]{ "suave", "lento", "rápido","fuerte"};
	private String[] tiempo  = new String[]{"hasta que salga er sol", "toda la noche", "hasta el amanecer", "todo el dia"};
	private String[] descriptivos  = new String[]{"sin anestesia", "sin compromiso", "feis to feis","sin miedo" };
	
	private String cancion="  ";
	
	public void reguetonParametros(int estrofas, int frases){
		propiedades.guardarParametros(estrofas,frases);
	}

	public void guardarCancion(){		
	crearCancion();
	files.saveFile(cancion);
	}
	
	public String leerCancion(){
		return files.readFile();
	}
	
	public void crearCancion() {
		int[] parametros = propiedades.leerParametros();

		for(int i = 0;i <= (parametros[0]-1);i++){
			for(int j = 0;j <= (parametros[1]-1);j++){
				cancion += sustantivos[new Random().nextInt(5)]+ " "
						+ sujetos[new Random().nextInt(4)]+ " "
						+ verbos[new Random().nextInt(4)]+ " "
						+ adjetivos[new Random().nextInt(4)]+ " "
						+ tiempo [new Random().nextInt(4)]+ " "
						+ descriptivos[new Random().nextInt(4)]+ "\n";
			}
			cancion += "\n";
		}
	}
}
