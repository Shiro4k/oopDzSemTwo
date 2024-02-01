package org.example;

public class Robot extends Parent{
    private double maxHeighJump;
    private double maxDistance;
    private int status;
    static int counter;

    public Robot(String name, double maxHeighJump, double maxDistance) {
        super(name, maxHeighJump, maxDistance);
        this.maxHeighJump = maxHeighJump;
        this.maxDistance = maxDistance;
        counter++;
    }

    @Override
    void run() {
        System.out.println(super.name + " принял участие в гонке!");
        status = 1;
    }

    @Override
    void runThrough(double distance) {
        if(status != 0) {
            if (distance <= maxDistance) {
                System.out.println(super.name + " преодолел препятствие в " + distance + " метров!");

            } else {
                System.out.println(super.name + " выбывает из гонки!");
                status = 0;
            }
        }
    }

    @Override
    void jump(double distance) {
        if(status != 0) {
            if (distance <= maxHeighJump) {
                System.out.println(super.name + " перепрыгнул " + distance + " метра!");
            } else {
                System.out.println(super.name + " выбывает из гонки!");
                status =0;
            }
        }
    }
    @Override
    void endRace() {
        if(status == 1) {
            System.out.println(super.name + " успешно окончил гонку!");
        } else {
            System.out.println(super.name + "у нужны улучшения!");
        }
    }
}
