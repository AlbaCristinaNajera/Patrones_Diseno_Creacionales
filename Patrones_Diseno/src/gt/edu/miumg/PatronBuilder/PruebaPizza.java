package gt.edu.miumg.PatronBuilder;

public class PruebaPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setMasa("Crujiente")
                .setSalsa("Tomate")
                .setRelleno("Queso y Pepperoni")
                .build();
        System.out.println(pizza);

        Pizza pizza2 = new Pizza.PizzaBuilder()
                .setMasa("Blanda")
                .setSalsa("Casera")
                .setRelleno("Queso,piña y carne")
                .build();
        System.out.println(pizza2);

        Pizza pizza3 = new Pizza.PizzaBuilder()
                .setMasa("Integral")
                .setRelleno("Carne, albahaca, peperoni y queso")
                .build();
        System.out.println(pizza3);

        Pizza pizza4 = new Pizza.PizzaBuilder()
                .setMasa("Delgada")
                .setRelleno("Queso Mozzarella")
                .build();
        System.out.println(pizza4);
    }

}