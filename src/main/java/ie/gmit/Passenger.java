package ie.gmit;

public class Passenger {
    private final String title;
    private final String name;
    private final String id;
    private final String phone;
    private final Integer age;

    public Passenger(String title, String name, String id, String phone, Integer age) {
        if (title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title must be 'Mr', 'Mrs', or 'Ms'");
        }

        if (name.length() >= 3) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must have a minimum of three characters");
        }

        if (id.length() >= 10) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must have a minimum of ten characters");
        }

        if (phone.length() >= 7) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone must have a minimum of seven characters");
        }

        if (age > 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be over 16");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }
}
