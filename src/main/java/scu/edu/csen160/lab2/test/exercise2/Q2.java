package scu.edu.csen160.lab2.test.exercise2;

class Asset { // etend something?
    // ToDo: Implement powerDown

}

class EmergencyLight extends Asset { // what to extend?
    // ToDo: Implement powerDown

}

class PersonalComputer extends Asset { // what to extend?
    // ToDo: Implement powerDown

}

class TV extends Asset { // what to extend?
    //ToDo: Implement powerDown

}

class BuildingManager {
    Asset things[] = new Asset[24];
    int numItems = 0;

    public void powerDownAtNight() {
        for (int i = 0; i < things.length; i++)
            if (this.things[i] != null)
                this.things[i].powerDown();
    }

    // Add an Asset to this building
    public void add(Asset thing) {
        this.things[this.numItems] = thing;
        this.numItems=this.numItems+1;
    }
}

public class Q2 {
    public static void q2() {
        BuildingManager b1 = new BuildingManager();

        b1.add(new EmergencyLight());
        b1.add(new PersonalComputer());
        b1.add(new TV());
        b1.powerDownAtNight();
    }
}