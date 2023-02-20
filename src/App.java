import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<CrossProductElements> cpArr = new ArrayList<CrossProductElements>();
        arr.add(5);
        arr.add(3);
        arr.add(10);
        arr.add(7);

        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                if(arr.get(i).compareTo(arr.get(j)) == 0 && j + 1 < arr.size()) {
                    cpArr.add(new CrossProductElements(arr.get(i), arr.get(j + 1)));
                    j++;
                } else if(arr.get(i).compareTo(arr.get(j)) == 0 && j + 1 == arr.size()) {
                    break;
                }
                else {
                    cpArr.add(new CrossProductElements(arr.get(i), arr.get(j)));
                }
            }
        }

        int k = 2;

        System.out.println("\n" + "Unsorted Array" + "\n");

        for(int i = 0; i < cpArr.size(); i++) { // prints out cross products
            System.out.println(cpArr.get(i).i + ", " + cpArr.get(i).j);
        }

        Collections.sort(cpArr, new CrossProductSort()); // sorts array by cross products

        System.out.println("\n" + "Sorted Array" + "\n");

        for(int i = 0; i < cpArr.size(); i++) { // prints out sorted cross products
            System.out.println(cpArr.get(i).i + ", " + cpArr.get(i).j);
        }

        System.out.println("\n"+ "Kth term: " + cpArr.get(k).i + ", " + cpArr.get(k).j);
    }
}

// makes the individual crossProducts
class CrossProductElements {
    int i, j;

    CrossProductElements(int i, int j) { // constructor
        this.i = i;
        this.j = j;
    }

    public int getI() { // returns the x1
        return i;
    }

    public int getJ() { // returns the x2
        return j;
    }

    public static int getCrossProduct(int i, int j) {
        return i * j;
    }

    public static ArrayList<CrossProductElements> sort(ArrayList<CrossProductElements> cpArr) {
        return cpArr;
    }
}

class CrossProductSort implements Comparator<CrossProductElements> {

    public int compare(CrossProductElements a, CrossProductElements b) {
        int cpA = a.i * a.j;
        int cpB = b.i * b.j;
        return Integer.compare(cpA, cpB);
    }
    
}
