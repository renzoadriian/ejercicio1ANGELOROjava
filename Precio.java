package ejercicio1;
import java.util.Scanner;
public class Precio {
	private Scanner teclado;
	private int precio;
	private int cantidad;
	private int resultado;
public void cargar(){
	teclado=new Scanner(System.in);
	System.out.print("Ingrese precio de compra:");
	precio=teclado.nextInt();
	System.out.print("Ingrese cantidad de articulos:");
	cantidad=teclado.nextInt();
}
public void calculo(){
resultado=precio*cantidad;
System.out.println("Precio ingresado:"+precio);
System.out.println("Cantidad de articulos ingresada:"+cantidad);
System.out.println("Monto total:"+resultado);
}
public static void main(String[]ar){
	Precio precio1;
	precio1=new Precio();
	precio1.cargar();
	precio1.calculo();
	
}

}