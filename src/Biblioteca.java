import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
	}
	
	private Boolean agregarLibro(Libro nuevoLibro) {
		return true;
	}
	private Boolean prestamoDeLibro(Estudiante estudiante, TiposDeLibro tipo) {
		return true;
	}
}
