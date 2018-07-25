package etiquetas.etiquetasFravega;








import static org.junit.Assert.*;

import java.io.IOException;

import test.Controlador;

import org.junit.Assert;
import org.junit.Test;



/**
 * Unit test for simple App.
 */



public class CasosNegativosHojas
	
{
	
	
//============================ CASOS NEGATIVOS - HOJAS ==============================================================================	
//	
	
//	HOJAS
	@Test
	public void Caso07NombresConNumeros() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cNombrConNumeros();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	


	@Test
	public void Caso08NombreVacio() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cNombrConNumeros();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso09AnchoVacio() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cAnchoVacio();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso10AltoVacio() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cAltoVacio();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso11MargenSuperiorVacio() {
		Controlador pruebaUnitaria = new Controlador();
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		pruebaUnitaria.cMargenSuperiorVacio();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso12MargenInferiorVacio() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cMargenInfeiorIzqVacio();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso13MargenIzquieroVacio() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cMargenInfeiorIzqVacio();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso14MargenDerechoVacio() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cMargenDerechoVacio();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso15CrearHojaVacia() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaVacia();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso16CrearHojaCancelar() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaCancelar();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso17CrearHojaAnchoConLetras() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaAnchoConLetras();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso18CrearHojaAltoConLetras() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaAltoConLetras();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso19CrearHojaMargenSupConLetras() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenSupConLetras();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso20CrearHojaMargenInfConLetras() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenInfConLetras();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	@Test
	public void Caso21CrearHojaMargenIzqConLetras() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenIzqConLetras();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	
	@Test
	public void Caso22CrearHojaMargenDerechoConLetras() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenDerechoConLetras();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	
	@Test
	public void Caso23CrearHojaMargenesSuperanHoja() {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("======================================================");
		System.out.println("TEST CASE: "+testName);
		System.out.println("======================================================");
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenesSuperanHoja();
		System.out.println("======================================================");
		System.out.println("|                                                    |");
		System.out.println("|                      OK                            |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");	
	}
	
	
	//============================ CASOS NEGATIVOS - MARCOS ==============================================================================	
//	
	
	
	
	
	
}
