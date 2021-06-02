import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class prueba {
	
	@Test
	public void queSePuedaPrestarUnLibroAUnEstudiante() {
		Biblioteca unlam = new Biblioteca();
		Libro geografia1 = new Libro(101, "Geografia del mundo", "unlam", TiposDeLibro.GEOGRAFIA);
		Estudiante unEstudiante = new Estudiante(40730374, "Douzaklian", "Sol");
		
		unlam.agregarLibro(geografia1);
		unlam.prestamoDeLibro(unEstudiante, "Geografia del mundo");
		
		assertEquals((Integer)1, unEstudiante.getLibrosPrestados());
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
    
   }

}
