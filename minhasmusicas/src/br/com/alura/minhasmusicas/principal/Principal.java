package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.MusicasPreferidas;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musicaGoodbye = new Musica();
        musicaGoodbye.setTitulo("Ramsey - Goodbye");
        musicaGoodbye.setAlbum("Arcane");
        musicaGoodbye.setCantor("Ramsey");
        musicaGoodbye.setGenero("Sad");

        Podcast bisgodinhoPodcast = new Podcast();
        bisgodinhoPodcast.setTitulo("Bisgodinho Podcast");
        bisgodinhoPodcast.setApresentador("Bisgode");
        bisgodinhoPodcast.setDescricao("Podcast sei lakkkkk lorem se pa");
        MusicasPreferidas musicasPreferidas = new MusicasPreferidas();

        for (var i =0; i < 100; i++){
            bisgodinhoPodcast.curte();
            bisgodinhoPodcast.reproduz();
        }

        for (var i =0; i < 2050; i++){
            musicaGoodbye.curte();
            musicaGoodbye.reproduz();
        }


        musicasPreferidas.inclui(bisgodinhoPodcast);
        musicasPreferidas.inclui(musicaGoodbye);


    }
}
