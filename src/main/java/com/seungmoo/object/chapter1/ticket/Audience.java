package com.seungmoo.object.chapter1.ticket;

import lombok.Getter;

@Getter
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }
}
