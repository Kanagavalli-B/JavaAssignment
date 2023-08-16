package duplication;

public class Duplication {
    public static void main(String[] args) {
        String[] a = new String[]{"bike", "car", "cycle", "bike", "lorry", "cycle"};
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j]) && i != j) {
                    System.out.println("the duplicate elements from string array " + a[i]);
                }
            }
        }

        String b = "computerscience";

        for(int i = 0; i < b.length(); i++) {
            for(int j = i + 1; j < b.length(); j++) {
                if (b.charAt(i) == b.charAt(j)) {
                    System.out.println("the dulpicate characters from string " +b.charAt(i) );
                }
            }
        }

    }
}

