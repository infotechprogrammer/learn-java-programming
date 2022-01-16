import java.util.Scanner;
class MarksOutOfBounds extends Exception

{

    public void showError()

    {
        System.out.println("Invalid Marks");
    }

}

class ErrorTest

{

    public static void main(String args[]) throws Exception

    {
        Scanner input = new Scanner(System.in);

        try

        {

            System.out.println("Enter Marks:");
            int marks = input.nextInt();
            if(marks>100)

                throw new MarksOutOfBounds();

            System.out.println("Your Marks:"+marks);

        }
        catch(MarksOutOfBounds e)

        {
            e.showError();
        }


    }

}
