package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        // Wall objeleri
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        // Ceiling
        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);

        // Bed
        Bed bed = new Bed("Modern", 2, 60, 1, 1);

        // Lamp
        Lamp lamp = new Lamp(LampType.NEON, true, 5);

        // Wardrobe
        Wardrobe wardrobe = new Wardrobe(100, 200, 75.5);

        // Carpet
        Carpet carpet = new Carpet(300, 200, PaintColor.RED);

        // Bedroom
        Bedroom bedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);

        // Metodları test et
        System.out.println("Testing Bedroom: " + bedroom.getName());

        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();

        bedroom.getCeiling().create();

        bedroom.getBed().make();

        bedroom.getLamp().turnOn();

        bedroom.getWardrobe().add();

        bedroom.getCarpet().lying();

        // Getter metodlarını test
        System.out.println("Bed pillows: " + bedroom.getBed().getPillows());
        System.out.println("Bed height: " + bedroom.getBed().getHeight());
        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Lamp battery: " + bedroom.getLamp().isBattery());
        System.out.println("Lamp global rating: " + bedroom.getLamp().getGlobalRating());
        System.out.println("Wardrobe width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());
        System.out.println("Ceiling height: " + bedroom.getCeiling().getHeight());
    }
}
