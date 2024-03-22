package self;

public class DetectSymmetry {
    public static void main(String[] args) {
        String s1 = "Hello";
        boolean b1 = true;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = s1.length() - 1; j >= 0; j--) {
                if (s1.charAt(i) != s1.charAt(j)) {
                    b1 = false;
                    break;
                }

            }
        }
        System.out.println(b1);


        detectSymmetry();
    }

        public static boolean detectSymmetry() {
            String s2 = "SOS";
            for (int i = 0; i < s2.length(); i++) {
                char sol = s2.charAt(i);
                char sag = s2.charAt(s2.length() - 1 - i);
                if (sol != sag) {
                    return false;
                }
            }
            return true;
        }
    }

