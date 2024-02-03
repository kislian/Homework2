public class Main {
    public static void main(String[] args) {
     //task 1
        var dog=8.0;
        var cat =3.6;
        var paper=763789;
        System.out.println("***Задача №1***");
        System.out.println("dog="+dog+";cat="+cat+";paper="+paper);
    //Task 2
         dog=dog+4.0;
         cat=cat+4.0;
         paper=paper+4;
        System.out.println("***Задача №2***");
        System.out.println("dog+4="+dog+";cat+4="+cat+";paper+4="+paper);
    //Task 3
        System.out.println("***Задача №3***");
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println("dog-3.5="+dog+";cat-1.6="+cat+";paper-7639="+paper);
    //Task 4
        var friend=19.0;
        System.out.println("***Задача №4***");
        System.out.println("new var friend="+friend);
        friend=friend+2;
        System.out.println("friend+2="+friend);
        friend=friend/7;
        System.out.printf("friend/7=%3.2f\n",friend);
    //Task 5
        var frog=3.5;
        System.out.println("***Задача №5***");
        System.out.println("new var frog="+frog);
        frog=frog*10;
        System.out.println("frog*10="+friend);
        frog=frog/3.5;
        System.out.printf("frog/3.5=%3.2f\n",frog);
        frog=frog+4;
        System.out.println("frog+4="+frog);
    //Task 6
        System.out.println("***Задача №6***");
       var weightBoxer_1=78.2;
       var weightBoxer_2=82.7;
       var totalWeight=0.0;
        var differWeight=0.0;
        totalWeight=weightBoxer_1+weightBoxer_2;
        differWeight=weightBoxer_1-weightBoxer_2;
        System.out.println("общая масса двух бойцов равна="+ totalWeight+ " кг");
        System.out.println("Разница в весе между двумя бойцами равна="+ Math.abs(differWeight) + " кг");
    //Task 7
        var divisionWeight=0.0;
        System.out.println("***Задача №7***");
        if(weightBoxer_1>weightBoxer_2) {
            differWeight=weightBoxer_1-weightBoxer_2;
            divisionWeight = weightBoxer_1 % weightBoxer_2;
        }
        else {
            differWeight = weightBoxer_2 - weightBoxer_1;
             divisionWeight = weightBoxer_2 % weightBoxer_1;
        }
            System.out.println("Разница в весе между двумя бойцами равна="+ differWeight + " кг");
        System.out.println("Разница в весе " + divisionWeight + "кг!"); // деление
    //Task 8
        System.out.println("***Задача №8***");
    var totalHour=640;
    var oneSotrHour=8;
    var  countSotr=totalHour/oneSotrHour;
        System.out.println("Всего сотрудников в компании -"+ countSotr + " человек");
        System.out.print("Если в компании работает  - "+ (countSotr+94) +" человек, то всего ");
        System.out.println((countSotr+94)*8 +" часов работы может быть поделено между сотрудниками");
    }
}