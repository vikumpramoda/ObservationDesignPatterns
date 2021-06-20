package com.company.adoptor;

public class Main {
    public static void main(String[] args){

        MoviePlayer moviePlayer = new MP3Player();
        moviePlayer.play();

        MoviePlayer moviePlayer2=new ImageAdaptor();
        moviePlayer2.play();

    }
}
