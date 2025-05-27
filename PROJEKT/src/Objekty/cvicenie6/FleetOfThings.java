package Objekty.cvicenie6;

public class FleetOfThings {

    public static void main(String[] args) {
        // - You have the Thing class
        // - You have the Fleet class
        // - You have the FleetOfThings class with a main() method
        // - Download those, use those
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch


        Fleet fleet = new Fleet();
        Thing vec1 = new Thing("Get milk");
        Thing vec2 = new Thing("Remove the obstacle");
        Thing vec3 = new Thing("Stand up");
        Thing vec4 = new Thing("Eat lunch");

        fleet.add(vec1);
        fleet.add(vec2);
        fleet.add(vec3);
        fleet.add(vec4);

        vec3.complete();
        vec4.complete();

        System.out.println(fleet);
    }
}
