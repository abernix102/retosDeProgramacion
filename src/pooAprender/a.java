package pooAprender;

public class a {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil("bmw","nose xd", 2001);
        auto2.setMarca("zapallo");
        System.out.println("auto 2, marca: " + auto2.getMarca());
/*
        auto1.getMarca();
*/
        /*System.out.println("auto 2, marca: " + auto2.marca);*/
    }
}
