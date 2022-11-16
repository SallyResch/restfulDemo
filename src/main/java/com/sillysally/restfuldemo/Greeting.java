package com.sillysally.restfuldemo;

public class Greeting {

    private final long id;
    private final String content;

    //constructor = En struktur för objektet när det instancieras
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
