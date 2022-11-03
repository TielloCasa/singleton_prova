package it.gianluca;

public class Connessione {

	private static Connessione inst;
	private String db;
	private String Utente;
	private String pass;
	private String url;
	
	private Connessione() {
		
	}
	
	@Override
	public String toString() {
		return "Connessione [db=" + db + ", Utente=" + Utente + ", pass=" + pass + ", url=" + url + "]";
	}

	public static Connessione instance() {
		Connessione conn;
		if(inst==null) {
			conn = new Connessione();
			conn.setDb("db");
			conn.setPass("pass");
			conn.setUrl("Localhost");
			conn.setUtente("utente");
		}else{
		
			conn = inst;
		}
		
		
		return conn;
	}
	
	
	
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getUtente() {
		return Utente;
	}
	public void setUtente(String utente) {
		Utente = utente;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
