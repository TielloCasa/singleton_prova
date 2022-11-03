package it.gianluca;

public class Main {

	public static void main(String[] args) {

		Connessione connessione = Connessione.instance();
		System.out.println(connessione);
		
		Query query = new Query();
		System.out.println(query.getConnessione());
		
	}

}
