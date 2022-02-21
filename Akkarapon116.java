class Akkarapon116 {
    // attibute
    public String name;
    public int age;
    public int balance;

    // default constucture
    public Akkarapon116() {

    }

    // Parameterize constructor
    public Akkarapon116(String inName, int inage, int inbalance) {
        name = inName;
        age = inage;
        balance = inbalance;
    }

    // method
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.printf("Age: %d years\n", age);
        System.out.printf("Balance: %d bath\n\n", balance);
    }

}
