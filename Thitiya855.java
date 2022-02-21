class Thitiya855 {
    public String name;
    public int age;
    public int balance;

    // default constucture
    public Thitiya855() {

    }

    // Parameterize constructor
    public Thitiya855(String N, int A, int B) {
        name = N;
        age = A;
        balance = B;
    }

    // method
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.printf("Age: %d \n", age);
        System.out.printf("Balance: %d \n", balance);
    }
}