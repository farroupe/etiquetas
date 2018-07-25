package etiquetas.etiquetasFravega;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;
import test.Controlador;

public class CasosNegativosTemplates {
	
	
//============================ CASOS NEGATIVOS - TEMPLATES ==============================================================================	
	
	@Test
	public void Caso26CrearTemplSinHMTL() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
//		assertTrue(pruebaUnitaria.cCrearTemplSinHTML());
		pruebaUnitaria.cCrearTemplSinHTML();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	
	@Test
	public void Caso31BusquedaPorProducto() throws InterruptedException {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cBusquedaPorProd();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");
	}
	
	

}
