package optional;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public static void main(String[] args) {
        //PhoneBookCrawler p = new PhoneBookCrawler(new PhoneBook());

    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name) {
        return phoneBook.findPhoneNumberByName(name)
                .orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name) {
        final StringBuilder result = new StringBuilder();
        phoneBook.findPhoneNumberByName(name)
                .ifPresentOrElse(result::append,
                        () -> System.out.println(phoneBook.getPhoneBookEntries()));

        return result.toString();
    }


    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

}