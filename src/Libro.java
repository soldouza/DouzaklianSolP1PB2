
public class Libro {
	private Integer codigo;
	private String nombre;
	private String autor;
	private TiposDeLibro tipoDeLibro;
	private Boolean estaDisponible;
	
	public Libro(Integer codigo, String nombre, String autor, TiposDeLibro tipo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.estaDisponible = true;
		this.tipoDeLibro = tipo;
	}

	public TiposDeLibro getTipoDeLibro() {
		return tipoDeLibro;
	}


	public void setTipoDeLibro(TiposDeLibro tipoDeLibro) {
		this.tipoDeLibro = tipoDeLibro;
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
