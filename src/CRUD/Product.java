package CRUD;

import java.util.Scanner;

import static CRUD.ProductManagement.productLists;

public class Product {
    private String productID;
    private String productName;
    private double Price;

    public Product() {
    }

    public void inputData(Scanner scanner) {
        System.out.println("___ nhap thong tin product ___");

        while (true) {
            System.out.println("Nhập mã sản phẩm:");
            productID = scanner.nextLine();
            if (productID.isEmpty()) {
                System.out.println("Mã sản phẩm không được để trống.");
            } else {
                // Kiểm tra mã sản phẩm trùng
                if (productLists.contains(productID)) {
                    System.out.println("Mã sản phẩm đã tồn tại. Vui lòng nhập lại.");
                } else {
                    break;
                }
            }
        }

        while (true) {
            System.out.println("Nhập tên sản phẩm:");
            productName = scanner.nextLine();
            if (productName.isEmpty()) {
                System.out.println("Tên sản phẩm không được để trống.");
                continue;
            }
            break;
        }

        System.out.print("Moi nhap gia san pham: ");
        this.Price = Float.parseFloat(scanner.nextLine());
        while (this.Price <= 0) {
            System.out.println("Gia phai lon hon 0");
            System.out.print("Moi nhap gia: ");
            this.Price = Float.parseFloat(scanner.nextLine());
        }
    }


    public void displayData() {
        System.out.println(
                "Product{" +
                        "productID='" + productID + '\'' +
                        ", productName='" + productName + '\'' +
                        ", Price=" + Price +
                        '}'
        );
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
