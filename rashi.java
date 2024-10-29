import java.util.Scanner;

public class rashi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String ri = sc.nextLine();

        char firstchar = Character.toUpperCase(ri.charAt(0));

        switch(firstchar){
            case 'A','E','L','I','O':
            System.out.println("Mesha");
            break;
            case 'B','V','U','W' :
            System.out.println("Vrishbha");
            break;
            case 'K','C','G','H','Q':
            System.out.println("Mithun");
            break;
            case 'D':
            System.out.println("karak");
            break;
            case 'M','T':
            System.out.println("Sinh");
            break;
            case 'P':
            System.out.println("Kanya");
            break;
            case 'R':
            System.out.println("Tula");
            break;
            case 'N','Y':
            System.out.println("Vruschika");
            break;
            case 'S':
            System.out.println("Kumbha");
            break;

        }

        

    }
}

