import java.util.*;

public class Birds implements Comparable<Birds> {
    private int type;
    private int count;
    public Birds(int type, int count)
    {
        setType(type);
        setCount(count);
    }

    public void setType(int type) {
        this.type = type;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getType(){
        return this.type;
    }
    @Override
    public int compareTo(Birds other) {
        if (this.count > other.count){
            return -1;
        }
        else if (this.count < other.count){
            return 1;
        }
        else {
            return other.type - this.type;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] birds = new int[count];
        for (int i = 0; i < birds.length; i++) {
            birds[i] = in.nextInt();
        }

        Birds type1 = new Birds(1,0);
        Birds type2 = new Birds(2,0);
        Birds type3 = new Birds(3,0);
        Birds type4 = new Birds(4,0);
        Birds type5 = new Birds(5,0);

        for (int i = 0; i < birds.length; i++)
        {
            int birdId = birds[i];
            switch (birdId){
                case 1:
                    birdId = 1;
                    type1.count++;
                    break;
                case 2:
                    birdId = 2;
                    type2.count++;
                    break;
                case 3:
                    birdId = 3;
                    type3.count++;
                    break;
                case 4:
                    birdId = 4;
                    type4.count++;
                    break;
                case 5:
                    birdId = 5;
                    type5.count++;
                    break;
            }
        }
        int max = 0;
        int maxCount = 0;
        PriorityQueue<Birds> sortedBirds = new PriorityQueue<>();
        sortedBirds.add(type1);
        sortedBirds.add(type2);
        sortedBirds.add(type3);
        sortedBirds.add(type4);
        sortedBirds.add(type5);

        System.out.println(sortedBirds.peek().getType());

    }


}
