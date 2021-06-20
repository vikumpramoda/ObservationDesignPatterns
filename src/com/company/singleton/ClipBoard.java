package com.company.singleton;

public class ClipBoard {
    private String content;

    static ClipBoard clipBoard;

    private ClipBoard(){
        System.out.println("Clip board object created");
    }

    public static ClipBoard getInstance(){
        if(clipBoard==null){
            clipBoard=new ClipBoard();
        }
        return clipBoard;
    }

    //copy
    public void copy(String text){
        this.content=text;
    }

    //past
    public void paste(){
        System.out.println(this.content);
    }
}
