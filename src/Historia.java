
public class Historia extends Libro implements Fotocopias{

	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor, TiposDeLibro.HISTORIA);
		
	}

	@Override
	public String sePuedeFotocopiar() {
		 return "Fotocopia de historia";
	}

}
