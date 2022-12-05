package convo1;

public class televisor {
	private String nombre;
	private String marca;
	private String tamano;
	private double precio;
	public televisor(String nombre, String marca, String tamano, double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.tamano = tamano;
		this.precio = precio;
	}
	public void mostrar() {
		System.out.println("El " + nombre + " marca " + marca + " de " + tamano + " valor = " + precio);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
