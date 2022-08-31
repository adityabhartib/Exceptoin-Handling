package Oops.exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
//        try {
//            int a = 5;
//            int b = 0;
//            int c = a / b;
//
//            System.out.println(c);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage() + " Occured");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("index shold range 1 to 10");
//        }catch (IllegalArgumentException e) {
//            System.out.println("Very important Code ");
        fun1();
    }
        static void fun1() {
            int a = 5;
            int b = 3;

            int c = a / b;

            System.out.println(c);
            try {
                fun2();
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }catch (Exception e) {
            }
            System.out.println("After Delay");

            }
        static void fun2()throws ArrayIndexOutOfBoundsException{
            boolean isDanger = true;
            if(isDanger){
                throw new ArrayIndexOutOfBoundsException("Danger is Coming");
            }
        }
    }

