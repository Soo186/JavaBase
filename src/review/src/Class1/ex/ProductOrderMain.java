package Class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {


        ProductOrder[] orders = new ProductOrder[3];


        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.prcie = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.prcie = 5000;
        order2.quantity = 1;
        orders[1] = order2;


        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.prcie = 1500;
        order3.quantity = 2;
        orders[2] = order3;


        int total = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ",가격" + order.prcie + ",수량" + order.quantity);
             total += order.quantity * order.prcie;
        }
        System.out.println("총 결제 금액 : " + total);

    }
}