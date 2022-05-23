package Quan_ly_khach_san;

import java.util.Comparator;

public class SortByBirth implements Comparator<Guest> {
    @Override
    public int compare(Guest o1, Guest o2) {
        if (o1.getBirthDay().compareTo(o2.getBirthDay())>0) {
            return 1;
        } else {
            return -1;
        }
    }
}
