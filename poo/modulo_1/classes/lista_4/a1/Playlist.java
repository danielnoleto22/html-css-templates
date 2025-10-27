package modulo_1.classes.lista_4.a1;
import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Midia>playlist;

    public Playlist(String nome){
        this.nome = nome;
        this.playlist = new ArrayList<Midia>();
    }

    public void addMidiaToPlaylist(Midia midia){
        this.playlist.add(midia);
    }

    public void removeMidiaToPlaylist(Midia midia){
        this.playlist.remove(midia);
    }

    public String getNome(){
        return nome;
    }

    public ArrayList<Midia> getPlaylist(){
        return playlist;
    }

    public String toString(){
        String return_playlist = "Playlist: "+nome+'\n';
        for(Midia i : playlist){
            return_playlist += "Título: "+i.getTitulo() + '\n';
            return_playlist += "Ano de Lançamento: "+i.getanoLancamento()+'\n';
            return_playlist += "Código: "+i.getanoLancamento()+'\n';
        }
        return return_playlist;
    }
}   
