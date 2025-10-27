package modulo_1.classes.lista_4.a1;

public class Usuario {
    private String nome;
    private int login;
    private Playlist playlist;

    public Usuario(String nome, int login, Playlist playlist){
        this.nome = nome;
        this.login = login;
        this.playlist = playlist;
    }

    public Playlist getPlaylist(){
        return playlist;
    }

    public String getNome(){
        return nome;
    }

    public int getLogin(){
        return login;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setLogin(int login){
        this.login = login;
    }

    public void setPlaylist(Playlist playlist){
        this.playlist = playlist;
    }

    public String toString(){
        return "Usuário: "+nome+'\n'+"Login: "+login+'\n'+playlist.toString();
    }
}
