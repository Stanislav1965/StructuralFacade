public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Сумма (двоичная): " + bins.sum("100110", "110100"));
        System.out.println("Произведение (двоичная): " + bins.mult("100110", "110100"));
    }
}
