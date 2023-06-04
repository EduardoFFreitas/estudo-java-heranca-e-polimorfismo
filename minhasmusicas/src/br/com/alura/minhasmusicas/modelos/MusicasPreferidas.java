package br.com.alura.minhasmusicas.modelos;

public class MusicasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é mt brabo");
        } else{
            System.out.println(audio.getTitulo() + " é maneiro mas nem tanto");
        }


    }
}
