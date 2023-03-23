/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author l52
 */
public class Rombo extends FormasdosD {
    public String estilo;

	public double area() {
		return (dMayor * dMenor) / 2;
	}

	public void mostrarEstilo() {
		System.out.println("Rombo");
	}
        public static void main(String[] args) {
            Rombo r1 = new Rombo();
            r1.estilo = "Rombo";
            r1.dMayor = 6.0;
            r1.dMenor = 3.0;
		
                
                
                System.out.println("Informacion para r1: ");
                r1.mostrarEstilo();
		r1.mostrarDimension();
		
		System.out.println("El area es " + r1.area());
        }
    
    
}
