package stc;

import java.util.HashSet;

public class sett {
    public static void main(String[] args) {
        //En Java, un Set es una estructura de datos que representa una colección que no permite elementos duplicados. Hay varios tipos de Set, y cada uno tiene una implementación y comportamiento distintos respecto al almacenamiento en memoria y rendimiento.
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicado, no se
        //Al agregar un elemento, se calcula su hash.
        //
        //Si no hay colisiones, se guarda en esa posición.

        System.out.println(set); // [Java, Python] (el orden puede variar)
    }
}
