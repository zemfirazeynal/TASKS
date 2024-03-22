package self;

public class SplittingText {
    public static void main(String[] args) {
        String s2 = "       Salam              necesen          neynirsen     ne var          ne yox?      ";
        String[] mass = s2.split(" ");
        String result = "";
        for (int i = 0 ; i<mass.length; i++){
            String elem = mass[i];

            if (!elem.isEmpty()){
                result+= elem+" ";
            }
        }
        result=result.trim();
        System.out.println(result);
    }
}
