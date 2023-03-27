public class VowelAndConsonantInString {
    public static void main(String[] args) {
        String str="Hello World";
        vowelConsonantCount(str);
    }
    public static void vowelConsonantCount(String str){
        int vc=0;
        int cc=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                vc++;
            }
            else{
                cc++;
            }
        }
        System.out.println("Vowel Count is : "+vc);
        System.out.println("Consonant count is "+cc);
    }
    public static boolean isVowel(char c){
        c=Character.toUpperCase(c);
        return (c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
}
