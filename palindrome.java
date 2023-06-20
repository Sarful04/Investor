import java.util.HashMap;

public class palindrome {
    public static void main(String[] args) {
        String str="carrace";

        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char singleChar=str.charAt(i);
            if(map.get(singleChar)==null){
                map.put(singleChar, 1);

            }
            else{
                
            }
        }
    }
    
}
