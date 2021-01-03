package lesson6;

import java.io.*;
import java.util.Scanner;

public class HW6 extends Object {
    public static void main(String[] args) {
/*   Когда писала код как вы, в консоль выводились какие-то краказябры. В файле все было хорошо и читалось
       try {
            FileOutputStream txt = new FileOutputStream("text2.txt");
            byte[] string = (Строки можно сцеплять с другими типами данных, например, целыми числами(int). Так происходит потому,что значение типа int автоматически преобразуется в своё строковое представление в объекте типа String. После этого символьные строки сцепляются, как и прежде.").getBytes();
            txt.write(string);
            txt.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

       try {
            FileInputStream fis2 = new FileInputStream("text2.txt");
            int outbox2;
            while ((outbox2 = fis2.read()) != -1) {
                System.out.print((char) outbox2);
            }
            fis2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        String string = "Cтроки можно сцеплять с другими типами данных, например, целыми числами(int). Так происходит потому,что значение типа int автоматически преобразуется в своё строковое представление в объекте типа String. После этого символьные строки сцепляются, как и прежде.";
        String string2 = "Сцепляя разные типы данных с символьными строками, следует быть внимательным, иначе можно получить неожиданные результаты.";

        String fileName = "text2.txt";
        String fileName2 = "text22.txt";

        File newFile = new File("text2.txt");
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(newFile));
            ps.print(string);
            ps.println();
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File newFile2 = new File(fileName2);
        try {
            PrintStream ps2 = new PrintStream(new FileOutputStream(newFile2));
            ps2.print(string2);
            ps2.println();
            ps2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            Scanner scanner = new Scanner(new FileInputStream(fileName));
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner2 = new Scanner(new FileInputStream(fileName2));
            while (scanner2.hasNext())
                System.out.println(scanner2.nextLine());
            scanner2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





    }
}
