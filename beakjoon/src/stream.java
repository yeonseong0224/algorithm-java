//import java.util.Arrays;
//import java.util.List;
//
//public class stream {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
//
//        // 1. forEach문 사용
//        for (String name : names) {
//            if (name.startsWith("A")) System.out.println(name);
//        }
//
//        // 2. stream 이용 - 람다 표현식
//        names.stream()
//                .filter(name -> name.startsWith("A"))
//                .forEach(name -> System.out.println(name));
//
//        // 3. stream 이용 - 메서드 참조(람다 표현식을 간소화한 문법) // 객체::인스턴스 메서드
//        names.stream()
//                .filter(name -> name.startsWith("A"))
//                .forEach(System.out::println);
//    }
//}
