package Quan_ly_khach_san;

public class Hotel implements Comparable<Hotel> {
    private String Phong;
    private double gia;
    private int floor;

    public Hotel() {
    }

    public Hotel(String phong, double gia, int floor) {
        Phong = phong;
        this.gia = gia;
        this.floor = floor;
    }

    public void setPhong(String phong) {
        Phong = phong;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getPhong() {
        return Phong;
    }

    public double getGia() {
        return gia;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Phong='" + Phong + '\'' +
                ", gia=" + gia +
                ", floor=" + floor +
                '}';
    }

    @Override
    public int compareTo(Hotel o) {
        if (this.getGia() > o.getGia()) {
            return 1;
        } else {
            return -1;
        }
    }
}
