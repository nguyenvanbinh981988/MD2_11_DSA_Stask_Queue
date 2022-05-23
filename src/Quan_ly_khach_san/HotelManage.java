package Quan_ly_khach_san;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HotelManage{
    Scanner input = new Scanner(System.in);
    ArrayList<Hotel> roomManage = new ArrayList<Hotel>();
    ArrayList<Guest> guestManage = new ArrayList<Guest>();

    public void menu() throws ParseException {
            System.out.println("Menu");
            System.out.println("1. Creat new room:");
            System.out.println("2. Creat a new Guest:");
            System.out.println("3. Hien thi danh sach Room sap xep theo gia");
            System.out.println("4. Hien thi danh sach Guest sap xep theo birthday");
        System.out.println("5. Hien thi danh sach Guest sap xep theo cmnd");

        System.out.println("6. Exit ");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    creatRoom();
                    break;
                case 2:
                    creatGuest();
                    break;
                case 3:
                    showRoom();
                    break;
                case 4:
                    showGuestBirth();
                    break;
                case 5:
                    showGuestCMND();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }


    public void creatRoom(){
        System.out.println("Menu:");
        System.out.println("enter RoomNumber:");
        String phong = input.nextLine();
        System.out.println("enter price:");
        double gia = Double.parseDouble(input.nextLine());
        System.out.println("enter Floor:");
        int floor = Integer.parseInt(input.nextLine());

        Hotel room = new Hotel(phong,gia,floor);
        roomManage.add(room);

    }


    public void creatGuest() throws ParseException {
        System.out.println("Menu:");
        System.out.println("enter Name:");
        String name = input.nextLine();
        System.out.println("enter Date:");
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String text = input.nextLine();
        LocalDate birthDay = LocalDate.parse(text, formatters);
        System.out.println("enter cmnd:");
        int cmnd = Integer.parseInt(input.nextLine());

        Guest guest = new Guest(name,birthDay,cmnd);
        guestManage.add(guest);

    }

    public void showRoom() {
        roomManage.sort(Hotel::compareTo);
        for (int i = 0; i < roomManage.size(); i++) {
            System.out.println("Element " + i + ": " + roomManage.get(i));
        }
        }

    public void showGuestBirth() {
        guestManage.sort(new SortByBirth());
        for (int i = 0; i < guestManage.size(); i++) {
            System.out.println("Element " + i + ": " + guestManage.get(i));
        }
    }

    public void showGuestCMND() {
        guestManage.sort(new SortbyCmnd());
        for (int i = 0; i < guestManage.size(); i++) {
                System.out.println("Element " + i + ": " + guestManage.get(i));
            }

    }
    }
