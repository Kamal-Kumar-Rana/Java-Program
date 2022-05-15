public class variable {

    public static void main(String[] args) {
        // variable
        String name = "Tony Stark";
        int age = 20;
        double price = 25.25;
        int a = 25;
        int b = 10;
        // System.out.println(a);
        // System.out.println(name);
        a = 20;
        name = "Iron Man";
        // System.out.println(a);
        // System.out.println(name);

        // Sum
        a = 90;
        b = 10;
        int sum = a + b;
        System.out.println("Sum = " + sum);
        int diff = a - b;
        System.out.println("Difference is=" + diff);
        int mul = a * b;
        System.out.println("Multiplication is= " + mul);
        int ans1 = a * b / a - b;
        System.out.println("Ans 1 is ::" + ans1);
        int ans2 = (a * b) / (a - b);
        System.out.println("Ans 2 is ::" + ans2);
    }

}
