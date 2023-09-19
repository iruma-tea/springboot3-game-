package com.example.game;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class History {
    private int seq;
    private int yourAnswer;
    private String result;
}
