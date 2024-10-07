import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph {
    ArrayList<Vertex> V; //skuespillere
    ArrayList<Vertex> E; //filmer
    Map<List<String>, Integer> w;

    public class Vertex {
        String nm_id;
        String navn;
        ArrayList<String> tt_id_a;
        String tt_id;
        String tittel;
        double rating;

        public void SetActor(String nm_id, String navn, ArrayList<String> tt_id_a){
            this.nm_id = nm_id;
            this.navn = navn;
            for (String filmer : tt_id_a) {
                this.tt_id_a.add(filmer);
            }
        }

        public void SetMovie(String tt_id, String tittel, double rating){
            this.tt_id = tt_id;
            this.tittel = tittel;
            this.rating = rating;
        }

        private String GetNm_id(){
            if (nm_id != null) {
                return nm_id;
            }
            return null;
        }
        private String GetTittel(){
            if (tittel != null) {
                return tittel;
            }
            return null;
        }
        private double GetRating(){
            if (rating != 0) {
                return rating;
            }
            return 0;
        }
        private String Getnavn(){
            if (navn != null) {
                return navn;
            }
            return null;
        }
        private String GetTt_id(){
            if (tt_id != null) {
                return tt_id;
            }
            return null;
        }
        private ArrayList<String> GetTt_id_a(){
            if (!tt_id_a.isEmpty()) {
                return tt_id_a;
            }
            return null;
        }
        
    
        // equals and hashCode
    }

    private void BuildGraph(String[] lineActor, String[] lineMovie){
        
        Vertex v = new Vertex();
        Vertex u = new Vertex();

    }
    

    

}
