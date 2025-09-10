public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        if (areAnagrams(s1, s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
