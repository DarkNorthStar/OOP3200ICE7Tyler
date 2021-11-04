public class Person
{
    /**
     *  Instance Variables
     */
    private int age;
    private String name;

    /**
     *  Constructors
     */
    // Default Constructors
    Person(int age, String name)
    {
        this.set(age, name);
    }

    /**
     *  Getters
     */
    // Gets the age
    public int getAge()
    {
        return age;
    }
    // Gets the name
    public String getName()
    {
        return name;
    }
    /**
     *  Setters
     */
    // Sets the age
    public void setAge(int age)
    {
        this.age = age;
    }
    // Sets the name
    public void setName(String name)
    {
        this.name = name;
    }
    // Sets the name and age of the person
    public void set(int age, String name)
    {
        setAge(age);
        setName(name);
    }

    /**
     *  Public Methods
     */
    public void saysHello()
    {
        System.out.println(getName() + " Says Hello!");
    }

    /**
     *  Private Methods
     */
}
