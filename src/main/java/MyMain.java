public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        //this is a capital letter
        if ((ch >= 'a' && ch<= 'z') || (ch>='A' && ch<= 'Z')) {
            if (ch >= 'a' && ch <= 'z') {
                return ch;
            }
            return (char) (ch + 32);
        }
        return ch;
    }


            // Changes a lowercase letter to an uppercase letter
            // If the char is not a lowercase letter,
            // it is returned unchanged.
            public static char toUpper ( char ch){
                if ((ch >= 'a' && ch<= 'z') || (ch>='A' && ch<= 'Z')) {
                    if (ch >= 'a' && ch <= 'z') {
                        return (char) (ch - 32);
                    }
                    return ch;
                }
                return ch;
            }

            // The method is given a String as input and returns a
            // new String where all of the numbers have been removed
            // from the original String.
            public static String removeNumbers (String str){
                //between 48 and 57
                String total = "";
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch < 48 || ch > 57) {
                        total += ch;
                    }

                }
                return total;
            }


            // Write some code to test your methods!
            public static void main (String[]args){
                // ADD SOME TESTING CODE HERE
            }
        }
