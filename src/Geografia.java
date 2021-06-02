
public class Geografia extends Libro implements Fotocopias{


	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor, TiposDeLibro.GEOGRAFIA);
	}

	@Override
	public String sePuedeFotocopiar() {
		return "Fotocopia de geografia";
	}

}
