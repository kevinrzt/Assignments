/**
 * Created by kevinxavier on 21/11/16.
 */
import java.util.*;

class shop
{
    private String title;
    private String des;
    private double price;

    public void add(String title,String des,double price)
    {   System.out.println("Enterd Add");
        this.title=title;
        this.des=des;
        this.price=price;
    }

    public double Summ(double Sum)
    {System.out.println("Enterd sum");
        Sum=Sum+this.price;
        System.out.println("Sum is "+Sum);
        return Sum;
    }

    public void search(String item)
    {System.out.println("Enterd search");
        if(this.title.equals(item))
        {
            System.out.println("Item found");
            System.out.println("Title: "+this.title);
            System.out.println("Description: "+this.des);
            System.out.println("Price: "+this.price);
        }

    }

    public void replace(String check,String title1,String des1,double price1)
    {System.out.println("Enterd replace");
        if(this.title.equals(check))
        {
            this.title=title1;
            this.des=des1;
            this.price=price1;
            System.out.println("Updated");
        }

    }
    public int remove(String A)
    {System.out.println("Enterd remove");
        int X=0;
        if(this.title.equals(A))
        {
            X=1;

        }
        return X;
    }
    public void price(String pri)
    {System.out.println("Enterd price");
        if(this.title.equals(pri))
        {
            System.out.println("The price of "+this.title+" is "+this.price);
        }
    }
}
public class testerclass
{   public static void main(String args[])
    {
        int i=0,j=0,k=0,l=0,i1,j1,k1,l1,X,choice=0;
        double Sum=0,input3;
        String category,input,input1,input2;
        shop Electronics[]=new shop[100];
        shop Clothes[]=new shop[100];
        shop Confectionaries[]=new shop[100];
        shop Stationary[]=new shop[100];
        Scanner S=new Scanner(System.in);
        while(choice!=7)
        {
            System.out.println("Enter the choice\nPress 1 to add an item\nPress 2 to search for an item\nPress 3 to Replace an item\nPress 4 to remove an item\nPress 5 to find price of an item\nPress 6 to remove all the items in category\nPress 7 to exit");
            choice=S.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Electronics,Clothes,Confectionaries,Stationary are the categories.\nEnter the category");
                    category=S.next();
                    if(category.equals("Electronics"))
                    {
                        Electronics[i]=new shop();
                        System.out.println("Enter the details.item name,description and price");
                        Electronics[i].add(S.next(),S.next(),S.nextDouble());
                        Sum=Electronics[i].Summ(Sum);
                        i++;
                    }
                    else if(category.equals("Clothes"))
                    {
                        Clothes[j]=new shop();
                        System.out.println("Enter the details.item name,description and price");
                        Clothes[j].add(S.next(),S.next(),S.nextDouble());
                        Sum=Clothes[j].Summ(Sum);
                        j++;

                    }
                    else if(category.equals("Confectionaries"))
                    {
                        Confectionaries[k]=new shop();
                        System.out.println("Enter the details.item name,description and price");
                        Confectionaries[k].add(S.next(),S.next(),S.nextDouble());
                        Sum=Confectionaries[k].Summ(Sum);
                        k++;
                    }
                    else
                    {
                        Stationary[l]=new shop();
                        System.out.println("Enter the details.item name,description and price");
                        Stationary[l].add(S.next(),S.next(),S.nextDouble());
                        Sum=Stationary[l].Summ(Sum);
                        l++;
                    }
                    break;
                case 2:
                    System.out.println("Electronics,Clothes,Confectionaries,Stationary are the categories.\nEnter the category");
                    category=S.next();
                    if(category.equals("Electronics"))
                    {
                        System.out.println("Enter the item to be checked");
                        input=S.next();
                        System.out.println("Ente"+i);
                        for(i1=0;i1<i;i1++)
                        {
                            Electronics[i1].search(input);

                        }
                        System.out.println("i1 is  "+i1);

                        if(i1==i)
                        {
                            System.out.println("Not found");
                        }
                    }
                    else if(category.equals("Clothes"))
                    {
                        System.out.println("Enter the item to be checked");
                        input=S.next();
                        for(j1=0;j1<j;j1++)
                        {
                            Clothes[j1].search(input);


                        }
                        if(j1==j)
                        {
                            System.out.println("Not found");
                        }

                    }
                    else if(category.equals("Confectionaries"))
                    {
                        System.out.println("Enter the item to be checked");
                        input=S.next();
                        for(k1=0;k1<k;k1++)
                        {
                            Confectionaries[k1].search(input);

                        }
                        if(k==k1)
                        {
                            System.out.println("Not found");
                        }
                    }
                    else
                    {
                        System.out.println("Enter the item to be checked");
                        input=S.next();
                        for(l1=0;l1<l;l++)
                        {
                            Stationary[l1].search(input);

                        }
                        if(l1==l)
                        {
                            System.out.println("Not found");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Electronics,Clothes,Confectionaries,Stationary are the categories.\nEnter the category");
                    category=S.next();
                    if(category.equals("Electronics"))
                    {
                        System.out.println("Enter the item to be replaced and detail of item to be entered (title ,description and price)");
                        input=S.next();
                        input1=S.next();
                        input2=S.next();
                        input3=S.nextDouble();
                        for(i1=0;i1<i;i1++)
                        {
                            Electronics[i1].replace(input,input1,input2,input3);
                        }
                        if(i1==i)
                        {
                            System.out.println("Not found");
                        }
                    }
                    else if(category.equals("Clothes"))
                    {
                        System.out.println("Enter the item to be replaced and detail of item to be entered (title ,description and price)");
                        input=S.next();
                        input1=S.next();
                        input2=S.next();
                        input3=S.nextDouble();
                        for(j1=0;j1<j;j1++)
                        {
                            Clothes[j1].replace(input,input1,input2,input3);
                        }
                        if(j1==j)
                        {
                            System.out.println("Not found");
                        }

                    }
                    else if(category.equals("Confectionaries"))
                    {
                        System.out.println("Enter the item to be replaced and detail of item to be entered (title ,description and price)");
                        input=S.next();
                        input1=S.next();
                        input2=S.next();
                        input3=S.nextDouble();
                        for(k1=0;k1<k;k1++)
                        {
                            Confectionaries[k1].replace(input,input1,input2,input3);
                        }
                        if(k1==k)
                        {
                            System.out.println("Not found");
                        }
                    }
                    else
                    {
                        System.out.println("Enter the item to be replaced and detail of item to be entered (title ,description and price)");
                        input=S.next();
                        input1=S.next();
                        input2=S.next();
                        input3=S.nextDouble();
                        for(l1=0;l1<l;l++)
                        {
                            Stationary[l1].replace(input,input1,input2,input3);
                        }
                        if(l1==l)
                        {
                            System.out.println("Not found");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Electronics,Clothes,Confectionaries,Stationary are the categories.\nEnter the category");
                    category=S.next();
                    if(category.equals("Electronics"))
                    {
                        System.out.println("Enter the item to be removed");
                        input=S.next();
                        for(i1=0;i1<i;i1++)
                        {
                            X=Electronics[i1].remove(input);
                            if(X==1)
                            {
                                Electronics[i1]=null;
                            }
                        }
                        if(i1==i)
                        {
                            System.out.println("Not found");
                        }

                    }
                    else if(category.equals("Clothes"))
                    {
                        System.out.println("Enter the item to be removed");
                        input=S.next();
                        for(j1=0;j1<j;j1++)
                        {
                            X=Clothes[j1].remove(input);
                            if(X==1)
                            {
                                Clothes[j1]=null;
                            }
                        }
                        if(j1==j)
                        {
                            System.out.println("Not found");
                        }

                    }
                    else if(category.equals("Confectionaries"))
                    {
                        System.out.println("Enter the item to be removed");
                        input=S.next();
                        for(k1=0;k1<k;k1++)
                        {

                            X=Confectionaries[k1].remove(input);
                            if(X==1)
                            {
                                Confectionaries[k1]=null;
                            }
                        }
                        if(k1==k)
                        {
                            System.out.println("Not found");
                        }
                    }
                    else
                    {
                        System.out.println("Enter the item to be removed");
                        input=S.next();
                        for(l1=0;l1<l;l++)
                        {

                            X=Stationary[l1].remove(input);
                            if(X==1)
                            {
                                Stationary[l1]=null;
                            }
                        }
                        if(l1==l)
                        {
                            System.out.println("Not found");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Electronics,Clothes,Confectionaries,Stationary are the categories.\nEnter the category");
                    category=S.next();
                    if(category.equals("Electronics"))
                    {
                        System.out.println("Enter the item whose price is to be known");
                        input=S.next();
                        for(i1=0;i1<i;i1++)
                        {
                            Electronics[i1].price(input);

                        }
                        if(i1==i)
                        {
                            System.out.println("Not found");
                        }

                    }
                    else if(category.equals("Clothes"))
                    {
                        System.out.println("Enter the item whose price is to be known");
                        input=S.next();
                        for(j1=0;j1<j;j1++)
                        {
                            Clothes[j1].price(input);

                        }
                        if(j1==j)
                        {
                            System.out.println("Not found");
                        }

                    }
                    else if(category.equals("Confectionaries"))
                    {
                        System.out.println("Enter the item whose price is to be known");
                        input=S.next();
                        for(k1=0;k1<k;k1++)
                        {

                            Confectionaries[k1].price(input);

                        }
                        if(k1==k)
                        {
                            System.out.println("Not found");
                        }
                    }
                    else
                    {
                        System.out.println("Enter the item whose price is to be known");
                        input=S.next();
                        for(l1=0;l1<l;l++)
                        {

                            Stationary[l1].price(input);

                        }
                        if(l1==l)
                        {
                            System.out.println("Not found");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Electronics,Clothes,Confectionaries,Stationary are the categories.\nEnter the category");
                    category=S.next();
                    if(category.equals("Electronics"))
                    {
                        for(i1=0;i1<i;i1++)
                        {
                            Electronics[i1]=null;

                        }

                    }
                    else if(category.equals("Clothes"))
                    {
                        for(j1=0;j1<j;j1++)
                        {
                            Clothes[j1]=null;

                        }

                    }
                    else if(category.equals("Confectionaries"))
                    {
                        for(k1=0;k1<k;k1++)
                        {

                            Confectionaries[k1]=null;

                        }
                    }
                    else
                    {
                        for(l1=0;l1<l;l++)
                        {

                            Stationary[l1]=null;

                        }
                    }
                case 7:
                    System.exit(0);
                    break;


            }
        }
    }
}


    /*There are various items available in a shop. The items are Electronic items, Clothes,
    Confectioneries, Stationary, etc.,Each item has a title, description and a price. Build
    a tester class where you can add various items to the shop and ask the shop to give you
    the total price, search for a given item, replace an item, remove an item, tell you the
     price of an individual item, remove all items of specific category.*/