package com.example.thoitiet2;

public class ThoiTiet {
    int anh;
    String ten, nhietdo, kieu;

    public ThoiTiet() {
    }

    public ThoiTiet(String ten, String nhietdo, String kieu) {
        this.ten = ten;
        this.nhietdo = nhietdo;
        this.kieu = kieu;
    }

    public ThoiTiet(int anh, String ten, String nhietdo, String kieu) {
        this.anh = anh;
        this.ten = ten;
        this.nhietdo = nhietdo;
        this.kieu = kieu;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhietdo() {
        return nhietdo;
    }

    public void setNhietdo(String nhietdo) {
        this.nhietdo = nhietdo;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }
}
