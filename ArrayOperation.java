import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ArrayOperation
{

    int arr[]=new int[5];
    int size=0;
    void insert(int index,int element)
        {
            if(index>size)
            {
                throw new  RuntimeException("INdex cant be more than size");
            }
            if(size==arr.length)
            {
                throw new RuntimeException("Array is full....");
            }
            for(int i=size-1;i>=index;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[index]=element;
            size++;
        }

    void remove(int index) 
    {
        if(size==0)
        {
            throw new RuntimeException("Array is empty");
        }

        for(int i=index;i<size;i++)
        {
            arr[i]=arr[i+1];
        }
        size--;
    }

    void print()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

    int search(int element)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
        }
        return -1;
    }

    void Update(int oldEl,int newEl)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==oldEl)
            {
                arr[i]=newEl;
                return;

                       }
                    }
                    
                        System.out.println("element not found");
                    

    }
    public static void main(String[] args) {
       
        ArrayOperation op=new ArrayOperation();
while(true)
{
        System.out.println("1. Insert Element");
        System.out.println("2. Remeove Element");
        System.out.println("3. Print Elements");
        System.out.println("4. Search Element");
        System.out.println("5. Update Element");
        System.out.println("6. Exit");
        Scanner sc=new Scanner(System.in);

        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter element");
                int element=sc.nextInt();
                System.out.println("Enter Index");
                int index=sc.nextInt();
                op.insert(index, element);
                break;

            case 2:
                System.out.println("Enter index");
                int indexre=sc.nextInt();
                op.remove(indexre);
                break;

            case 3:
                op.print();
                break;
            case 4:
                System.out.println("Enter element");
                int elem=sc.nextInt();
                int res=op.search(elem);
                System.out.println(res);
                break;
            case 5:
                System.out.println("Enter old element");
                int oldEl=sc.nextInt();
                System.out.println("Enter new element");
                int newEl=sc.nextInt();
                op.Update(oldEl, newEl);
                break;
            case 6:
                return;

            default:
                System.out.println("Wrong chice!!!!");


        }
    }

        

    }
}
