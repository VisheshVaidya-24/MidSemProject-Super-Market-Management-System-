package mypack;
import java.util.*;
public class UserSelection
{
    public byte messageForCustomerSelection()
    {
        System.out.println("Please enter the above mentioned index of your favourable section");
        // for taking choice
        byte userSelectedIndex;   
        Scanner sc =new Scanner(System.in);
        userSelectedIndex = sc.nextByte();

        return userSelectedIndex;
    }// we are using this function for scanning purpose and for messaging to user
    public void messageForChoosingList() {
        System.out.println("Here is the list of all the items available !!!");
    }
    public void displayingListOfItems(List<String> list, int numberOfItems)
    {
        for(int i=0;i<numberOfItems;i++)
        {
            System.out.println(list.get(i));
        }
    }
}