package Seguradora;

public class Empresarial extends Contrato{
	
	//Cliente cliente;
	//private float valorImovel;
	private int numFuncionarios;
	private int numVisitasDiarias;
	private int ramo;//1-Industria; 2-Comercio
	//private String ramo;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	public int getNumVisitasDiarias() {
		return numVisitasDiarias;
	}
	public void setNumVisitasDiarias(int numVisitasDiarias) {
		this.numVisitasDiarias = numVisitasDiarias;
	}
	public int getRamo() {
		return ramo;
	}
	public void setRamo(int ramo) {
		this.ramo = ramo;
	}
	
}
