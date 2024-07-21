public class ReferenceExample {
    public static void main(String[] args) {
        // 기본 데이터 타입 변수
        int number = 42;
        double pi = 3.14159;

        // 참조 데이터 타입 변수
        String greeting = "Hello, world!";
        int[] numbers = {1, 2, 3, 4, 5};

        // 출력
        System.out.println("Number: " + number);
        System.out.println("Pi: " + pi);
        System.out.println("Greeting: " + greeting);
        System.out.print("Numbers array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

