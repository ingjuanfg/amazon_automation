package co.com.amazon.questions;

public class ExistProducts{

    public static InCart inCar(){
        return new InCart();
    }

    public static InTheCart inTheCar(){
        return new InTheCart();
    }

    public static AddedInCart addedInTheCar(){
        return new AddedInCart();
    }

}
