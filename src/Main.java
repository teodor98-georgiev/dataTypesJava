//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // int x;   declairing a variable
        // int x = 7; assigning a variable to it;
        // variable types: int, double, float, String (a sequence of char), char, boolean (true false)


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // System.out.println("Hello, Telerik Academy");

        //output
        /*Telerik Academy
        Address: 31 Al. Malinov, Sofia
        Tel. +359 888 55 55 555
        Fax:
        Web Site: http://telerikacademy.com/
        Manager: Martin Veshev (age: 25, tel. +359 2 981 981)*/

        /*Scanner scanner = new Scanner(System.in);
        String nameCompany = scanner.nextLine();
        String adress = scanner.nextLine();
        String telephone = scanner.nextLine();
        String website = scanner.nextLine();
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String age = scanner.nextLine();
        String personalPhone = scanner.nextLine();*/

        // input
        /*Telerik Academy
        31 Al. Malinov, Sofia
                +359 888 55 55 555

        http://telerikacademy.com/
        Martin
                Veshev
        25
                +359 2 981 981*/
        // NOTICE: println is ONLY for string in (), If I have concatenation or formatting
        // I should use printf()
        /*System.out.println();
        System.out.printf("%s" + "%nAdress: %s " + "%nTel. %s" + "%nFax:" + "%nWeb Site: %s" + "%nManager: %s %s" + " (age: %s, " +
                "tel. %s)",nameCompany,adress,telephone,website,name,surname,age,personalPhone);*/

        // circle perimeter and area
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double perimeter = 2 * Math.PI * r;
        double area = Math.pow(r,2) * Math.PI;
        System.out.printf("%.2f%n", perimeter);  // I need a new line so I format with %n
        //System.out.println();
        System.out.printf("%.2f", area);
        }
    }
