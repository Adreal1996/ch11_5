package ch11;

/* Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges
the list’s elements into sorted ascending order, as well as removing all duplicate values from the list. For example,
the list [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9] would become [–9, –5, 4, 7, 8, 11,
15, 27, 32] after a call to your method. Use a Set as part of your solution. */

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class opg5
{
    public static void main(String[] args)
    {
        LinkedList<Integer> liste1 = new LinkedList<>();
        liste1.add(-1);
        liste1.add(4);
        liste1.add(1);
        liste1.add(8);
        liste1.add(9);
        liste1.add(3);
        liste1.add(5);
        liste1.add(7);

        System.out.println(sortAndRemoveDuplicates(liste1));

    }

    public static Set<Integer> sortAndRemoveDuplicates(LinkedList<Integer> liste)
    {
        Set<Integer> orderedList = new TreeSet<>();
        orderedList.addAll(liste);

        return orderedList;
    }

}
