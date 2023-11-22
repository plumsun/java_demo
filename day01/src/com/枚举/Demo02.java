package com.枚举;

public class Demo02 {

    public static void main(String[] args) {
        String[] array = {"abc","def"};
        Teacher[] array2 = {};
        Season[] values = {Season.SPRING,Season.SUMMER};

        System.out.println("--------------");

        MySeason mySeason = MySeason.SUMMER;
        System.out.println(mySeason.month);//6
    }
}
class MySeason0{
    public static final MySeason0 SPRING = new MySeason0(3);
    public static final MySeason0 SUMMER = new MySeason0(6);
    int month;

    private MySeason0(int month){
        this.month = month;
    }
}
enum MySeason{

    SPRING(3),SUMMER(6);

    int month;
    //默认用private修饰
    private MySeason(int month){
        this.month = month;
    }

}