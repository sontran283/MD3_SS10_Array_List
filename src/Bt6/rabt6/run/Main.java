package Bt6.rabt6.run;

import Bt6.rabt6.bussinessImp.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("****** Quản lí sách ******");
            System.out.println("Chon 1_ Nhập số sách (n) cần nhập thông tin từ bàn phím và thực hiện nhập thông tin cho n sách đó");
            System.out.println("Chon 2_ Hiển thiện thông tin sách cho tất cả sách đang lưu trữ");
            System.out.println("Chon 3_ Sử dụng Comparable để cài đặt sắp xếp giảm dần cho các sách đang lưu trữ");
            System.out.println("Chon 4_ Nhập mã sách cần xóa từ bàn phím, thực hiện xóa sách trong danh sách");
            System.out.println("Chon 5_ Nhập tên sách từ bàn phím, thực hiện tìm và in ra sách có tên phù hợp");
            System.out.println("Chon 6_ Nhập vào mã sách, thay đổi trạng thái sách (false -true)");
            System.out.println("Chon 7_ Thoát khỏi chương trình");
            System.out.println("*** Moi nhap lua chon cua ban ***");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                handleMenu(choice);
            } catch (Exception e) {
                System.err.println("___ sai dinh dang, moi nhap lai ___");
            }
        }
    }

    private static void handleMenu(int choise) {
        switch (choise) {
            case 1:
                addBook();
                break;
            case 2:
                allBook();
                break;
            case 3:
                subBook();
                break;
            case 4:
                deleteBook();
                break;
            case 5:
                searchBook();
                break;
            case 6:
                editBooleanBook();
                break;
            case 7:
                System.out.println("Thoat");
                break;
            default:
                System.exit(1);
        }
    }

    private static void addBook() {
        System.out.println("nhap so luong sach can them: ");
        try {
            int count = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < count; i++) {
                Book book = new Book();
                book.inputData();
                books.add(book);
            }
        } catch (Exception e) {
            System.err.println("nhap sai dinh dang,moi nhap lai");
        }
    }

    private static void allBook() {
        books.forEach(book -> {
            book.displayData();
        });
    }

    private static void subBook() {
        books.sort((book1, book2) -> Float.compare(book2.getInterest(), book1.getInterest()));
    }

    private static void deleteBook() {

    }

    private static void searchBook() {

    }

    private static void editBooleanBook() {

    }
}

