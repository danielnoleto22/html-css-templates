package modulo_1.classes.lista_4.a1;
import java.util.ArrayList;

public class Serie extends Midia{
    private ArrayList<Episodio>episodios;

    public Serie(int codigo, String titulo, int anoLancamento){
        super(codigo, titulo, anoLancamento);
        this.episodios = new ArrayList<Episodio>();
    }

    public void addEpisodio(Episodio episodio){
        this.episodios.add(episodio);
    }

    public ArrayList<Episodio> getEpisodios(){
        return episodios;
    }

    public String toString(){
        String return_serie = "Tipo: Série\n"+super.toString();
        return_serie += "Episódios:\n";

        for(Episodio i : episodios){
            return_serie += i.toString();
        }

        return return_serie;
    }
}
