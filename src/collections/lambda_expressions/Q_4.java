package collections.lambda_expressions;

public class Q_4 {

    public static void main(String[] args) {

        WordCount wc = str -> {

            if (str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String s = "Java is a Programming Language";

        System.out.println("Number of Words = " + wc.count(s));
    }
}