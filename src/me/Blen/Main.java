package me.Blen;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Item> itemsList = new ArrayList<Item>();

    public static void main(String[] args) {
	// write your code here

        Item item = new Item();
        item.setItemId(1234);
        item.setName("Book");
        item.setCatagory("other");
        item.setLost(false);
        itemsList.add(item);


        Item item2 = new Item();
        item2.setItemId(4321);
        item2.setName("Bottle");
        item2.setCatagory("other");
        item2.setLost(false);
        itemsList.add(item2);


        String choice;

        do{
            System.out.println("Hello, would you like to add a lost or found item? If yes put 'yes' in the line below or if you would like to see list of items put 'list' or to remove an item 'remove' ");

            choice = scan.nextLine();

            if(choice.equalsIgnoreCase("yes"))
            {
                addItem();

            } else if(choice.equalsIgnoreCase("list")){

                listItem();
                System.out.println("Put the item you want ");
                String lostName = scan.nextLine();

                for(Item eachItem : itemsList){
                    if(eachItem.getName().equalsIgnoreCase(lostName)){
                        System.out.println("is the item lost or found? If it is lost write true if not false");
                        Boolean lostValue = scan.nextBoolean();
                        scan.nextLine();
                        eachItem.setLost(lostValue);
                    }
                }
            }else if(choice.equalsIgnoreCase("remove")){
                remove();
            }
            choice= "yes";
        }while(choice.equalsIgnoreCase("yes"));
    }

    //additem
    public static void addItem(){
        Item userItem = new Item();

        System.out.println("Please enter the item id");
        int userItemId = scan.nextInt();
        scan.nextLine();
        userItem.setItemId(userItemId);

        System.out.println("Please enter the item Name");
        String userItemString =scan.nextLine();
        userItem.setName(userItemString);

        System.out.println("Please enter the category of the item");
        String userItemCategory = scan.nextLine();
        userItem.setCatagory(userItemCategory);

        System.out.println("Is this item lost, write true or false?");
        Boolean userItemLost =scan.nextBoolean();
        scan.nextLine();

        itemsList.add(userItem);
        System.out.println("Congratulation! you have added " + userItem.getName());

    }
    //show list of items
    public static void listItem(){
        int countClothing =0;
        int countPet=0;
        int countOther=0;
        System.out.println("Here are the list of items: ");
        for(Item eachItem: itemsList){
                if(eachItem.getCatagory().equalsIgnoreCase("clothing")){
                    countClothing = countClothing + 1;
                }else if(eachItem.getCatagory().equalsIgnoreCase("pet")){
                    countPet = countPet + 1;
                }else if(eachItem.getCatagory().equalsIgnoreCase("other")){
                    countOther= countOther + 1;
                }

            System.out.println("\n The item id is " + eachItem.getItemId() + "\n The name of the item is " + eachItem.getName() + "\n The category of the item is " + eachItem.getCatagory()
            +" \n and its lost value is " + eachItem.getLost());
        }
        System.out.println("The total count of items are: " + "\n\tThere are " + countClothing + " clothing items." + "\n\tThere are " + countPet + " clothing items." + "\n\tThere are " + countOther + " other items " );

    }

    //remove item
    public static void remove(){
        for (Item eachItem : itemsList){
            System.out.println("Please enter the id of the item you would like to delete");
            int removeItemId = scan.nextInt();
            scan.nextLine();
            if(eachItem.getItemId()==removeItemId){
                itemsList.remove(eachItem);
            }

            System.out.println("Congrats, you have successfully deleted the item " + eachItem.getName());
        }
    }
}
