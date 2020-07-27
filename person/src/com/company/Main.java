package com.company;

import com.company.person.Dancer;
import com.company.person.Programmer;
import com.company.person.Singer;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Armen","Web dev");
        Singer singer = new Singer("Eminem","Rep");
        Dancer dancer = new Dancer("Sofi","Folk dance");
    }

}