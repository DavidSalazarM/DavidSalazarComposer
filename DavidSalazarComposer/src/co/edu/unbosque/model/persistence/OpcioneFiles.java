package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


import javax.swing.JFileChooser;

public class OpcioneFiles {
	
	private String path =  ".\\src\\co\\edu\\unbosque\\data";
	public void saveFile(String data) {
	    JFileChooser chooser = new JFileChooser();
	    chooser.setCurrentDirectory(new File(path));
	    int retrival = chooser.showSaveDialog(null);
	    if (retrival == JFileChooser.APPROVE_OPTION) {
	    	try(FileWriter fw = new FileWriter(chooser.getSelectedFile()+".txt")) {
	    	    fw.write(data.toString());
	    	    fw.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}
	
	public String readFile(){
		String linea = "";
		String cadena = "";
		JFileChooser chooser = new JFileChooser(path);
	    if (chooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION) {
			try {
				File file = chooser.getSelectedFile();
				FileReader fr = new FileReader(file); 
				BufferedReader br = new BufferedReader(fr); 
				linea = br.readLine();    
				while (linea != null) {    
					cadena += linea + "\n";       
					linea = br.readLine(); 
				}
				fr.close();   
				
	    } catch (Exception ex) {
            ex.printStackTrace();
        }
	} return cadena;
	}
	}
