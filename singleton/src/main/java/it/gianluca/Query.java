package it.gianluca;

public class Query {

	private Connessione connessione = Connessione.instance();

	public Connessione getConnessione() {
		return connessione;
	}

	public void setConnessione(Connessione connessione) {
		this.connessione = connessione;
	}
}
