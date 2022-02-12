package uaslp.objetos.parcial1.time;

public class Main {

    public static void main(String[] args) {
        Time time = new Time(9, 45, 23 );
        time.addSecond(67);
        time.addMinute(60);
        time.addHour(1);
        System.out.println(time.toString());
    }
}