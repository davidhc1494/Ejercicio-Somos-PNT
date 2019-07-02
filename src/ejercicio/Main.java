package ejercicio;

public class Main {	

	public static void main(String[] args) {
		
		SuperMercado s1 = new SuperMercado();
		
		s1.cargar_Productos();
		s1.mostrar_productos();
		System.out.println("=============================");
		s1.mayor_precio();
		s1.menor_precio();	

	}

}
