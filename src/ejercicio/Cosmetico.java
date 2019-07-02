package ejercicio;

public class Cosmetico extends Producto {

	private int contenido;
	
	public Cosmetico(String nombre, int precio, int contenido) {
		super(nombre, precio);
		this.contenido = contenido;				
	}
	
	public int getContenido() {
		return contenido;
	}
	
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public String toString() {		
		return "Nombre: "+this.getNombre()+" /// Contenido: "+this.getContenido()+"ml /// Precio: $"+this.getPrecio();
	}

	
	public int compareTo(Producto producto) {
		int resultado = 0;
		 if(this.getPrecio()>producto.getPrecio()) {
			 resultado = 1;			 
		 }else{
			 if(this.getPrecio()<producto.getPrecio()) {
				 resultado = -1;
			 }else {
				 resultado = 0;
			 }
		 }
		return resultado;
	}

}
