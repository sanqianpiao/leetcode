package others;

import java.util.*;

/**
 * Cities connected by roads [1,2], [2,3], [3,4], [5,6],
 * Two connected cities form a continents, how many continents do we have?
 * You can assume all input is valid two-element array, but the element order is not sorted.
 */
public class CitiesAndContinents {

    public int continents(List<int[]> roads) {
        for(int[] road : roads) {
            if(road[0] > road[1]) {
                int tmp = road[0];
                road[0] = road[1];
                road[1] = tmp;
            }
        }
        Collections.sort(roads, (o1, o2) -> o1[0] - o2[0]);

        List<Set<Integer>> sets = new ArrayList<>();
        for(int[] road : roads) {
            boolean found = false;
            for(Set<Integer> set : sets) {
                if(set.contains(road[0]) || set.contains(road[1])) {
                    found = true;
                    set.add(road[0]);
                    set.add(road[1]);
                    break;
                }
            }
            if(found == false) {
                Set<Integer> newset = new HashSet<>();
                newset.add(road[0]);
                newset.add(road[1]);
                sets.add(newset);
            }
        }

        return sets.size();
    }
}
