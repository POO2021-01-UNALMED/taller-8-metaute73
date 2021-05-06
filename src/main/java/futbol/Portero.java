package futbol;

public class Portero extends Futbolista{
	public Short golesRecibidos;
	public Byte dorsal;
	public Portero(String nombre, int edad, Short golesRecibidos, Byte dorsal) {
		super(nombre, edad,"Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public String tostring() {
		return "El futbolista" + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
				" con el dorsal " + this.dorsal + ".Le han marcado " + this.golesRecibidos;
	}
	public int compareTo(Object other) {
		return Math.abs(this.golesRecibidos - ((Portero)other).golesRecibidos);
	}
	public boolean jugarConLasManos() {
		return true;
	}
}
