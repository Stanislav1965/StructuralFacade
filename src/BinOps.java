public class BinOps {
    public String sum(String a, String b) {
        int sum = Integer.parseInt(a, 2)+ Integer.parseInt(b, 2);
        System.out.println("Сумма (десятичная): " + sum);
        return Integer.toBinaryString(sum);

    }public String mult(String a, String b) {
        int mult = Integer.parseInt(a, 2)*Integer.parseInt(b, 2);
        System.out.println("Произведение (десятичная): " + mult);
        return Integer.toBinaryString(mult);
    }
}
