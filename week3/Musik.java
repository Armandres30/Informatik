public class Musik {
  // Attribute
  public String     titel;
  public String     interpret;
  public String     album;
  public int        laenge;             // in s
  public String     erscheinungsdatum;  // ISO-8601 (JJJJ-MM-TT)

  // Konstruktor
     public Musik(String titel, String interpret, String album, int laenge, String erscheinungsdatum) {{
      this.titel = titel;
      this.interpret = interpret;
      this.album = album;
      this.laenge = laenge;
      this.erscheinungsdatum = erscheinungsdatum;
}

  // Methoden
  public String toString() {
      return this.titel+"("+
				this.interpret+" interpret, "+ 
				this.album + " Album, " +
        this.laenge + "min, " +
        this.erscheinungsdatum+
				")";
    }
}
