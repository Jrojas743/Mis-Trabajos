/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.basico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author l52
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

		escritura();
		System.out.println(lectura());
	}

	public static String lectura() {
		String texto = new String();
		try {
			FileReader fr = new FileReader("archivo.txt");
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			while ((s = entrada.readLine()) != null) {
				texto += s;
				texto += "\n";
			}
			entrada.close();
		} catch (java.io.FileNotFoundException fnfex) {
			System.out.println("Archivo no encontrado: " + fnfex);
		} catch (java.io.IOException ioex) {
		}
		return texto;
	}

	public static void escritura() {
		try {
			FileWriter fw = new FileWriter("archivo.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.println("U0131771");
			salida.close();
			// continuar escribiendo el archivo
                         bw = new BufferedWriter(new FileWriter("archivo.txt", true));
                        
			salida = new PrintWriter(bw);
                        salida.print("Cuarto semestre ");
			salida.close();
                        
                         bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.println("Ingenieria de Sistemas");
			salida.close();
                        
                         bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.println("Juan Daniel Rojas");
			salida.close();
                        
                         bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.println("1005288873");
			salida.close();
                        
                         bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.println("21");
			salida.close();
			
                        bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.println("4.1 ");
			salida.close();
                        
                         bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.println("Estructura de datos");
			salida.close();
                        
                         bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.println("Bucaramanga");
			salida.close();
                        
                         bw = new BufferedWriter(new FileWriter("archivo.txt", true));
			salida = new PrintWriter(bw);
			salida.println("Martes y jueves");
			salida.close();
		} catch (java.io.IOException ioex) {
		}
        // TODO code application logic here
    }
    
}
