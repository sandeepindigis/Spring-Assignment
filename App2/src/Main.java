import java.lang.reflect.Field;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Construcctor injection
//        Car car = new Car(new DesigelEngin());

        // patrol injection
//        car.setEngine(new PatrolEngine());
//        car.drive();

        // Filed injection

        try{
            Class<?> clz=Class.forName("write package name");

            Field engField=clz.getDeclaredField("engine");
            engField.setAccessible(true);
            Object obj=engField.get(clz);

            Car carObj=(Car)obj;

            engField.set(clz,new DesigelEngin());

            carObj.drive();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}