package ejercicio;

public class Fruta extends Producto {
	
	private String unidad_Venta;
	
	public Fruta(String nombre, int precio, String unidad_Venta) {
		super(nombre, precio);		
		this.unidad_Venta = unidad_Venta;
	}
		
	public String getUnidad_Venta() {
		return unidad_Venta;
	}

	public void setUnidad_Venta(String unidad_Venta) {
		this.unidad_Venta = unidad_Venta;
	}

	public String toString() {		
		return "Nombre: "+this.getNombre()+" /// Precio: $"+this.getPrecio()+" /// Unidad de venta: "+this.unidad_Venta;
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
