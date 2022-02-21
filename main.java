import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        Thitiya855 BA1 = new Thitiya855();
        BA1.showInfo();

        Thitiya855 BA2 = new Thitiya855("Thitiya", 100, 1);
        BA2.showInfo();

        Scanner sc = new Scanner(System.in);
        int ac;
        String Name;
        int Age = 0;
        int kb = 0;

        do {
            System.out.print("Enter number of account: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter number!!!!! ");
                System.out.print("Enter number of account: ");
                sc.next();
            }
            ac = sc.nextInt();
        } while (ac <= 0);

        int i = 0;
        while (i < ac) {
            System.out.printf("Enter name: ");
            Name = sc.next();
            System.out.printf("Enter age: ");
            Age = sc.nextInt();
            System.out.printf("Enter balance: ");
            kb = sc.nextInt();
            Thitiya855 BA = new Thitiya855(Name, Age, kb);
            BA.showInfo();
            i++;
        }
    }
}
