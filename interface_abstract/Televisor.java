package interface_abstract;

public class Televisor extends Electrodomesticos {
    private String referencia;
    private int canal;
    private int volume;

    public Televisor(String referencia) {
        this.referencia = referencia;
        this.canal = 0;
        this.volume = 0;
    }

    @Override
    public void ligar() {
        super.ligar();
        this.canal = (int) (Math.random() * 100) + 1;
        this.volume = (int) (Math.random() * 50) + 1;
        System.out.println(estado + "\nCanal: " + canal + "\nVolume: " + volume );
    }

    @Override
    public void desligar() {
        super.desligar();
        this.canal = 0;
        this.volume = 0;
        System.out.println(estado + "\nCanal: " + canal + "\nVolume: " + volume );
    }

    public String getReferencia() {
        return referencia;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
