import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
	}
	
	public Boolean agregarLibro(Libro nuevoLibro) {
		this.libros.add(nuevoLibro);
		return true;
	}
	
	
	public Boolean prestamoDeLibro(Estudiante estudiante, String libro) {
	
		return true;
	}

}
