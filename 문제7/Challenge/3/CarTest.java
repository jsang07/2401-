package challenge3;

import challenge2.Car;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {
    public static void main(String[] args) {
        challenge2.Car myCar = new challenge2.Car("그랜저");
        challenge2.Car yourCar = new Car("그랜저");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date now = new Date();
        String nowTime = sdf.format(now);

        Object[] objects = new Object[]{nowTime ,myCar.toString(),"(홍길동)" };

        if (myCar.equals(yourCar)) {
            System.out.println("자동차 모델이 둘 다" + myCar.toString() +"로 동일하다");
            String car = MessageFormat.format("날짜: {0}, 자동차 모델={1}, 운전자{2}", objects);
            System.out.println(car);

            StringTokenizer tokenizer = new StringTokenizer(car);
            StringTokenizer st = new StringTokenizer(car, " =()[]," );
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }

            System.out.println(tokenizer);
        }
    }

    static void toke(){

    }
}
