package practice;

public class SwitchDemo {
    public static void main(String[] args){
        int month=2;
        String monthstring;

        switch (month){
            case 1:
                monthstring = "Jan";
                break;
            case 2:
                monthstring = "Feb";
                break;
            default:
                monthstring = "INVALID";

        }
        System.out.println(monthstring);
    }
}
