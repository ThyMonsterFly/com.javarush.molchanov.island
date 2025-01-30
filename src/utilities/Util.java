package utilities;


public class Util {

    public static int getIntParam (Object object, String attribute){
        try {
            return (int)Settings.class.getField(object.getClass().getSimpleName().toLowerCase() + attribute).get(object);
        } catch (Exception e) {
            System.out.println("-".repeat(50));
            System.out.println("getIntParam malfunction!");
            System.out.println("-".repeat(50));
            e.printStackTrace();
            return 0;
        }
    }

}
