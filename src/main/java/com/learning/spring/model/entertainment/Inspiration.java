package com.learning.spring.model.entertainment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myInspiration")
public class Inspiration {
    private String lyric = "some lyric";

    public Inspiration(@Value("some lyric injected through constructor") String lyric) {
        System.out.println("Inspiration - constructor called!");
        this.lyric = lyric;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    @Override
    public String toString() {
        return "Inspiration{" +
                "lyric='" + lyric + '\'' +
                '}';
    }
}
