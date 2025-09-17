/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;


/**
 *
 * @author GastonCejas
 */
public class Render {
	private String formato;
	private Proyecto proyecto; // Asociación unidireccional a Proyecto

	public Render(String formato) {
		this.formato = formato;
		}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return "Render{" +
				"formato='" + formato + '\'' +
				", proyecto=" + proyecto +
				'}';
	}
}