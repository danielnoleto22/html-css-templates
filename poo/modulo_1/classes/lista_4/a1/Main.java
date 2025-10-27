package modulo_1.classes.lista_4.a1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*
*   Há um arquivo de teste, basta copiar e colar no terminal 
*/

public class Main {

    public static int makeLogin(){
        Random random = new Random();
        return random.nextInt(1000);
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        int op = -1, anodelancamento, duracao, sub_codigo, sub_duracao, playlist_select = -1, counter_midia = 1;
        String titulo, sub_op = "s", sub_titulo, nomeusuario, nome_playlist;
        Episodio episodio;
        Playlist aux_playlist;
        
        ArrayList<Filme>filmes = new ArrayList<>();
        ArrayList<Serie>series = new ArrayList<>();
        ArrayList<Usuario>usuarios = new ArrayList<>();
        ArrayList<Midia>midias = new ArrayList<>();


        while(op != 0){
            System.out.println("1 >> Adicionar Filme");
            System.out.println("2 >> Adicionar Série");
            System.out.println("3 >> Criar Playlist");
            System.out.println("4 >> Mostrar todas as Mídias");
            System.out.println("5 >> Mostrar todas as Playlists");
            op = scanner.nextInt();
            scanner.nextLine();

            switch(op){
                case 1:
                    System.out.println("Digite o Título");
                    titulo = scanner.nextLine();
                    System.out.println("Digite o Ano de Lançamento");
                    anodelancamento = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a Duração");
                    duracao = scanner.nextInt();
                    scanner.nextLine();

                    midias.add(new Midia(counter_midia, titulo, anodelancamento));
                    filmes.add(new Filme(titulo, counter_midia, anodelancamento, duracao));
                    counter_midia++;
                    break;

                case 2:
                    System.out.println("Digite o Título");
                    titulo = scanner.nextLine();
                    System.out.println("Digite o Ano de Lançamento");
                    anodelancamento = scanner.nextInt();
                    scanner.nextLine();
                    midias.add(new Midia(counter_midia, titulo, anodelancamento));
                    series.add(new Serie(counter_midia, titulo, anodelancamento));
                    counter_midia++;
                    sub_op = "s";

                    while(!sub_op.equals("N") && !sub_op.equals("n")){
                        System.out.println("Deseja Adicionar Um Episódio? s/n");
                        sub_op = scanner.nextLine();
                        if(sub_op.equals("s") || sub_op.equals("S")){
                            System.out.println("Infome o Título");
                            sub_titulo = scanner.nextLine();
                            System.out.println("Informe o Código");
                            sub_codigo = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Infome a Duração");
                            sub_duracao = scanner.nextInt();
                            scanner.nextLine();
                            episodio = new Episodio(sub_codigo, sub_titulo, sub_duracao);
                            // series.add(new Serie(sub_codigo, sub_titulo, anodelancamento));
                            series.getLast().addEpisodio(episodio);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Crie um Nome de Usuário");
                    nomeusuario = scanner.nextLine();
                    
                    System.out.println("Qual Nome Dará a Sua Playlist?");
                    nome_playlist = scanner.nextLine();

                    aux_playlist = new Playlist(nome_playlist);
                    playlist_select = -1;

                    while(playlist_select != 0){
                        System.out.println("Selecione o Código da Mídia que Deseja Adicionar à Playlist\n0 >> Sair");
                        for(Midia i : midias){
                            System.out.println(i.toString());
                        }

                        playlist_select = scanner.nextInt();
                        scanner.nextLine();

                        for(Midia i : midias){
                            if(playlist_select == i.getCodigo()){
                                aux_playlist.addMidiaToPlaylist(i);
                                break;
                            }
                        }

                    }

                    usuarios.add(new Usuario(nomeusuario, makeLogin(), aux_playlist));
                    break;

                case 4:
                    for(Filme i : filmes){
                        System.out.println(i.toString());
                    }
                    for(Serie i : series){
                        System.out.println(i.toString());
                    }
                    break;

                case 5:
                    for(Usuario i : usuarios){
                        System.out.println(i.toString());
                    }
                    break;

                default:
                    break;

            }
        }

        scanner.close();

    }
}
