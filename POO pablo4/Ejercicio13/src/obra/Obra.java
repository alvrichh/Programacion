package obra;

import java.util.Date;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Obra {

	private Vivienda vivienda;
	private Material[] material;
	private ManoDeObra manoDeObra;
	private Estancia estancia;
	private Date fechaInicioObra;

	public Obra() {
		vivienda = new Vivienda();
		material = new Material[10];
		manoDeObra = new ManoDeObra();
		estancia = new Estancia();

	}

	public void añadirMaterial(String descripcionMaterial, String proveedor, int unidades, double precioUnidad,
			int iva) {
		for (int i = 0; i < material.length; i++) {
			if (material[i] == null) {
				material[i] = new Material(descripcionMaterial, proveedor, unidades, precioUnidad, iva);
				i = material.length;

			}

		}
	}

	public void eliminarMaterial(int pos) {
		material[pos] = null;
	}

	public String mostrarInformacion() {
		String resultado = "";
		resultado += "Vivienda: \n" + getVivienda().mostrarInformacion();
		resultado += "\nMateriales:";
		for (int i = 0; i < material.length; i++) {
			if (material[i] != null)
				resultado += "\n" + getMaterial()[i].mostrarInformacion();

		}
		resultado += "\nMano de obra: " + getManoDeObra().mostrarInformacion();
		return resultado;

	}

	public Vivienda getVivienda() {
		return vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public Material[] getMaterial() {
		return material;
	}

	public void setMaterial(Material[] material) {
		this.material = material;
	}

	public ManoDeObra getManoDeObra() {
		return manoDeObra;
	}

	public void setManoDeObra(ManoDeObra manoDeObra) {
		this.manoDeObra = manoDeObra;
	}

	public Estancia getEstancia() {
		return estancia;
	}

	public void setEstancia(Estancia estancia) {
		this.estancia = estancia;
	}

	public Date getFechaInicioObra() {
		return fechaInicioObra;
	}

	public void setFechaInicioObra(Date fechaInicioObra) {
		this.fechaInicioObra = fechaInicioObra;
	}

}
