package taller_OCP.ejercicio1;



public class Main {
    public static void main(String[] args) {
        double precioOriginal = 100.0;

       
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20); // 20%
        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento del 20%: $" + precioConDescuentoPorcentaje);

       
        Descuento descuentoFijo = new DescuentoFijo(15); // $15
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento fijo de $15: $" + precioConDescuentoFijo);
    }
}