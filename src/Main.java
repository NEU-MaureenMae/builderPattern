public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .firstName("Maureen-Mae")
                .lastName("Sebastian")
                .email("smaureenmae@gmail.com")
                .address("New Era Ladies Dorm 2")
                .phone("09761125607")
                .age(20)
                .build();

        System.out.println("User 1:");
        System.out.println("First Name: " + user1.getFirstName());
        System.out.println("Last Name: " + user1.getLastName());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Address: " + user1.getAddress());
        System.out.println("Phone: " + user1.getPhone());
        System.out.println("Age: " + user1.getAge());
    }
}

