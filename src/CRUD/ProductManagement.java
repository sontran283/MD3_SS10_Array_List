package CRUD;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static List<Product> productLists = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("______ menu ______");
            System.out.println("chon 1_ thêm một sản phẩm mới vào danh sách");
            System.out.println("chon 2_ hiển thị danh sách các sản phẩm");
            System.out.println("chon 3_ tìm kiếm sản phẩm theo mã sản phẩm");
            System.out.println("chon 4_ tìm kiếm sản phẩm theo tên sản phẩm");
            System.out.println("chon 5_ xóa một sản phẩm khỏi danh sách");
            System.out.println("chon 6_ thoát khỏi chương trình");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProductByID();
                    break;
                case 4:
                    searchProductByName();
                    break;
                case 5:
                    removeProduct();
                    break;
                case 6:
                    System.out.println("thoat");
                    break;
                default:
                    System.err.println("nhap khong hop le");
            }
        } while (true);
    }

    private static void addProduct() {
        System.out.println("nhap so luong sach can them: ");
        try {
            int inputAdd = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < inputAdd; i++) {
                Product product = new Product();
                product.inputData(scanner);
                productLists.add(product);
            }
        } catch (Exception e) {
            System.out.println("khong dung dinh dang, moi nhap lai");
        }
    }

    private static void displayProducts() {
        System.out.println("danh sach san pham trong kho: ");
        productLists.forEach(product -> {
            product.displayData();
        });
    }

    private static void searchProductByID() {
        System.out.println("nhap ma san pham can tim");
        String productId = scanner.nextLine();
        boolean check = false;
        for (Product product : productLists) {
            if (product.getProductID().equals(productId)) {
                product.displayData();
                check = true;
            }
        }
        if (!check) {
            System.out.println("khong tim thay san pham voi thong tin vua nhap");
        }
    }

    private static void searchProductByName() {
        System.out.println("nhap ten san pham can tim");
        String productName = scanner.nextLine();
        boolean check = false;
        for (Product product : productLists) {
            if (product.getProductName().equals(productName)) {
                product.displayData();
                check = true;
            }
        }
        if (!check) {
            System.out.println("khong tim thay san pham voi thong tin vua nhap");
        }
    }

    private static void removeProduct() {
        System.out.println("nhap ma san pham can xoa");
        String productCode = scanner.nextLine();
        Iterator<Product> iterator = productLists.iterator();
        boolean check = false;
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductID().equals(productCode)) {
                iterator.remove();
                product.displayData();
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("xoa san pham thanh cong");
        } else {
            System.out.println("khong tim thay san pham voi thong tin vua nhap");
        }
    }
}
