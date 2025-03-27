package oop.asan;

public class Main {
    public static void main(String[] args) {

/*
 Dog hunde = new Dog();
       hunde.rasse = "Бульдок";
       hunde.weight = 45;

       hunde.sayGay();

    }
}

 */
        //1 оъект
        Cat katze = new Cat();
        katze.light = "Коричневый";
        katze.type = "Мейн Кун";
        katze.age = 5;
        katze.weight =21.3;

        //2 объект
        Cat katze1 = new Cat();
        katze1.light = "Черный";
        katze1.type = "Бомбейская";
        katze1.age = 13;
        katze1.weight = 5.7;



        katze.catOrigins();
        katze.catInfo();

        katze1.catOrigins();
        katze1.catInfo();
    }
}