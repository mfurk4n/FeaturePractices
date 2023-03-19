package records;

record Student(String name, String nationality) {
    public Student(String name) {
        this(name, null);
    }

    public static int getAge() {
        return 1;
    }
}
