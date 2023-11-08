public class ConvertNumber {
        public static void main(String[] args){
            int number = -74;
            String result = number > 0 ? (number % 7 < 4 ? "positive-m" : "positive-p") : (number == 0 ? "zero" : (number % 7 > -4 ? "negative-m" : "negative-p"));

            System.out.println(result);
        }

}
