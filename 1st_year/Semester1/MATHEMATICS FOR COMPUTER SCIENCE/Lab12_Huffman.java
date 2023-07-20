import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.io.File;
import java.io.FileNotFoundException;

class HuffmanNode {
    int data;
    char c;

    HuffmanNode left;
    HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
    }
}

public class Lab12_Huffman {
    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null) {
            System.out.println("ascii(" + (int) root.c + ") : " + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void countLengths(HuffmanNode root, int[] charBitLength, int length) {
        if (root.left == null && root.right == null) {
            charBitLength[(int) root.c] = length;
            return;
        }
        countLengths(root.left, charBitLength, length + 1);
        countLengths(root.right, charBitLength, length + 1);
    }

    static void buildCharFreqFromFile(char[] charArray, int[] charFreq) {
        Scanner file = new Scanner(System.in);
        String filename = file.nextLine();
        //int NumOfChar = 0;
        file.close();

        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);  
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // for(int i = 0; i < data.length(); i++){
                //     data.charAt(0);
                //     NumOfChar ++;
                // }
                System.out.println(data);
            }
            myReader.close();
            //System.out.println(NumOfChar);
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 


        // remove code below *********************
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) i;
            charFreq[i] = 1;
            System.out.println(charFreq[i]);
        }
        // remove code above *********************
        // open file and build static
        // your code here *********************

        // end your code *********************
    }

    // main function
    public static void main(String[] args) {
        char[] charArray = new char[256];
        int[] charFreq = new int[256];
        buildCharFreqFromFile(charArray, charFreq);
        int n = charArray.length;

        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator());

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();

            hn.c = charArray[i];
            hn.data = charFreq[i];

            hn.left = null;
            hn.right = null;

            q.add(hn);
        }

        HuffmanNode root = null;

        while (q.size() > 1) {
            HuffmanNode x = q.peek();
            q.poll();

            HuffmanNode y = q.peek();
            q.poll();

            HuffmanNode f = new HuffmanNode();

            f.data = x.data + y.data;
            f.left = x;
            f.right = y;
            q.add(f);
        }
        root = q.peek();

        int[] charBitLength = new int[n];
        printCode(root, "");
        countLengths(root, charBitLength, 0);

        int sumBit = 0;
        int sumChar = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("ascii(" + i + "): " + charBitLength[i] + " ");
            sumBit += (charBitLength[i] * charFreq[i]);
            sumChar += charFreq[i];
        }
        System.out.println("Average bits per char: " + sumBit / (double) sumChar);

    }
}

// This code is contributed by Kunwar Desh Deepak Singh
