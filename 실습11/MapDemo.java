import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> fruits = Map.of("사과", 5, "바나ㅏ나", 3,"딸기", 2, "포도", 10);
        System.out.println(fruits.size() + "종류의 과일 있습니다.");
        System.out.println(fruits);

        for (String ket : fruits.keySet()) {
            System.out.println(ket + "가" + fruits.get(ket) + "개 있습니다");
        }

        String key = "바나나";
        if (fruits.containsKey(key))
            System.out.println(key + "가" + fruits.get(key) + "개 있습니다");

        fruits.forEach((k,n) -> System.out.println(k + "(" + n + ")"));
    }

}
