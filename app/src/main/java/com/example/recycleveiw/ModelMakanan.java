package com.example.recycleveiw;


public class ModelMakanan {
    private String namaMakanan;
    private String hargaMakanan;
    private String infoMakanan;
    private int gambarasal;

    public ModelMakanan(String namaMakanan, String hargaMakanan, int gambarasal, String infoMakanan){
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.gambarasal = gambarasal;
        this.infoMakanan = infoMakanan;
    }

    public String getNamaMakanan(){
        return namaMakanan;
    }
    public String getHargaMakanan(){
        return hargaMakanan;
    }
    public int getGambarasal(){
        return gambarasal;
    }
    public String getInfoMakanan(){
        return infoMakanan;
    }
}