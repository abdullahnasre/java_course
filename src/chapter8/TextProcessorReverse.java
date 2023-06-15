package chapter8;
public class TextProcessorReverse {
    public static void main(String[] args) {
        reverseString("Hello TAU!");
        System.out.println("");
        //addSpaces("HiWorld!It'sMeAbdullahTheSoftwareTestAutomationEngineer");
    }
    /**
    * prints a string in reverse order
    * */
    public static void reverseString(String text) {
        for (int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
//    public static void addSpaces(String text){
//        var modifiedText = new StringBuilder(text);
//        for (int i=0; i<modifiedText.length(); i++){
//                if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
//                    modifiedText.insert(i, " ");
//                    i++;
//                }
//            }
//        System.out.println(modifiedText);
//        }
       }

