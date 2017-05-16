package Seguradora;

public class Residencial extends Contrato{
	
	private String endImovel;
	private int zonaImovel;//1-Urbana; 2-Sub-Urbana; 3-Rural
	private int tipoResidencia;//1-Apartamento; 2-Casa
	
	/*private String zonaImovel;//1-Urbana; 2-Sub-Urbana; 3-Rural
	private String tipoResidencia;//1-Apartamento; 2-Casa*/
	
	public String getEndImovel() {
		return endImovel;
	}
	public void setEndImovel(String endImovel) {
		this.endImovel = endImovel;
	}
	public int getZonaImovel() {
		return zonaImovel;
	}
	public void setZonaImovel(int zonaImovel) {
		this.zonaImovel = zonaImovel;
	}
	public int getTipoResidencia() {
		return tipoResidencia;
	}
	public void setTipoResidencia(int tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}
	
}
