interface LibraryUser
{
    public abstract void registerAccount();
    public abstract void requestBook();

}
class KidUser implements LibraryUser{
    public int age;
    public String bookType;
    public KidUser(int age,String bookType)
    {
        this.age=age;
        this.bookType=bookType;
    }
    public void registerAccount()
    {
        if(age<12)
        {
            System.out.println("You have successfully registered under a Kids Account");
        }
        else if(age>12)
        {
            System.out.println("Sorry,Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook()
    {
        if(bookType.equals("Kids"))
        {
            System.out.println("Book issued successfully please return within 10 days");
        }
        else
        {
            System.out.println("Oops you are allowed to take only kids books ");
        }
    }
}
class AdultUser implements LibraryUser{
    public int age;
    public String bookType;
    public AdultUser(int age,String bookType)
    {
        this.age=age;
        this.bookType=bookType;
    }

    public void registerAccount()
    {
        if(age>12)
        {
            System.out.println("You have successfully registered under an adult account");
        }
        else if(age<12)
        {
            System.out.println("Sorry age must be less than 12");
        }
    }
    public void requestBook()
    {
        if(bookType.equals("Fiction"))
        {
            System.out.println("Book issued successfully");
        }
        else
        {
            System.out.println("Oops");
        }
    }

}
class LibraryInterfaceDemo
{
    public static void main(String[] args) {
        KidUser obj1=new KidUser(10,"Kids");
        obj1.registerAccount();
        AdultUser obj2=new AdultUser(5,"Kids");
        obj2.requestBook();

    }

}