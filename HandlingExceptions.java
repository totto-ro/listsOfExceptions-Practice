import java.util.ArrayList;

public class HandlingExceptions {
    public static void main( String args[] ){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {

            try{
                Integer castedValue = (Integer) myList.get(i);
            }

            catch(ClassCastException error ) {
                System.out.println( "Here is something wrong: " + error);
            }
            catch(Exception e ) {
                System.out.println( "Also here is something wrong: " + e);
            }

        }

        System.out.println("The program is still running");
        

    }

}