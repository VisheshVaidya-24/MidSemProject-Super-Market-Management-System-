
package mypack;
import java.util.*;
import java.io.FileReader; 
import java.io.IOException;
public class GarmentSection extends UserSelection
{
    public void GarmentList()
    {
        List <String> GarmentItemList=new ArrayList<>();
        GarmentItemList.add("1} Men's Clothing");
        GarmentItemList.add("2} Women's Clothing");
        GarmentItemList.add("3} Children Clothing");
        // listing of Garment 
        messageForChoosingList();
        displayingListOfItems(GarmentItemList,3); 
        byte garmentCategorySelectedNumber = messageForCustomerSelection();
        switch(garmentCategorySelectedNumber)
        {
            case 1:
            {
                mensClothingDetails();
                break;
            }
            case 2:
            {
                womensClothingDetails();
                break;
            }
            case 3:
            {
                childrensClothingDetails();
                break;
            }
        }

    }// end of Garment List
    public void mensClothingDetails()
    {
         try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("Garmentmensclothing.txt");
            input.read(flight);
            System.out.println(flight);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}

    }// end of men clothing
    
    public void womensClothingDetails()
    {
        
          try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("Garmentwomensclothing.txt");
            input.read(flight);
            System.out.println(flight);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}
       
    }//end of womens clothing

    public void childrensClothingDetails()
    {
          try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("Garmentchildrenclothing.txt");
            input.read(flight);
            System.out.println(flight);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}
       
    }//end of children clothing
}
