/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author l52
 */
public class Triangulo extends FormasdosD {
    

	public String estilo;

	public double area() {
		return (ancho * altura) / 2;
	}

	public void mostrarEstilo() {
		System.out.println("El triangulo es " + estilo);
	}
}
