package ar.edu.unlam.tallerweb.tarea2;

public class Cuenta {
	//ATRIBUTOS
	private Double saldo=0.00;
	private Double importe=0.00;
	
	//CONSTRUCTOR
	public Cuenta(Double importe){
		this.importe=importe;
	}
	
	public Double depositar(Double importe){
		getSaldo();
		if (importe > 0.00){
		saldo=saldo+importe;
		return saldo;			
		}
		else{
		System.out.println("El importe depositado no es válido");
		return saldo;			
		}
	}

	public Double extraer(Double importe) {
		getSaldo();
		saldo=saldo-importe;
		if(saldo > 0.00){
		return saldo;			
		}
		else{
		System.out.println("La extracción no puede realizarse");
		return saldo;			
		}
	}

	public Double consultar() {
		getSaldo();
		if(saldo > 0.00){
			System.out.println(saldo);
			return saldo;	
		}
		else{
		System.out.println("El saldo es inválido");
		return saldo;			
		}
	}

	public Double getSaldo() {
		return saldo;
	}

}
