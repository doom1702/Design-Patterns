package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    // private final Robot robot;
    // private final Person person;
    // private final Dog dog;
    // private final Cat cat;

    // public Sun(Robot robot, Person person, Dog dog, Cat cat) {
    //     this.robot = robot;
    //     this.person = person;
    //     this.dog = dog;
    //     this.cat = cat;
    // }

    private List<Character_Observer> observers ;

    public Sun(Robot robot, Person person, Dog dog, Cat cat) {
    }
    public void addObserver(Character_Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Character_Observer observer){
        observers.remove(observer);
    }

    public void noitfyObservers(boolean isSunRisen){
        for(Character_Observer observer:observers){
            if (observer.isOutdoors()){
                if (isSunRisen){
                    observer.notifySunRose();
                }
                else{
                observer.notifySunSet();
                }
            }
        }
    }

    public boolean isUp() {
        return isUp;
    }

    public void set(){
        isUp = false;
        noitfyObservers(isUp);
    }
    public void rise(){
        isUp = true;
        noitfyObservers(isUp);
    }

    // public void set() {
    //     isUp = false;

    //     if (robot.isOutdoors()) {
    //         robot.notifySunSet();
    //     }

    //     if (person.isOutdoors()) {
    //         person.notifySunSet();
    //     }

    //     if (dog.isOutdoors()) {
    //         dog.notifySunSet();
    //     }

    //     if (cat.isOutdoors()) {
    //         cat.notifySunSet();
    //     }
    // }

    // public void rise() {
    //     isUp = true;

    //     if (robot.isOutdoors()) {
    //         robot.notifySunRose();
    //     }

    //     if (person.isOutdoors()) {
    //         person.notifySunRose();
    //     }

    //     if (dog.isOutdoors()) {
    //         dog.notifySunRose();
    //     }

    //     if (cat.isOutdoors()) {
    //         cat.notifySunRose();
    //     }
    // }
}