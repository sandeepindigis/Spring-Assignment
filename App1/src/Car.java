public class Car extends Engine {

    public void  drive(){

        Engine engine = new Engine();
        int start=engine.start();

        if(start>=1){
            System.out.println("Journey Started");
        }else {
            System.out.println("Have some issue");
        }
    }
}
