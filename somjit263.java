class somjit263 {
    // attibute
    public String name = "Somjit";
    public int age = 19;
    public int balance = 50;

    // default constucture
    public somjit263() {
    }

    // Parameterize constructor
    public somjit263(String Name, int Age, int Balance) {
        name = Name;
        age = Age;
        balance = Balance;
    }

    // method
    void showInfo() {
        System.out.println(:" + name);
        System.out.printf("Age: %d years\n", age);
        System.out.printf("Balance: %d bath \n", balance);
    }
}