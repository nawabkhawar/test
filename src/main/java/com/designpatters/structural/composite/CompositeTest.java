package com.designpatters.structural.composite;

public class CompositeTest {

    public static void main(String args[]){
    Component ram = new Leaf("ram" , 2000);
    Component mouse = new Leaf("mouse" , 500);
    Component keyboard = new Leaf("keyboard" , 700);
        Component hdd = new Leaf("hdd" , 4000);
        Component processor = new Leaf("processor" , 9000);


        Composite motherBoard = new Composite("motherboard");
        Composite computer = new Composite("computer");
        Composite peri = new Composite("peri");
        Composite cpu = new Composite("cpu");

        motherBoard.addComponent(processor);
        motherBoard.addComponent(ram);
        motherBoard.addComponent(hdd);

        peri.addComponent(keyboard);
        peri.addComponent(mouse);

        cpu.addComponent(motherBoard);

        computer.addComponent(cpu);
        computer.addComponent(peri);


        computer.showPrice();






    }

}
