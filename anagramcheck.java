import java.util.ArrayList;

public class anagramcheck {


    public static void main(String[] args) {
       System.out.println(anagramcheck("anada"));

    }

    public static boolean anagramcheck(String Anagram) {
        boolean state = true;
        ArrayList List = new ArrayList<>();
        char[] Arrayanagram =Anagram.toCharArray();
        for (char Char:Arrayanagram
        ) {
            List.add(Char);
        }
        if((List.size() % 2) == 0){
            System.out.println("Dividable by 2");
            for (int i = 0; i <= List.size()/2; i++) {
                if (List.get(i)!=List.get(3-i)){
                    if (state==true){
                        state=false;
                    }
                }

            }

        }else{
            state=false;
        }

        return state;
    }
}
