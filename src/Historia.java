
public class Historia extends Libro implements Fotocopias{

	public Historia(Integer codigo, String nombre, String autor, TiposDeLibro tipoDeLibro) {
		super(codigo, nombre, autor, tipoDeLibro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sePuedeFotocopiar() {
		
	}

}
