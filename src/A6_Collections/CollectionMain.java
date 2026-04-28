package A6_Collections;

import A3_Inheritance.Person;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {

        // koleksiyonlar kapasiteyi dinamik ayarlama ve aynı zamadan listeden kayıt bulma, kayıt silme, kayıt güncelle, kayıt arama, kayıt sayısını bulma, kayıtları temizleme, kayıtları sıralama gibi yardımcı methdolara sahipler.

        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Ayşe");


        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ahmet", "Yılmaz", "Tan"));
        people.add(new Person("Mehmet", "", "Demir"));
        people.add(new Person("Ayşe", "", "Kara"));

        List<Person> filteredList =  people.stream().filter(p -> p.getFirstName().equals("Ahmet")).toList();

       String ahnmet =  names.get(0);

       names.remove("Ayşe");
       names.contains("Mehmet");
       names.size();
       names.clear(); // listeyi temiz



    }
}
