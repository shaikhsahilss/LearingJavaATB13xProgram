package ex_14_String;

public class Lab143_String_functions {
    public static void main(String[] args) {
        String name = "Sonal";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));

// concatanations
        System.out.println(name.concat("Patel"));

        // 1.  Contains()
        System.out.println(name.contains("om"));
        // 2.  equals()
        System.out.println(name.equals("Sonal"));
        // 3 equalsIngnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        // 4. indexOf()
        System.out.println(name.indexOf('o'));

        String s1 = "madam";

        System.out.println(s1.indexOf("m"));

        System.out.println(s1.lastIndexOf("m"));
        // 5 Length()
        System.out.println(name.length());

        // 6 replace(,) // sonal
        System.out.println(name.replace('n', 'N'));

        // 7 split()

        String name4 = "shaikhsahilss2022@gmail.com";

        String [] s5 = name4.split("@");
        System.out.println(s5[1]);
        System.out.println(s5[0]);
       // System.out.println(s5[2]);

        // 8 subString (,)

        System.out.println(name.substring(1,3));

        // 9 toLowerCase()
        System.out.println(name.toUpperCase());

        // 10 toUpperCase
        System.out.println(name.toUpperCase());

        // 11 . startWith()
        System.out.println(name.startsWith("S"));

        // 12 endWith()
        System.out.println(name.endsWith("a"));

        String anotherPalidrome = "Niagara .O roar again!";

        System.out.println(anotherPalidrome.length());

        String extract = anotherPalidrome.substring(11,15);

        System.out.println(extract);

        // Concatenation (by +)

        String s111 = "Hellp";

        String s22 = "World";

        String s33 = "j1";

        String result = s111 + s22 + s33;
        System.out.println(result);

        String n = "SaHHILsshaik";
        System.out.println(n.length());
        System.out.println(n.indexOf("a"));
        System.out.println(n.lastIndexOf("i"));
        System.out.println(n.lastIndexOf("s"));



    }
}
