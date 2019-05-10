package com.company;

class Car {
    private static int numOfCars;
    private static final int NUN_OF_WHEELS = 4;
    private static int getNumOfCars() {   //Объявление статического метода getNumOfCars
        return numOfCars;
    }
    public static void main(String[] args){
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();
        Car myCar4 = new Car();
        numOfCars++;
        int numOfCars = Car.getNumOfCars();    //Вызов статического метода getNumOfCars
        System.out.println(numOfCars);
       System.out.println(myCar2.getNumOfCars());
        System.out.println(myCar3.getNumOfCars());
        System.out.println(myCar1);
        System.out.println(myCar4);
       /*Car(int maxSpeed){
            this.maxSpeed = maxSpeed;
            }
       Car myCar = new Car();
        myCar.test(100);
        public Car(){}
        */
    }

}
