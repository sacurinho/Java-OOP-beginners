package interface_abstract;

public class Radio extends Electrodomesticos {
		public static final String BANDA1 = "AM";
	    public static final String BANDA2 = "FM";

	    private String sintonia;
	    private int volume;
	    private String banda;

	    public Radio() {
	        this.sintonia = "";
	        this.volume = 0;
	        this.banda = "-";
	    }

	    @Override
	    public void ligar() {
	        super.ligar();
	        this.sintonia = "100.0";
	        this.volume = 10;
	        this.banda = BANDA1;
	        System.out.println(estado + "\nCanal: " + sintonia+ "\nVolume: " + volume + "\nBanda: " +banda);
	    }

	    @Override
	    public void desligar() {
	        super.desligar();
	        this.sintonia = "";
	        this.volume = 0;
	        this.banda = "-";
	        System.out.println(estado + "\nCanal: " + sintonia+ "\nVolume: " + volume + "\nBanda: " +banda);
	    }

	    public String getSintonia() {
	        return sintonia;
	    }

	    public int getVolume() {
	        return volume;
	    }

	    public String getBanda() {
	        return banda;
	    }
}
