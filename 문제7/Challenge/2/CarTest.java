package challenge2;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date now = new Date();
        String nowTime = sdf.format(now);

        Object[] objects = new Object[]{nowTime ,myCar.toString(),"(홍길동)" };

        if (myCar.equals(yourCar)) {
            System.out.println("자동차 모델이 둘 다" + myCar.toString() +"로 동일하다");
            String car = MessageFormat.format("날짜: {0}, 자동차 모델={1}, 운전자{2}", objects);
            System.out.println(car);

        }
    }
}
