import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNAHealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfGenes = in.nextInt();
        List<String> beneficialGenes = new LinkedList<>();
        for (int i = 0; i < numberOfGenes; i++) {
            beneficialGenes.add(in.next());
        }

        List<Integer> heathOfGenes= new ArrayList<>();
        for (int i = 0; i < numberOfGenes; i++) {
            heathOfGenes.add(in.nextInt());
        }
        int strands = in.nextInt();

        List<Integer> totalHealth = new LinkedList<>();
        for (int i = 0; i < strands; i++) {
            int first = in.nextInt();
            int last = in.nextInt();
            String strand = in.next();
            int health = 0;

            for (int j = first; j <= last; j++) {
                /*if (strand.contains(beneficialGenes.get(j))) {
                    int totalGenes = strand.length() - strand.replaceAll(beneficialGenes.get(j),"").length();
                    health += totalGenes * heathOfGenes.get(j);
                }*/
                Pattern pattern = Pattern.compile(beneficialGenes.get(j));
                Matcher m = pattern.matcher(strand);
                while (m.find()) {
                    health += heathOfGenes.get(j);
                }
            }
            totalHealth.add(health);
        }
        System.out.println(Collections.min(totalHealth) + " " + Collections.max(totalHealth));
    }
}
