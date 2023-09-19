public class Testing {
    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {
        if
        (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        checkAge(460);
    }
}