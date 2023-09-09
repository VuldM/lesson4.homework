package ru.geekbrains.lesson4.bank;

public class Program {

    public static void main(String[] args) {

        Person person = new Person("FIO1", "20000021");
        Entity entity = new Entity("GeekBrains", "20003221");

        DebetAccount<Person> creditAccount1 = new DebetAccount<>(person, 30.12);
        DebetAccount<Entity> debetAccount1 = new DebetAccount<>(entity, 20000000);

        Transaction<Account> transaction1 = new Transaction<>(debetAccount1, creditAccount1, 25000);
        transaction1.execute();



    }

}
