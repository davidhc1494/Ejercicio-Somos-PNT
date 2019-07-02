package ejercicio;

import java.util.ArrayList;

public class SuperMercado {
	
	private ArrayList<Producto> productos;
	
	public SuperMercado() {
		this.productos = new ArrayList<Producto>();		
	}
	
	public void cargar_Productos() {
		Producto p1 = new Gaseosa("Coca-Cola Zero",20,1.5);
		Producto p2 = new Gaseosa("Coca-Cola",18,1.5);
		Producto p3 = new Fruta("Frutillas",64,"kilo");
		Producto p4 = new Cosmetico("Shampoo Sedal",19,500);
		
		this.productos.add(p1);
		this.productos.add(p2);
		this.productos.add(p4);
		this.productos.add(p3);
		
	}
	
	public void mostrar_productos() {
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
	}
	
	public void mayor_precio() {
		int i;
		int posicion = 0;	
			
			for(i=1;i<this.productos.size();i++) {
				if(this.productos.get(posicion).compareTo(this.productos.get(i)) == -1) {
					posicion = i;
				}
			}
			
		System.out.println("Producto más caro: "+this.productos.get(posicion).getNombre());		
	}
	
	public void menor_precio() {		
		int i;
		int posicion = 0;	
			
			for(i=1;i<this.productos.size();i++) {
				if(this.productos.get(posicion).compareTo(this.productos.get(i)) == 1) {
					posicion = i;
				}
			}
			
		System.out.println("Producto más barato: "+this.productos.get(posicion).getNombre());
		
	}
}
