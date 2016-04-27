package ar.edu.unlam.tallerweb.cuenta;

import org.junit.Assert;
import org.junit.Test;

public class testCuenta {
	@Test
	public void testConsultarPositivo(){
		Cuenta miCuenta = new Cuenta(0.00);
		miCuenta.depositar(50.00);
		Double valorObtenido=miCuenta.consultar();
		Double valorEsperado=50.00;
		Assert.assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void testConsultarNegativo(){
		Cuenta miCuenta = new Cuenta(0.00);
		Double valorObtenido=miCuenta.consultar();
		Double valorEsperado=0.00;
		Assert.assertEquals(valorEsperado,valorObtenido);
	}

	@Test
	public void testDepositarBien() {
		Cuenta miCuenta = new Cuenta(100.00);
		Double valorObtenido=miCuenta.depositar(100.00);
		Double valorEsperado=100.00;
		System.out.println(miCuenta.getSaldo());
		Assert.assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void testDepositarMal() {
		Cuenta miCuenta = new Cuenta(-30.00);
		Double valorObtenido=miCuenta.depositar(-30.00);
		Double valorEsperado=0.00;
		Assert.assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void testExtraerBien() {
		Cuenta miCuenta =new Cuenta(50.00);
		miCuenta.depositar(100.00);
		Double valorObtenido=miCuenta.extraer(50.00);
		Double valorEsperado=50.00;
		System.out.println(miCuenta.getSaldo());
		Assert.assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test
	public void testExtraerMal() {
		Cuenta miCuenta =new Cuenta(150.00);
		miCuenta.depositar(100.00);
		Double valorObtenido=miCuenta.extraer(150.00);
		Double valorEsperado=-50.00;
		Assert.assertEquals(valorEsperado,valorObtenido);
		
	}

}

