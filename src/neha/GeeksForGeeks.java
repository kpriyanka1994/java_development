package neha;

public class GeeksForGeeks {
    public static void main(String[] args) {
        //reverse words in a given string
        String s1 = "Neha";
        String[] array = s1.split("");

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);

        for (int i = array.length; i < 0; i--)
            System.out.print(array[i]);

    }

}

