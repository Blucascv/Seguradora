package Seguradora;

public class Seguradora {
	
	/*Cadastro de clientes
	Cadastro de contratos
	Lista de clientes
	Lista de contratos
	Cadastro de sinistro (data e porcentagem de perca)
	Lista de sinistro (agrupado por contrato)
	Lista de contratos sem sinistro
	Persistência com serialização*/
	
	public float calcularSeguro(Contrato contrato) {
		
			float valorSeguro = 0.0f;
			
				if(contrato.getTipoContrato() == 1){
				
					try {
						valorSeguro = calculaSeguroResidencial(contrato);
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Não é possível calcular o seguro");
					}
				
			}else if(contrato.getTipoContrato() == 2){
				
				try {
					valorSeguro = calculaSeguroEmpresarial(contrato);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Não é possível calcular o seguro");
				}
				
			}
		
		return valorSeguro;
		
	}

	private float calculaSeguroResidencial(Contrato contrato) throws Exception {
			
		float total = 0;
			
		Residencial res = new Residencial();
		total = contrato.getValorImovel();
		
		total += (total * 0.02);
		
		if (res.getZonaImovel() == 1)//Zona Urbana
			total += (total * 0.01);
		else if(res.getZonaImovel() == 2)//Zona Sub-Urbana
			total += (total * 0.005);
		
		if(res.getTipoResidencia() == 2)//Casa
			total += (total * 0.005);
				
		return total;
			
	}
	
	private float calculaSeguroEmpresarial(Contrato contrato) throws Exception {
				
		float total = 0;
			
		Empresarial emp = new Empresarial();
		
		total = contrato.getValorImovel();
		
		total += (total * 0.04);
		
		total += (int)( emp.getNumFuncionarios() / 10 ) + (total * 0.02);
		
		total += (int)( emp.getNumVisitasDiarias() / 200 ) + (total * 0.03);
		
		if(emp.getRamo() == 1)//Industria
			total += (total * 0.01);
		else if(emp.getRamo() == 2)//Comercio
			total += (total * 0.005);
	
		return total;
		
	}

}
