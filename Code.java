public class AutoCorrect {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        //System.out.println(dict.distance("go", "going"));

        Pair b = dict.verification("Феодализм");
        System.out.println(b.word);
    }

}

class Dictionary {

    String[] ar;
    
    String str1 ="sfs";
    String str2 ="ghjfh";

//подсчет уровня разности строк
    int distance(String str1, String str2) {
        int difference = 0;
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                difference++;
            }
        }

        if (str1.length() > str2.length()) {
            difference += str1.length() - str2.length();
        } else {
            difference += str2.length() - str1.length();
        }

        return difference;
    }
//поиск минимального уровня разности между заданной строкой и строками в массиве

    Pair verification(String str) {
        int ind_min = 0;
        String word_min = ar[0];
        int distance_min = distance(str, ar[0]);
        for (int i = 0; i < ar.length; i++) {
            if (distance(str, ar[i]) < distance_min) {
                ind_min = i;
                word_min = ar[i];
                distance_min = distance(str, ar[i]);

            }

        }
        Pair p = new Pair();
        p.ind = ind_min;
        p.word = word_min;
        return p;
    }

    public Dictionary() {
        ar = new String[8];
        ar[0] = "goe";
        ar[1] = "pop";
        ar[2] = "gfgg";
        ar[3] = "sgsgg";
        ar[4] = "tsgfdbg";
        ar[5] = "dfad";
        ar[6] = "adfad";
        ar[7] = "fhgf";
    }
}

class Pair {

    int ind;
    String word;
}
