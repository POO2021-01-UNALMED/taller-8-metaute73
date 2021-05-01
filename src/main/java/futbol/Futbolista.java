package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
	private  String nombre;
	private int edad;
	private final  String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	public Futbolista(String n, int e, String p) {
		nombre = n;
		edad = e;
		posicion = p;
	}
	
	public String tostring() {
		return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
		
	}
	public boolean equals(Futbolista f) {
		if (this.equals(f)){
			return true;
		}
		else {
			return false;
		}
	}
	public abstract boolean jugarConLasManos();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public String getPosicion() {
		return posicion;
	}
}