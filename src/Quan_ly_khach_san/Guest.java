package Quan_ly_khach_san;

import java.time.LocalDate;

public class Guest {
    private String name;
    private LocalDate birthDay;
    private int cmnd;

    public Guest() {
    }

    public Guest(String name, LocalDate birthDay, int cmnd) {
        this.name = name;
        this.birthDay = birthDay;
        this.cmnd = cmnd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getCmnd() {
        return cmnd;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", cmnd='" + cmnd + '\'' +
                '}';
    }
}
