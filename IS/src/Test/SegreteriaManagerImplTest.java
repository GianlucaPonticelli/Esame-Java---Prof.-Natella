package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ControllerImpl.SegreteriaManagerImpl;

public class SegreteriaManagerImplTest {

	@Test
	public void test1() {
		Stub.StubBuilder.build_all();
		SegreteriaManagerImpl segreteriamanagerimpl = new SegreteriaManagerImpl();
		assertEquals(null, segreteriamanagerimpl.ConsultaElencoPrenotati("97")); //97 è un id non veriterio
	
	}
	
	@Test
	public void test2() {
		Stub.StubBuilder.build_all();
		SegreteriaManagerImpl segreteriamanagerimpl = new SegreteriaManagerImpl();
		assertNotEquals(0, segreteriamanagerimpl.ConsultaElencoPrenotati("21").size()); //97 è un id non veriterio
	
	}
}
