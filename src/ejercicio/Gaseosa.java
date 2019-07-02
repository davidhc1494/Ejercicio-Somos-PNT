package ejercicio;

public class Gaseosa extends Producto {
	
	private double litros;	
	
	public Gaseosa(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.litros = litros;
	}	

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	public String toString() {		
		return "Nombre: "+this.getNombre()+" /// Litros: "+this.getLitros()+" /// Precio: $"+this.getPrecio();
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
