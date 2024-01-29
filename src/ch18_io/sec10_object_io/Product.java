package src.ch18_io.sec10_object_io;

import java.io.Serializable;

public class Product implements Serializable {
    /*
      Serializable I/F 를 구현해야 직렬화 가능, 파일에 읽고 쓰기가 가능해짐
    */

    private static final long serialVersionUID = 1L;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
