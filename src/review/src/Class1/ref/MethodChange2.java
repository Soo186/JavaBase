package Class1.ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value =" + dataA.value);
        System.out.println("dataA = " +dataA);
        changeRefereness(dataA);
        System.out.println("메서드 호출 후 : dataA.value =" + dataA.value);
    }
    static void changeRefereness(Data dataX) {
        dataX.value = 20;
        System.out.println("dataX = " +dataX);

    }
}
