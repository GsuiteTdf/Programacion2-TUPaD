/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;


/**
 *
 * @author GastonCejas
 */
public class ClaveSeguridad {
	private String codigo;
	private String ultimaModificacion;

	public ClaveSeguridad(String codigo, String ultimaModificacion) {
		this.codigo = codigo;
		this.ultimaModificacion = ultimaModificacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
		// Actualizar la fecha de modificación como String (ejemplo: fecha y hora actual)
		this.ultimaModificacion = java.time.LocalDateTime.now().toString();
	}

	public String getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(String ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return "ClaveSeguridad{" +
				"codigo='" + codigo + '\'' +
				", ultimaModificacion=" + ultimaModificacion +
				'}';
	}
}