package com.midway.ocp8.model;

import lombok.Data;

@Data
public class DVDInfo {
    private String title;
    private String genre;
    private String leadActor;

    public DVDInfo(final String title, final String genre, final String leadActor) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
    }
}
