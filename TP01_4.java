public class TP01_4 {
    public static void main(String[] args) {
        System.out.println("*Number 1");
        String line = "+----------------+---------+-------------------+-----+";
        String country = "| Country        | Name    | Profession        | Age |";
        String germany = "| Germany        | Michael | Computer Engineer | 19  |";
        String england = "| England        | Robert  | Artist            | 34  |";
        String uk = "| United Kingdom | Julia   | Designer          | 42  |";
        String us = "| United States  | Jo      | Actor             | 21  |";
        
        System.out.println(line);
        System.out.println(country);
        System.out.println(line);
        System.out.println(germany);
        System.out.println(line);
        System.out.println(england);
        System.out.println(line);
        System.out.println(uk);
        System.out.println(line);
        System.out.println(us);
        System.out.println(line);

        System.out.println("\n**Number 2");
        // 2 8
        String a = "    " + "|   " + 1 + "|   " + 2 + "|   " + 3 + "|   " + 4 + "|   " + 5 + "|   " + 6 + "|   " + 7
                + "|   " + 8 + "|   " + 9 + "|   " + 10 + "|   ";

        String b = "   " + 1 + "|   " + 1 + "|   " + 2 + "|   " + 3 + "|   " + 4 + "|   " + 5 + "|   " + 6 + "|   " + 7
                + "|   " + 8 + "|   " + 9 + "|   " + 10 + "|   ";

        String c = "   " + 2 + "|   " + 2 + "|   " + 4 + "|   " + 6 + "|   " + 8 + "|  " + 10 + "|  " + 12 + "|  " + 14
                + "|  " + 16 + "|  " + 18 + "|   " + 20 + "|   ";

        String d = "   " + 3 + "|   " + 3 + "|   " + 6 + "|   " + 9 + "|  " + 12 + "|  " + 15 + "|  " + 18 + "|  " + 21
                + "|  " + 24 + "|  " + 27 + "|   " + 30 + "|   ";

        String e = "   " + 4 + "|   " + 4 + "|   " + 8 + "|  " + 12 + "|  " + 16 + "|  " + 20 + "|  " + 24 + "|  " + 28
                + "|  " + 32 + "|  " + 36 + "|   " + 40 + "|   ";

        String f = "   " + 5 + "|   " + 5 + "|  " + 10 + "|  " + 15 + "|  " + 20 + "|  " + 25 + "|  " + 30 + "|  " + 35
                + "|  " + 40 + "|  " + 45 + "|   " + 50 + "|   ";
        String dot = "--------------------------------------------------------";
        System.out.println(a);
        System.out.println(dot);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    
}
