package com.designpatters.structural.composite;

import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.List;

    interface Component{
        void showPrice();
    }

    class Leaf implements Component {
        String name;
        Integer price;

        Leaf(String name, Integer price){
            this.name = name;
            this.price = price;
        }

        @Override
        public void showPrice() {
            System.out.println("leaf:" + name + "," + "price:" + price);
        }
    }

    class Composite implements Component{
        String name;

        Composite(String name){
            this.name = name;
        }

        List<Component> componentList = new ArrayList<>();

        void addComponent(Component com){
            componentList.add(com);
        }

        @Override
        public void showPrice() {
            System.out.println("Component:" + name);
            for(Component c : componentList){
                c.showPrice();
                //System.out.prinln("");
            }
        }
    }