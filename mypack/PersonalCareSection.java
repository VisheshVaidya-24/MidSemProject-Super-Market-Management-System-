package mypack;
import java.util.*;
import java.io.FileReader; 
import java.io.IOException;
public class PersonalCareSection extends UserSelection

{
    public void PersonalCareList()
    {
        List <String> PersonalCareList=new ArrayList<>();
        PersonalCareList.add("1} Hygiene Products");
        PersonalCareList.add("2} BodyCare");
        PersonalCareList.add("3} FirstAid");
        // listing of personal care list
        messageForChoosingList();
        displayingListOfItems(PersonalCareList,3); 
        byte personalCareCategorySelectedNumber = messageForCustomerSelection();
        switch(personalCareCategorySelectedNumber)
        {
            case 1:
            {
                hygieneProductsDetails();
                break;
            }
            case 2:
            {
                bodycareDetails();
                break;
            }
            case 3:
            {
                firstAidDetails();
                break;
            }
        }// end of switch
    }//end of list personal care list

    public void hygieneProductsDetails()
    {
           try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("details.txt");
            input.read(flight);
            System.out.println(flight);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}
        // List <String> hygieneProductTypeList=new ArrayList<>();
        // int hygieneProductsPrice[]={120,540,200,650,780};
        // hygieneProductTypeList.add("1} Toilet Bowl Cleaners     :       " + hygieneProductsPrice[0]);
        // hygieneProductTypeList.add("2} Dishwasher Detergents with Disinfecting Properties       :       "+ hygieneProductsPrice[1]);
        // hygieneProductTypeList.add("3} Steam Cleaners       :       " + hygieneProductsPrice[2]);
        // hygieneProductTypeList.add("4} Antibacterial and Antimicrobial Cleaners     :       " + hygieneProductsPrice[3]);
        // hygieneProductTypeList.add("5} Bleach       :       " + hygieneProductsPrice[4]);
        // messageForChoosingList();
        // System.out.println("   items       :   price per kg(in Rupees)   ");
        // displayingListOfItems(hygieneProductTypeList,5);
    }// end of hygieneProductDetails

    public void bodycareDetails()
    {
         try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("personalcarebodycare.txt");
            input.read(flight);
            System.out.println(flight);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}

        // List <String> bodycareDetailsTypeList=new ArrayList<>();
        // bodycareDetailsTypeList.add("1} Fragrances");
        // bodycareDetailsTypeList.add("2} Body Powders");
        // bodycareDetailsTypeList.add("3} Moisturizers");
        // bodycareDetailsTypeList.add("4} Exfoliants");
        // bodycareDetailsTypeList.add("5} Cleansers");
        // messageForChoosingList();
        // System.out.println("   items       :   price per kg(in Rupees)   ");
        // displayingListOfItems(bodycareDetailsTypeList,5);
    }// end of bodycare details

    public void firstAidDetails()
    {
         try{
            char[] flight  = new char[1000];
            FileReader input = new FileReader("personalcarefirstaiddetails.txt");
            input.read(flight);
            System.out.println(flight);
            input.close();
        }
        catch (IOException e) {
			System.out.println("File error...");
		}

        // List <String> firstAidTypeList=new ArrayList<>();
        // firstAidTypeList.add("1} Wound Care");
        // firstAidTypeList.add("2} Burn First Aid");
        // firstAidTypeList.add("3} Fracture and Sprain First Aid");
        // firstAidTypeList.add("4} Bleeding Control");
        // firstAidTypeList.add("5} Medicines");
        // messageForChoosingList();
        // System.out.println("   items       :   price per kg(in Rupees)   ");
        // displayingListOfItems(firstAidTypeList,5);
    }// end of first aid details
}