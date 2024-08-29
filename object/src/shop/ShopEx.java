package shop;

public class ShopEx {
    public static void main(String[] args) {
        MyShop shop = new MyShop();

        // 상점이름 지정
        shop.setTitle("Myshop");
        // user 생성
        shop.genUser();
        // 상품 생성
        shop.genProduct();
        // 상점 시작
        shop.start();
    }

}
