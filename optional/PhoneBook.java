package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<>() {
        {
            put("Furkan", "12412512");  //ikisi birlikte entry
            put("Linus", "616136136");
            put("Dennis", "4624522523");
        }
    };

    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    PhoneBook() {
    }

    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name) {
        return Optional.ofNullable(PHONE_NUMBERS.get(name));
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        return PHONE_NUMBERS.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(phoneNumber))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }
}
