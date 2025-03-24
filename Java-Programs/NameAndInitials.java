public class NameAndInitials
{
    public static void main(String[] args)
    {
        String firstName = "Elijah ";
        String middleName = "Lucas ";
        String lastName = "Frese ";
        char firstInitial;
        char middleInitial;
        char lastInitial;

        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);

        System.out.println("Name: "+firstName+middleName+lastName);
        System.out.println("Initials: "+firstInitial+middleInitial+lastInitial);
        
    }
}