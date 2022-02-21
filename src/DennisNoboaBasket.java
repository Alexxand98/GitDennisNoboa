
public class DennisNoboaBasket {

	public String jugador;
	public int njugador;
	public String nombreHobby;
	
	public DennisNoboaBasket(String jugador, int njugador, String nombreHobby) {
		super();
		this.jugador = jugador;
		this.njugador = njugador;
		this.nombreHobby = nombreHobby;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public int getNjugador() {
		return njugador;
	}

	public void setNjugador(int njugador) {
		this.njugador = njugador;
	}

	public String getNombreHobby() {
		return nombreHobby;
	}

	public void setNombreHobby(String nombreHobby) {
		this.nombreHobby = nombreHobby;
	}
	
}