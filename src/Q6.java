//Try with multiple catch blocks

public class Q6 {
    public static void main(String[] args) {
         int a = 5;
         int b =0;

         try{
             int c =a/b;
         }catch (NullPointerException e){
             System.out.println(e);
         }catch(IndexOutOfBoundsException e){
             System.out.println(e);
         }catch (Exception e){
             System.out.println(e);
         }

        System.out.println("This is Try-Catch Example.");

    }



}
