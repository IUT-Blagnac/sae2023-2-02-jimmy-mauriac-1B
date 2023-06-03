package exercice;

import java.util.List;

public class Exercice {
    public static ArrayList<String> solution(String str, ArrayList<String> ordre) {
        String[] tableauMots = texte.split(" ");
        ArrayList<String> mots = new ArrayList<>(Arrays.asList(tableauMots));
        ArrayList<String> mots2 = new ArrayList<>(Arrays.asList(tableauMots));
        for (int i= 0; i <ordre.size(); i++) {
            System.out.println(ordre.get(i));
            for( String mot : mots2) {
                System.out.println(mot);
                String lettre = String.valueOf(mot.charAt(0));
                if( lettre.equals(ordre.get(i))) {
                    System.out.println(i);
                    mots.remove(mot);
                    mots.add(i, mot);
                }
            }
        }
        
        return mots;
    }
}
