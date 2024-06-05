package test;
class Shape {}
class Rectangle extends Shape {}
class Circle extends Shape {}
public class Test2 {
        public static void main(String[] args) {
            Rectangle r = new Rectangle();
            try {
                casting(r);
            } catch (ClassCastException e) {
                System.out.println("캐스팅메서드 오류발생");
            }
        }

        static void casting(Shape s) {
            Circle c = (Circle) s;
        }
    }

