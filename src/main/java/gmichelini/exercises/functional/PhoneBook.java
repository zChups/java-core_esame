package gmichelini.exercises.functional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {
    private final List<Person> persons;

    public class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getLastname() {
            return lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, lastname, phone);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)return true;
            if (obj == null || getClass() != obj.getClass())return false;
            Person person = (Person) obj;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, this.phone);
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", phone='" + phone + '\'' + '}';
        }
    }

    public PhoneBook(List<Person> persons){this.persons = persons;}

    public Optional<Person> searchByLastname(String lastname){
        return persons.stream()
                .filter(p -> p.getLastname().equals(lastname))
                .findFirst();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        for (Person p : persons){
            if (p.getLastname().equals(lastname) && p.getName().equals(name)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
