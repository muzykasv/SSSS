package com.company;

class Car {
    private static int numOfCars;
    public static final int NUN_OF_WHEELS = 4;

    public static void main(String[] args){
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();
        numOfCars++;
        int numOfCars = Car.getNumOfCars();    //Вызов статического метода getNumOfCars
        System.out.println(Car.getNumOfCars());
       System.out.println(myCar2.getNumOfCars());

       /*Car(int maxSpeed){
            this.maxSpeed = maxSpeed;
            }
       Car myCar = new Car();
        myCar.test(100);
        public Car(){}
        */
    }
    private static int getNumOfCars() {   //Объявление статического метода getNumOfCars
        return numOfCars;
    }
}
