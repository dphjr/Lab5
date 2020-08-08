class DivisorCalc {

    static int gcd(int num1, int num2) {
        if (num1 == 0)
            return num2;
        if (num2 == 0)
            return num1;
        if (num1 == num2)
            return num1;
        if (num1 > num2)
            return gcd(num1-num2, num2);
        return gcd(num1, num2-num1);
    }
    public static void main(String[] args) {
        int num1 = 22, num2 = 99;
        System.out.println(gcd(num1, num2));
    }
} 