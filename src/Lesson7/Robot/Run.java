package Lesson7.Robot;

import Lesson7.Robot.hands.SamsungHand;
import Lesson7.Robot.hands.SonyHand;
import Lesson7.Robot.hands.ToshibaHand;
import Lesson7.Robot.heads.SamsungHead;
import Lesson7.Robot.heads.SonyHead;
import Lesson7.Robot.heads.ToshibaHead;
import Lesson7.Robot.legs.SamsungLeg;
import Lesson7.Robot.legs.SonyLeg;
import Lesson7.Robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IRobot robot1 = new Robot(new SonyHead(1000), new SamsungHand(250), new ToshibaLeg(450));
        robot1.action();
        System.out.println(robot1.getPrice() + " долларов стоит робот1");

        IRobot robot2 = new Robot(new ToshibaHead(900), new SonyHand(200), new SamsungLeg(550));
        robot2.action();
        System.out.println(robot2.getPrice() + " долларов стоит робот2");

        IRobot robot3 = new Robot(new SamsungHead(1100), new ToshibaHand(150), new SonyLeg(500));
        robot3.action();
        System.out.println(robot3.getPrice() + " долларов стоит робот3");


            if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
                System.out.println("robot1 самый дорогой робот");
            } else if (robot2.getPrice() > robot3.getPrice() && robot1.getPrice() > robot1.getPrice()) {
                System.out.println("robot2 самый дорогой робот");
            } else {
                System.out.println("robot3 самый дорогой робот");
            }
    }
}
