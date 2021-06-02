import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class prueba {
	@Test
	public void queSePuedaCrearUnaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		
		assertNotEquals(null, biblioteca);
	}
	@Test
	public void queSePuedaCrearUnLibro() {
		Libro unLibro = new Libro(1, "libro", "libro", TiposDeLibro.GEOGRAFIA);
		
		assertEquals("libro", unLibro.getNombre());
	}
	@Test
	public void queSePuedaCrearUnEstudiante() {
		Estudiante unEstudiante = new Estudiante(40730374, "solcito", "douza");
		
		assertEquals((Integer)40730374, unEstudiante.getDni());
	}
	@Test
	public void queSePuedaPrestarUnLibroAUnEstudiante() {
		Biblioteca unlam = new Biblioteca();
		Libro geografia1 = new Libro(101, "Geografia del mundo", "unlam", TiposDeLibro.GEOGRAFIA);
		Estudiante unEstudiante = new Estudiante(40730374, "Douzaklian", "Sol");
		
		unlam.agregarLibro(geografia1);
		unlam.prestamoDeLibro(unEstudiante, "Geografia del mundo");
		
		assertEquals(1, unEstudiante.getLibrosPrestados().size());
    }

   @Test
    public void queNoSePuedaPrestarMasDeDosLibrosALaVez() {
        Biblioteca uba = new Biblioteca();
        Libro matematicas1 = new Libro(100, "matematica del mundo", "unlam", TiposDeLibro.MATEMATICAS);
        Libro historia1 = new Libro(102, "Historia del mundo", "unlam", TiposDeLibro.HISTORIA);
        Libro hitoria2 = new Libro(103, "Historia del mundo 1", "unlam", TiposDeLibro.HISTORIA);
        Estudiante otroEstudiante = new Estudiante(2222222,"Lopes","Camila");

        uba.agregarLibro(matematicas1);
        uba.agregarLibro(historia1);
        uba.prestamoDeLibro(otroEstudiante, "Historia del mundo");
        
        assertEquals((Integer)1, otroEstudiante.getLibrosPrestados());
    
   }

}
