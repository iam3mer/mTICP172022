package utp.misiontic2022.c2.p17.unidad4.modelo.vo;

import java.util.Date;

public class Sale {
    private Date sale_date;
    private int id_book;
    private int amount;

    public Sale() {
    }

    public Date getSale_date() {
        return sale_date;
    }

    public void setSale_date(Date sale_date) {
        this.sale_date = sale_date;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}

