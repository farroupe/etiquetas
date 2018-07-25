package etiquetas.etiquetasFravega;

import org.junit.Test;

import test.Controlador;

public class CasosNegativosMarcos {

//----------------------------------- Casos Negativos Marcos -------------------------------
	
	@Test
	public void Caso27CreaMarcoCamposVacios() {
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoCamposVacios();
	System.out.println("OK");
	}
	
	@Test
	public void Caso28CreaMarcoNombreVacio(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoNombreVacio();
	}
	
	@Test
	public void Caso29CreaMarcoAnchoVacio(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoAnchoVacio();
	}
	
	@Test
	public void Caso30CreaMarcoAltoVacio(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoAltoVacio();
	}
	
	@Test
	public void Caso31CreaMarcoNombreSuperaLimite(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoNombreSuperaLimite();
	}
	
	@Test
	public void Caso32CreaMarcoAnchoSuperaLimite(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoAnchoSuperaLimite();
	}
	
	@Test
	public void Caso33CreaMarcoAltoSuperaLimite(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoAltoSuperaLimite();
	}
	
	@Test
	public void Caso34CreaMarcoYCancela(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoYCancela();
	}
	
	@Test
	public void Caso35CreaMarcoAltoIngresaLetras(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoAltoIngresaLetras();
	}
	
	@Test
	public void Caso36CreaMarcoAnchoIngresaLetras(){
	Controlador pruebaUnitaria = new Controlador();
	pruebaUnitaria.cCreaMarcoAnchoIngresaLetras();
	}
	
	
}
