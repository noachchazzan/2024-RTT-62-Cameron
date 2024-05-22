package JavaMadeMeDoIt;
import java.io.*;
import java.util.*;

class Pair {
    String first;
    String second;

    Pair(String first, String second) {
        if(first.compareTo(second)<0) {
            this.first=first;
            this.second=second;
        } else {
            this.first=second;
            this.second=first;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null || getClass() != o.getClass()){
            return false;
        }
        Pair pair = (Pair) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }
    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
public class JavaHashSet {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Set<Pair> pairSet=new HashSet<>();
        int n=cin.nextInt();
        cin.nextLine(); // Consume the newline char after the integer input
        for(int i = 0; i < n; i++) {
            String first = cin.next();
            String second = cin.next();
            cin.nextLine();
            Pair pair = new Pair(first, second);
            pairSet.add(pair);

            System.out.println(pairSet.size());
        }
        cin.close();
    }
}
/*
import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Set<String> pairSet = new HashSet<>();

        int n = cin.nextInt();
        cin.nextLine();

        for(int i=0;i<n;i++){
            String first = cin.next();
            String second = cin.next();
            cin.nextLine();
            String pair = first+" "+second;
            pairSet.add(pair);
            System.out.println(pairSet.size());
        }
        cin.close();
    }
}
 */

/*
import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Set<String> pairSet = new HashSet<>();

        int n = Integer.parseInt(cin.nextLine());

        for(int i=0;i<n;i++){
            String pair = cin.nextLine();
            pairSet.add(pair);
            System.out.println(pairSet.size());
       }
       cin.close();
}
}
 */