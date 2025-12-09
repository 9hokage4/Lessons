package exceprions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try{
        int b = 7/a;
        int c = Integer.parseInt("fdkfja;");
        } catch (Exception e){
            System.out.println("Поймано исключение" + e.getClass());

        } 
        System.out.println("Hello");
    }

}
