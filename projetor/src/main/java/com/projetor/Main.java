package com.projetor;

import model.Reserva;

public class Main {
    public static void main(String[] args) {
        Reserva nova = new Reserva();

        java.sql.Date sysdate = new java.sql.Date(new java.util.Date()).getTime();
        
        nova.setData(sysdate);
        System.out.println(nova.getData());
    }
}