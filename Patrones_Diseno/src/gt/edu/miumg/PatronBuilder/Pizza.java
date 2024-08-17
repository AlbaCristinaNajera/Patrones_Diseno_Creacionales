package gt.edu.miumg.PatronBuilder;

public class Pizza {
    private String masa;
    private String salsa;
    private String relleno;

    private Pizza(PizzaBuilder builder) {
        this.masa = builder.masa;
        this.salsa = builder.salsa;
        this.relleno = builder.relleno;
    }

    //Clase estática dentro de la clase Pizza
    public static class PizzaBuilder {
        private String masa;
        private String salsa;
        private String relleno;

        public PizzaBuilder setMasa(String masa) {
            this.masa = masa;
            return this;
        }

        public PizzaBuilder setSalsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public PizzaBuilder setRelleno(String relleno) {
            this.relleno = relleno;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza [masa=" + masa + ", salsa=" + salsa + ", relleno=" + relleno + "]";
    }
}

