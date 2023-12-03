package model;

import java.sql.Date;

public class Reserva {
    private int id;
    private java.sql.Date data;
    private int id_professor;
    private int id_dataShow;

    public Reserva() {
    }
    
    public Reserva(int id, Date data, int id_professor, int id_dataShow) {
        this.id = id;
        this.data = data;
        this.id_professor = id_professor;
        this.id_dataShow = id_dataShow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.sql.Date getData() {
        return data;
    }

    public void setData(java.sql.Date data) {
        this.data = data;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public int getId_dataShow() {
        return id_dataShow;
    }

    public void setId_dataShow(int id_dataShow) {
        this.id_dataShow = id_dataShow;
    }

    
}
