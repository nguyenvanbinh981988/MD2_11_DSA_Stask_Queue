package Quan_ly_khach_san;

import java.util.Comparator;

public class SortbyCmnd implements Comparator<Guest> {
    @Override
    public int compare(Guest o1, Guest o2) {
        if (o1.getCmnd() > o2.getCmnd()) {
            return 1;
        } else {
            return -1;
        }
    }
}
