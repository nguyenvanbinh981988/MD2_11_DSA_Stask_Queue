package Quan_ly_khach_san;

import java.text.ParseException;

public class Running {
    public static void main(String[] args) throws ParseException {
        HotelManage hotelManage = new HotelManage();
        while (true){
            hotelManage.menu();
        }
    }
}
