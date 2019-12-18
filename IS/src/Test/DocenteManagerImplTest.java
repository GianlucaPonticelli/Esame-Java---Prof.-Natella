package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ControllerImpl.DocenteManagerImpl;

public class DocenteManagerImplTest {

	@Test
	public void test1() {
		Stub.StubBuilder.build_all();
		DocenteManagerImpl docentemanagerimpl = new DocenteManagerImpl();
		assertEquals (null, docentemanagerimpl.ConsultaElencoPrenotati("99")); //99 � un id non veriterio!
		}
	
	@Test
	public void test2() {
		Stub.StubBuilder.build_all();
		DocenteManagerImpl docentemanagerimpl = new DocenteManagerImpl();
		assertNotEquals (0, docentemanagerimpl.ConsultaElencoPrenotati("22").size()); //22 � un id veriterio!
		}
}

