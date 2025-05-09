package pooAprender;

public class Automovil {
    private String marca;
    private String modelo;
    private int fabricacion;

    public Automovil() {
    }
/*
    usamos encapsulamineto
*/
    public Automovil(String marca, String modelo, int fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
    }

    void acelerar(){
        System.out.println("acelerar");
    }
    String frenar(){
        return "Frenar";
    }
/*
    se deben definir los metodos de acceso
*/
    public String getMarca(){
        return this.marca;
    }
    void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

