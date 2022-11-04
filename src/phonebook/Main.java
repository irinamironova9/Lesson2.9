package phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.addPhone("John Watson", "9754653867");
        pb.addPhone("Jack Sparrow", "998623467");
        pb.addPhone("Jane Browne", "+7764582367");
        pb.addPhone("Joshua", "8653-764-7647");
        pb.addPhone("Jean Greene", "9097500867");
        pb.addPhone("Анна Сидорова", "+786986367");
        pb.addPhone("Иван Кузнецов", "+70221353867");
        pb.addPhone("Мама", "+797433867");
        pb.addPhone("Папа", "896523574217");
        pb.addPhone("Сантехник", "+79855653867");
        pb.addPhone("Витя", "+79755353867");
        pb.addPhone("Маша", "0857453867");
        pb.addPhone("Катя", "01332567");
        pb.addPhone("Вера Холодная", "9851442345467");
        pb.addPhone("Sherlock Holmes", "+9650987657");
        pb.addPhone("Wonder Woman", "9754653867");
        pb.addPhone("Iron Man", "9754653867");
        pb.addPhone("Tanaka-san", "9754653867");
        pb.addPhone("Kim Joonwon", "9754653867");
        pb.addPhone("Li Chen", "9754653867");
        System.out.println(pb);
    }
}