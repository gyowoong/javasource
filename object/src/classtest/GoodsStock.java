package classtest;

// 상품재고
public class GoodsStock {
    // 속성
    private String goodsCode; // 상품코드(goodsCode) : p1015
    private int stockNum; // 재고수량(stockNum) : 100

    // 생성자
    public GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

    // 기능
    // 재고추가(addStock) / 재고감소(subStock)
    void addStock(int num) {
        stockNum += num;
    }

    int subStock(int num) {
        stockNum -= num;
        return stockNum;
    }

    // 상품코드 반환
    public String getGoodsCode() {
        return goodsCode;
    }

    // 재고수량 반환
    public int getStockNum() {
        return stockNum;
    }
}
