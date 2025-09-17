/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;


/**
 *
 * @author GastonCejas
 */
public class Impuesto {
	private double monto;
	private Contribuyente contribuyente;

	public Impuesto(double monto) {
		this.monto = monto;		
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Contribuyente getContribuyente() {
		return contribuyente;
	}

	public void setContribuyente(Contribuyente contribuyente) {
		this.contribuyente = contribuyente;
	}

    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return "Impuesto{" +
				"monto=" + monto +
				", contribuyente=" + contribuyente +
				'}';
	}
}