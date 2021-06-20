package com.company.adoptor;

public class ImageAdaptor implements MoviePlayer{
    ImagePlayer imagePlayer=new ImagePlayer();

    @Override
    public void play() {
        imagePlayer.show();
    }
}
