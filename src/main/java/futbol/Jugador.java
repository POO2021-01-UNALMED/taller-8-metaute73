package futbol;

public class Jugador extends Futbolista{
	public Short golesMarcados;
	public Byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal=7;
	}
	public Jugador(String nombre, int edad, String posicion, Short golesMarcados, Byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	public int compareTo(Futbolista other){
		return Math.abs(this.getEdad() - other.getEdad());
	}
	public boolean jugarConLasManos() {
		return false;
	}
	public String tostring() {
		return "El futbolista" + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
				" con el dorsal " + this.dorsal + ".Ha marcado " + this.golesMarcados;
	}
}
