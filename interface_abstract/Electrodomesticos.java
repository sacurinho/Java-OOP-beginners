package interface_abstract;

public abstract class Electrodomesticos implements ElectroStates {

    protected String estado;

    public String estado() {
        return " ";
    }

    @Override
    public void ligar() {
        this.estado = "Ligado";
    }

    @Override
    public void desligar() {
        this.estado = "Desligado";
    }
}
