package shop;

public class CellPhone extends Product {

    // 통신사 정보(carrier)
    private String carrier;

    public CellPhone(String pName, int price, String carrier) {
        super(pName, price);
        this.carrier = carrier;
    }

    @Override
    void printExtra() {
        // 통신사 정보
        System.out.println("통신사 정보 : " + carrier);

    }

}
