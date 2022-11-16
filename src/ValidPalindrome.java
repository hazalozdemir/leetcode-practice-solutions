public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        String formatted = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i=0;
        int j = formatted.length()-1;

        while(i < j){
            if(formatted.charAt(i) != formatted.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
