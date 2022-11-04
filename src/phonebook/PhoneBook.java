package phonebook;

import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, String> phoneBook = new HashMap<>();

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
}
