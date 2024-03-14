package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {
	private String confi = ".\\src\\co\\edu\\unbosque\\model\\persistence\\config.properties";
	private Properties prop = new Properties();
	
	public int guardarParametros(int estrofas, int frases){
		try {
			prop.setProperty("numero_de_estrofas", Integer.toString(estrofas));
			prop.setProperty("frases_por_estrofa", Integer.toString(frases));
			prop.store(new FileOutputStream(confi), null);
		} 
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	
	public int[] leerParametros() {
		int[] parametros = new int[2];
		try {
		prop.load(new FileInputStream(confi));
		parametros[0] = Integer.parseInt(prop.getProperty("numero_de_estrofas"));
		parametros[1] = Integer.parseInt(prop.getProperty("frases_por_estrofa"));
		} 
		catch (IOException ex) {
			return null;
		}
		return parametros;
	}
	
	
}	

	