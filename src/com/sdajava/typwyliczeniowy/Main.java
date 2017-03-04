package com.sdajava.typwyliczeniowy;

public class Main {

// można robić klasy w klasie, ale nie można robić funkcji w funkcji


        public static void main(String[] args) {
            //porównywanie typów wyliczeniowych
            EnumTest.Colors col = EnumTest.Colors.BLUE;
            if(col.equals(EnumTest.Colors.BLUE)){
                System.out.println("Kolory pasują");
            }

            System.out.println();
            //dla typu wyliczeniowego nie trzeba tworzyć specjalnie nowego obiektu, domyślnie jest traktowany jako statyczny
            for(EnumTest.Colors color: EnumTest.Colors.values()){
                System.out.println(color);
            }




    }
}
