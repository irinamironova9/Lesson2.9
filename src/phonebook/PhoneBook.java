package phonebook;

import java.util.HashMap;
import java.util.Objects;

public class PhoneBook {
    private final HashMap<String, String> phoneBook = new HashMap<>();

    public PhoneBook() {
    }

    public void addPhone(String name, String phoneNumber) {
        if (name == null || phoneNumber == null ||
                name.isBlank() || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Заполните все данные!");
        }
        phoneBook.put(name, phoneNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : phoneBook.keySet()) {
            sb.append(key).append(" ").append(phoneBook.get(key)).append('\n');
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook1 = (PhoneBook) o;
        return Objects.equals(phoneBook, phoneBook1.phoneBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneBook);
    }
}
