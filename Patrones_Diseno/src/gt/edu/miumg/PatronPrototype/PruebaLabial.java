package gt.edu.miumg.PatronPrototype;

public class PruebaLabial {
    public static void main(String[] args) throws CloneNotSupportedException {
        try{
            // Crea un producto prototipo
            ProductoLabial labialOriginal = new ProductoLabial("Labial liquido", "cereza", 110.00);

            // Clonando el producto para crear una nueva variante
            ProductoLabial labialClonado = labialOriginal.clone();
            labialClonado.setTono("Rojo");
            labialClonado.setNombre("Labial Mate");

            //Producto clonado del clon
            ProductoLabial labialClone3 = labialClonado.clone();
            labialClone3.setNombre("Labial Mate2");

            // Mostrando ambos productos
            System.out.println("Producto original: " + labialOriginal);
            System.out.println();
            System.out.println("Producto clonado: " + labialClonado);
            System.out.println();
            System.out.println("Producto clonado del clon: " + labialClone3);


        }catch (CloneNotSupportedException e){
            System.out.println("Clonado no encontrado");
        }


    }
}
